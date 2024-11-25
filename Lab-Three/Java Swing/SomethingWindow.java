import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SomethingWindow extends JFrame
{
    public SomethingWindow()
    {
        super("This is my application");
        JPanel jp=new JPanel(new FlowLayout());
        add(jp);
        setSize(320,150);
        setVisible(true);
        
        JButton aButton = new JButton("Push me");
        jp.add(aButton);

    }
    public static void main(String[] args)
    { 
        new SomethingWindow();
    }
}
