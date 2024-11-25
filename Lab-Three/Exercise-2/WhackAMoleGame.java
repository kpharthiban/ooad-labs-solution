import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class WhackAMoleGame extends JFrame {
    private JPanel gridPanel, controlPanel;
    private JButton startButton;
    private JLabel timerLabel;
    private JButton[] gridButtons;
    private Timer moleTimer;
    private int hits = 0, timeLeft = 60;
    private Random random = new Random();

    public WhackAMoleGame() {
        // JFrame setup
        setTitle("Whack-a-Mole");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Control Panel
        controlPanel = new JPanel(new BorderLayout());
        startButton = new JButton("Start");
        timerLabel = new JLabel("Time: 60", SwingConstants.CENTER);
        controlPanel.add(startButton, BorderLayout.WEST);
        controlPanel.add(timerLabel, BorderLayout.EAST);
        add(controlPanel, BorderLayout.NORTH);

        // Grid Panel
        gridPanel = new JPanel(new GridLayout(3, 3));
        gridButtons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            Color brownColor = new Color(139, 69, 19); // Brown
            button.setBackground(brownColor);
            button.setFocusPainted(false);
            button.addMouseListener(new MoleClickListener());
            gridPanel.add(button);
            gridButtons[i] = button;
        }
        add(gridPanel, BorderLayout.CENTER);

        // Start Button Action
        startButton.addActionListener(e -> startGame());

        setVisible(true);
    }

    private void startGame() {
        hits = 0;
        timeLeft = 60;
        timerLabel.setText("Time: 60");

        // Timer for mole appearance
        moleTimer = new Timer(1000, new ActionListener() {
            int moleIndex = -1;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset previous mole
                if (moleIndex >= 0) {
                    gridButtons[moleIndex].setIcon(null);
                    Color brownColor = new Color(139, 69, 19); // Brown
                    gridButtons[moleIndex].setBackground(brownColor);
                }

                // End game if timer runs out
                if (timeLeft <= 0) {
                    moleTimer.stop();
                    JOptionPane.showMessageDialog(null, "Game Over! Moles hit: " + hits);
                    return;
                }

                // Display new mole
                moleIndex = random.nextInt(9);
                ImageIcon icon = new ImageIcon("./mole.png");
                Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                gridButtons[moleIndex].setIcon(new ImageIcon(scaledImage));

                // Update timer
                timeLeft--;
                timerLabel.setText("Time: " + timeLeft);
            }
        });
        moleTimer.start();
    }

    private class MoleClickListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            if (clickedButton.getIcon() != null) {
                hits++;
                clickedButton.setIcon(null);
                Color brownColor = new Color(139, 69, 19); // Brown
                clickedButton.setBackground(brownColor);

                try
                {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./whack.wav").getAbsoluteFile( ));
                    Clip clip = AudioSystem.getClip( );
                    clip.open(audioInputStream);
                    clip.start( );
                }
                catch(Exception ex)
                {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace( );
                }
            }

            else 
            {
                try
                {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./laugh.wav").getAbsoluteFile( ));
                    Clip clip = AudioSystem.getClip( );
                    clip.open(audioInputStream);
                    clip.start( );
                }
                catch(Exception ex)
                {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace( );
                }
            }
        }
    }

    public static void main(String[] args) {
        new WhackAMoleGame();
    }
}
