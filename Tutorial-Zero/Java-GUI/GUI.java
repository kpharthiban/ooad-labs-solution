import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class GUI extends JFrame{ 
    public GUI(String title){ 
        super(title); 
        setSize(300,100); 
        Container content = getContentPane(); 
        content.setBackground(Color.white); 
        content.setLayout(new FlowLayout()); 
        content.add(new JLabel("Hello world!")); 
        content.add(new JLabel("This is my first GUI application")); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    } 
    public static void main (String args[]){ 
        JFrame nframe = new GUI("This is a GUI application"); 
        nframe.setVisible(true);  
    } 
}

/*
 * 1. What is the command to compile and run the code above? (javac GUI.java && java GUI)
 * 2. What libraries are imported to create the application? (java.awt.*, java.awt.event.*, javax.swing.*)
 * 3. What happens if you add another label <This is my first GUI application> after <Hello World!>? Try resizing the window and see what happens.  
 */