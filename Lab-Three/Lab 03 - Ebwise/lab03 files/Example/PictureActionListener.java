import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.IOException;
/**
 * ActionListener for the Picture button.
 *
 * @author Ian Chai
 * @version 8/8/2017
 */
public class PictureActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    { 
        JDialog dialog = new JDialog();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        try
        { dialog.add(new JLabel(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mmulogo.png")))));
        }
        catch (IOException ex) 
        { dialog.add(new JLabel("Couldn't load the image"));
        }
        dialog.pack();
        dialog.setLocationByPlatform(true);
        dialog.setVisible(true);
    }
}
