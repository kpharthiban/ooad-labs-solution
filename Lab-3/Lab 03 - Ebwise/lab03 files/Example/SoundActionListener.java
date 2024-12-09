import java.awt.event.*;
import java.awt.Toolkit; 
/**
 * ActionListener for the Sound button.
 *
 * @author Ian Chai
 * @version 8/8/2017
 */
public class SoundActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    { 
        Toolkit.getDefaultToolkit().beep();
    }
}
