import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.Date;

public class GUI extends JFrame{ 
    public GUI(String title){ 
        super(title); 
        setSize(440,190); 
        Container content = getContentPane(); 
        content.setBackground(Color.white); 
        content.setLayout(new FlowLayout()); 
        content.add(new JLabel("Hello world!")); 
        content.add(new JLabel("This is my first GUI application")); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    public void paint(Graphics g){ 
        Font f=new Font("Times New Roman",Font.BOLD,20); 
        g.setColor(Color.cyan); 
        g.fillRect(0,0,800,600); 
        g.setFont(f); 
        g.setColor(Color.yellow); 
        g.fillRect(15,40,400,60); 
        g.setColor(Color.pink); 
        g.fillRect(15,110,400,60); 
        g.setColor(Color.blue); 
        g.drawString("Welcome to Java Graphics",30,70); 
        g.drawString("Today is "+ new Date(),30,140); 
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