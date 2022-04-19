import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Game3");

        JLabel label = new JLabel("Santa Rescue");
        label.setBounds(220, 150, 400, 80);
        label.setFont(new Font("Arial", Font.PLAIN, 50));
        label.setForeground(Color.white);
        frame.add(label);

        JButton buttonStart = new JButton("Start");
        buttonStart.setBounds(253, 225, 253, 80);
        frame.add(buttonStart);

        JButton buttonExit = new JButton("Exit");
        buttonExit.setBounds(253, 325, 253, 80);
        frame.add(buttonExit);

        frame.setSize(800, 800);
        frame.setLayout(null);

        ///////////////////////////////////////
        // create a new Color
        Color c = new Color(128, 0, 32, 255);

        // set the color as background of panel
        frame.getContentPane().setBackground(c);

        // (gribu izmantot bg1.kpg kā fonu, bet nezinu kā...)

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonExit.addActionListener(new ActionListener() { // Exit Buttona action
            public void actionPerformed(ActionEvent a) {
                frame.dispose();
            }
        });

        buttonStart.addActionListener(new ActionListener() { // Start Buttona action
            public void actionPerformed(ActionEvent b) {
               //aiziet uz jaunu vietu, kur jauni button etc.
               // bilde ar varoni, zemak buttons un labels etc.
            }
        });

    }

}
