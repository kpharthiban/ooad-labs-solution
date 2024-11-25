import javax.swing.*;
import java.awt.*;
/**
 * Puts up a window with 3 buttons and attaches individual ActionListeners to them.
 *
 * @author Ian Chai
 * @version 8/8/2017
 */
public class ButtonExample extends JFrame
{
  
    public ButtonExample()
    {   super("Button Example");
        JPanel p = new JPanel();
        add(p);
        setSize(250,80);
        JButton pb = new JButton("Picture");
        JButton sb = new JButton("Sound");
        JButton fb = new JButton("File");
        p.add(pb);
        p.add(sb);
        p.add(fb);
        fb.addActionListener(new FileActionListener());
        pb.addActionListener(new PictureActionListener());
        sb.addActionListener(new SoundActionListener());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[]args)
    { new ButtonExample();
    }
}
