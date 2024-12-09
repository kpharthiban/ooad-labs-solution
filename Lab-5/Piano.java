import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.midi.*;

public class Piano {

    private Synthesizer synth;
    private MidiChannel[] mChannels;

    public Piano() {
        try {
            // Initialize MIDI synthesizer
            synth = MidiSystem.getSynthesizer();
            synth.open();
            mChannels = synth.getChannels();
        } catch (MidiUnavailableException e) {
            JOptionPane.showMessageDialog(null, "Unable to open MIDI.");
            return;
        }

        // Create the main frame
        JFrame frame = new JFrame("Pea-Air-Know");
        JButton[] w = new JButton[7];
        JButton[] b = new JButton[6];
        JLayeredPane panel = new JLayeredPane();
        frame.add(panel);

        int j = 0;
        for (int i = 0; i < 7; i++) {
            w[i] = new JButton();
            w[i].setBackground(Color.WHITE);
            w[i].setLocation(i * 70, 0);
            w[i].setSize(70, 300);
            w[i].setName(String.valueOf(60 + j));
            w[i].addChangeListener(this::handleStateChange);
            panel.add(w[i], 0, -1);
            if (j == 0 || j == 2 || j == 5 || j == 7 || j == 9) {
                j = j + 2;
            }
            else {
                j++;
            }
        }
        
        int[] blackKeyOffsets = {0, 1, 3, 4, 5};
        j = 0;
        for (int i = 0; i < blackKeyOffsets.length; i++) {
            b[i] = new JButton();
            b[i].setBackground(Color.BLACK);
            b[i].setLocation(35 + blackKeyOffsets[i] * 70, 0);
            b[i].setSize(70, 150);
            b[i].setName(String.valueOf(61 + j));
            b[i].addChangeListener(this::handleStateChange);
            panel.add(b[i], 1, -1);
            if (j == 0 || j == 5 || j == 7 || j == 9) {
                j = j + 2;
            }
            else if (j == 2) {
                j = j + 3;
            }
            else {
                j++;
            }
        }

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                handleKeyRelease(e);
            }
        });

        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 320);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    // Handle button state changes (pressed/released)
    private void handleStateChange(ChangeEvent e) {
        JButton button = (JButton) e.getSource();
        String noteName = button.getName();
        int note = Integer.parseInt(noteName);

        if (button.getModel().isPressed()) {
            mChannels[0].noteOn(note, 127); // Play note
            System.out.println("Note On: " + note);
        } else {
            mChannels[0].noteOff(note); // Stop note
            System.out.println("Note Off: " + note);
        }
    }

    // Map key presses to MIDI notes
    private void handleKeyPress(KeyEvent e) {
        int note = mapKeyToNote(e.getKeyCode());
        if (note != -1) {
            mChannels[0].noteOn(note, 127);
            System.out.println("Key Pressed: " + e.getKeyChar() + " -> Note On: " + note);
        }
    }

    // Map key releases to stop MIDI notes
    private void handleKeyRelease(KeyEvent e) {
        int note = mapKeyToNote(e.getKeyCode());
        if (note != -1) {
            mChannels[0].noteOff(note);
            System.out.println("Key Released: " + e.getKeyChar() + " -> Note Off: " + note);
        }
    }

    // Map keyboard keys to corresponding notes
    private int mapKeyToNote(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_A: return 60; // C
            case KeyEvent.VK_W: return 61; // C#
            case KeyEvent.VK_S: return 62; // D
            case KeyEvent.VK_E: return 63; // D#
            case KeyEvent.VK_D: return 64; // E
            case KeyEvent.VK_F: return 65; // F
            case KeyEvent.VK_T: return 66; // F#
            case KeyEvent.VK_G: return 67; // G
            case KeyEvent.VK_Y: return 68; // G#
            case KeyEvent.VK_H: return 69; // A
            case KeyEvent.VK_U: return 70; // A#
            case KeyEvent.VK_J: return 71; // B
            default: return -1;
        }
    }

    public static void main(String[] args) {
        new Piano();
    }
}
