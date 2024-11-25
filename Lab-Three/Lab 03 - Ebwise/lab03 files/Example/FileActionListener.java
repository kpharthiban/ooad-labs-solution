import java.awt.event.*;
import javax.swing.JFileChooser;
/**
 * ActionListener for the File button.
 *
 * @author Ian Chai
 * @version 8/8/2017
 */
public class FileActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    { 
        JFileChooser fc = new JFileChooser();
        int r = fc.showOpenDialog(null);
    }
}
