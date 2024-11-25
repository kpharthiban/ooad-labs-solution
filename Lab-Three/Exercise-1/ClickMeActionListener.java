import java.awt.event.*;
import javax.swing.*; 

public class ClickMeActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    { 
        JDialog dialog = new JDialog();
        JOptionPane.showMessageDialog(dialog, "B button was clicked!");
    }
}
