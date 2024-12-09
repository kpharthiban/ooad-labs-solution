import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingProgram extends JFrame {
    boolean location;
    JLabel label_x, label_y;

	public DrawingProgram(){
		// JPanel for Toolbar
        super("Painter");
		JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT));
		toolbar.add(new Label("Drag mouse to draw"));
		this.add(toolbar,BorderLayout.SOUTH);
		setSize(800,600);
		setVisible(true);
        label_x = new JLabel(""); 
        label_y = new JLabel(""); 
        toolbar.add(label_x);
        toolbar.add(label_y);

        this.add(toolbar, BorderLayout.SOUTH);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

        location = true;
        MouseXYCoordinates();

        //JPanel for Drawing Area
        JPanel drawingArea = new JPanel(new FlowLayout(FlowLayout.LEADING));
        drawingArea.setBackground(Color.WHITE);
        this.add(drawingArea, BorderLayout.NORTH);
        
	}

    //Function to 
    public void MouseXYCoordinates() {
        while (location) {
            PointerInfo pointer_info = MouseInfo.getPointerInfo();

            Point mouse_pointer = pointer_info.getLocation();

            label_x.setText("x: " + mouse_pointer.getX());
            label_y.setText("y: " + mouse_pointer.getY());
        }
    }
	
	public static void main(String[] a){
		new DrawingProgram();
	}
}
