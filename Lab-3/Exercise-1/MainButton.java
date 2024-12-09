import javax.swing.*;
import java.awt.*;

public class MainButton extends JFrame
{
    public MainButton()
    {   
        super("This is my application");
        JPanel p = new JPanel();
        add(p);
        setSize(250,80);
        JButton pmb = new JButton("Push me");
        JButton cmb = new JButton("Click me");
        JButton nb = new JButton("Nothing");
        
        p.add(pmb);
        p.add(cmb);
        p.add(nb);

        for (int x=0;x<4;x++)
        {
            JButton btnArr = new JButton("Button "+x); 
            // all buttons here named btnArr
            p.add(btnArr);
            btnArr.addActionListener(new ButtonIDActionListener());
        }
        
        //btnArr.addActionListener(new ButtonIDActionListener());
        pmb.addActionListener(new PushMeActionListener());
        cmb.addActionListener(new ClickMeActionListener());
        nb.addActionListener(new NothingActionListener());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[]args)
    { 
        new MainButton();
    }
}
