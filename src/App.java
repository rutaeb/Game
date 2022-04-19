import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.plaf.ColorChooserUI;   
public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Game3");  

        JLabel label = new JLabel("Santa Rescue");  
        label.setBounds(220,150,400,80);
        label.setFont( new Font("Arial",Font.PLAIN,50));
        label.setForeground(Color.white);
        frame.add(label);  

        JButton buttonStart = new JButton("Start");  
        buttonStart.setBounds(253,225,253,80);  
        frame.add(buttonStart); 

        JButton buttonExit = new JButton("Exit");  
        buttonExit.setBounds(253,325,253,80);  
        frame.add(buttonExit);
       
       
        frame.setSize(800, 800);  
        frame.setLayout(null);  

        JTextField R, G, B, A;
        R = new JTextField(3);
        G = new JTextField(3);
        B = new JTextField(3);
        A = new JTextField(3);
        int r, g, b, a;
 // get rgba value
 r = 128;
 g = 0;
 b = 32;
 a = 255;

 frame.add(R);
 frame.add(G);
 frame.add(B);
 frame.add(A);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

 // create a new Color
 Color c = new Color(r, g, b, a);

 // set the color as background of panel
 frame.getContentPane().setBackground(c);

        // frame.getContentPane().setBackground(Color.);
        frame.setVisible(true);  

        buttonExit.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            frame. dispose();          }  
            }); 


    }


}
