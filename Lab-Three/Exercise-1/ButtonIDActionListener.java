import java.awt.event.*;
import javax.swing.*; 

public class ButtonIDActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    { 
        String btn=e.getActionCommand();  // grab text from button
	    JOptionPane.showMessageDialog(null,btn+" was pressed!");
    }
}
