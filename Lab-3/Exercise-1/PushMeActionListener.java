import java.awt.event.*;
import javax.swing.*; 

public class PushMeActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    { 
        JDialog dialog = new JDialog();
        JOptionPane.showMessageDialog(dialog, "A button was pushed!");
    }
}
