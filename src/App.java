import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;  
import javax.swing.*;   
public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Game3");  

        JLabel label = new JLabel("Santa rescue");  
        label.setBounds(253,150,253,80);
        label.setFont( new Font("Serif",Font.PLAIN,30));
        frame.add(label);  

        JButton buttonStart = new JButton("Start");  
        buttonStart.setBounds(253,225,253,80);  
        frame.add(buttonStart); 

        JButton buttonExit = new JButton("Exit");  
        buttonExit.setBounds(253,315,253,80);  
        frame.add(buttonExit);
       
       
        frame.setSize(800, 800);  
        frame.setLayout(null);  
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);  

        buttonExit.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            frame. dispose();          }  
            }); 


    }

}
