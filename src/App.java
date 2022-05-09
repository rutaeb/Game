import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.ColorChooserUI;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Scanner;

import java.awt.Graphics;


public class App {
    public static int EHP = 1000; // Enemy Health bar
    // public static int EHPstarting = 10; // Enemy Health bar that it starts with
    public static int HP = 200; // Health bar
    public static int FPoints = 0; // FPOINTS

    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Froggie Bullying :(");
        JFrame frame2 = new JFrame("Froggie Bullying >:(");
        JFrame frameATTACK = new JFrame("Why would you attack him???");
        JFrame frameStats = new JFrame("Your stats?");

        Image backgroundImage = Toolkit.getDefaultToolkit().getImage("src/bg2.png");
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, this);
            }
        };
        panel.setSize(960, 640);
        frame.add(panel);

        JLabel label = new JLabel("Frog bullying :(");
        label.setBounds(300, 150, 400, 80);
        label.setFont(new Font("Arial", Font.BOLD, 50));
        Color c = new Color(91, 65, 76, 255);
        label.setForeground(c);
        panel.add(label);

        JButton buttonStart = new JButton("Start");
        buttonStart.setBounds(320, 225, 253, 80);
        buttonStart.setBackground(c);
        Color c2 = new Color(244, 241, 233, 255);
        buttonStart.setForeground(c2);
        panel.add(buttonStart);

        JButton buttonExit = new JButton("Exit");
        buttonExit.setBounds(320, 325, 253, 80);
        buttonExit.setBackground(c);
        buttonExit.setForeground(c2);
        panel.add(buttonExit);

        frame.setSize(960, 640);
        frame.setLayout(null);
        frame2.setSize(960, 640);
        frame2.setLayout(null);
        frameATTACK.setSize(960, 640);
        frameATTACK.setLayout(null);
        frameStats.setSize(960, 640);
        frameStats.setLayout(null);

        panel.setLayout(null);


        ///////////////////////////////////////

        // create a new Color
        // Color c = new Color(128, 0, 32, 255);
        // // set the color as background of panel
        // frame.getContentPane().setBackground(c);
        //////////////////////////////

        frame.setVisible(true);
        frame2.setVisible(false);
        frameATTACK.setVisible(false);
        frameStats.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameATTACK.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameStats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonExit.addActionListener(new ActionListener() { // Exit Buttona action

            public void actionPerformed(ActionEvent a) {
                frame.dispose();
                frame2.dispose();
            }

        });

        buttonStart.addActionListener(new ActionListener() { // Start Buttona action

            public void actionPerformed(ActionEvent b) {
                frame.setVisible(false);
                frame2.setVisible(true);

                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("src/frog.png");
                JPanel panel = new JPanel() {
                    @Override
                    public void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawImage(backgroundImage, 0, 0, this);
                    }
                };
                panel.setSize(960, 640);
                frame2.add(panel);
                panel.setLayout(null);

                JButton buttonAttack = new JButton("Attack!");
                buttonAttack.setBounds(80, 450, 253, 80);
                buttonAttack.setBackground(c);
                buttonAttack.setForeground(c2);
                panel.add(buttonAttack);

                JButton buttonCompliment = new JButton("Rise friendship");
                buttonCompliment.setBounds(353, 400, 253, 80);
                buttonCompliment.setBackground(c);
                buttonCompliment.setForeground(c2);
                panel.add(buttonCompliment);

                JButton buttonLowerFP = new JButton("Lower friendship");
                buttonLowerFP.setBounds(353, 500, 253, 80);
                buttonLowerFP.setBackground(c);
                buttonLowerFP.setForeground(c2);
                panel.add(buttonLowerFP);

                JButton buttonMenu = new JButton("Menu");
                buttonMenu.setBounds(626, 450, 253, 80);
                buttonMenu.setBackground(c);
                buttonMenu.setForeground(c2);
                panel.add(buttonMenu);

                JButton buttonCheck = new JButton("Stats");
                buttonCheck.setBounds(626, 540, 100, 30);
                buttonCheck.setBackground(c);
                buttonCheck.setForeground(c2);
                panel.add(buttonCheck);

                buttonMenu.addActionListener(new ActionListener() { // Menu Buttona action

                    public void actionPerformed(ActionEvent b) {
                        frame2.setVisible(false);
                        frame.setVisible(true);

                    }
                });

                JLabel label5 = new JLabel();
                label5.setBounds(20, 50, 900, 60);
                label5.setFont(new Font("Arial", Font.PLAIN, 45));
                label5.setForeground(Color.blue);
                frameStats.add(label5);

                JLabel label = new JLabel("You attack Froggie!");
                label.setBounds(20, 50, 900, 60);
                label.setFont(new Font("Arial", Font.BOLD, 45));
                label.setForeground(Color.RED);
                frameATTACK.add(label);

                Color c = new Color(91, 65, 76, 255);

                JLabel labelResult = new JLabel();
                labelResult.setBounds(40, 80, 920, 60);
                labelResult.setFont(new Font("Arial", Font.PLAIN, 30));
                labelResult.setForeground(c);
                frameATTACK.add(labelResult);

                JLabel labelResult2 = new JLabel();
                labelResult2.setBounds(20, 110, 920, 60);
                labelResult2.setFont(new Font("Arial", Font.PLAIN, 30));
                labelResult2.setForeground(c);
                frameATTACK.add(labelResult2);

                JLabel labelResponse = new JLabel();
                labelResponse.setBounds(20, 170, 920, 60);
                labelResponse.setFont(new Font("Arial", Font.PLAIN, 40));
                labelResponse.setForeground(Color.BLUE);
                frameATTACK.add(labelResponse);

                JButton buttonOkay = new JButton("Okay");
                buttonOkay.setBounds(300, 500, 253, 80);
                buttonOkay.setBackground(c);
                buttonOkay.setForeground(c2);
                frameATTACK.add(buttonOkay);

                buttonOkay.addActionListener(new ActionListener() { // Okay button action

                    public void actionPerformed(ActionEvent b) {
                        System.out.println();
                            frameATTACK.setVisible(false);
                      
                       

                    }
                });

              

                buttonCompliment.addActionListener(new ActionListener() { // Compliment button aciton

                    public void actionPerformed(ActionEvent b) {
                        // actionhere
                        if (FPoints != 4) {
                            FPoints++;
                        }
                        // frameATTACK.setVisible(true);
                        // ATTACK uzbrukt
                       
                       
                    }
                });

                buttonLowerFP.addActionListener(new ActionListener() { // LowerFP button aciton

                    public void actionPerformed(ActionEvent b) {
                        // actionhere
                        if (FPoints != 0) {
                            FPoints--;
                        }
                        // frameATTACK.setVisible(true);
                        // ATTACK uzbrukt
                       
                       
                    }
                });

                buttonAttack.addActionListener(new ActionListener() { // attack button aciton

                    public void actionPerformed(ActionEvent b) {
                        // actionhere

                        frameATTACK.setVisible(true);

                        // ATTACK uzbrukt
                        int rCrit = (int) (Math.random() * (1 + 100 - 0) + 0);

                        int r2 = (int) (Math.random() * (1 + 6 - 3) + 3);
                        int Atkdmg = r2;

                        if (rCrit >= 94) {
                            label.setText("You missed!");
                        } else {
                            if (rCrit <= 6) {
                                Atkdmg = Atkdmg * 2;
                                label.setText("Critical hit! You hit Froggie and dealt "
                                        + Atkdmg + " damage.");
                            } else {
                                label.setText("You hit Froggie and dealt  " + Atkdmg + " damage.");
                            }

                            EHP = EHP - Atkdmg;

                        }

                        int rCrit2 = (int) (Math.random() * (1 + 100 - 0) + 0);
                        int Atkdmg2 = (int) (Math.random() * (1 + 3 - 2) + 2);
                        int r = (int) (Math.random() * (1 + 5 - 1) + 1);

                        if (EHP > 0) {
                            
                            if (FPoints <= 0) {
                                switch (r) {
                                    case 1:
                                        labelResponse.setText("Froggie: You'll pay for this!");
                                        break;
                                    case 2:
                                        labelResponse.setText("Froggie: You're about to get hurt!");
                                        break;
                                    case 3:
                                        labelResponse.setText("Froggie: You'll pay for this!");
                                        break;
                                    case 4:
                                        labelResponse.setText("Froggie: How stupid of you.");
                                        break;
                                    case 5:
                                        labelResponse.setText("Froggie: FOOOOL!!");
                                        break;
                                }

                            } else if (FPoints == 1) {
                                switch (r) {
                                    case 1:
                                        labelResponse.setText("Froggie: You'll wish you continued talking!");
                                        if (FPoints > 0) 
                                        break;
                                    case 2:
                                        labelResponse.setText("Froggie: I see you're a fighter.");

                                        break;
                                    case 3:
                                        labelResponse.setText("Froggie: This is my kind of language.");
                                        if (Atkdmg2 > 1) {
                                            Atkdmg2 = Atkdmg2 - 1;
                                        }
                                        break;
                                    case 4:

                                        break;
                                    case 5:
                                        labelResponse.setText("Froggie: YOU'RE A FOOL!!");
                                        break;
                                }
                            } else if (FPoints == 2) {
                                if (r == 1 || r == 2 || r == 3) {
                                    labelResponse.setText("Froggie: Can't say I'm surprised.");
                                    if (Atkdmg2 > 1) {
                                        Atkdmg2 = Atkdmg2 - 1;
                                    }
                                   
                                } else if (r == 4 || r == 5) {
                                    labelResponse.setText("Froggie: You sure about that?");
                                   
                                }

                            } else if (FPoints == 3) {
                                if (r == 1 || r == 2 || r == 3) {
                                    labelResponse.setText("Froggie: And here I thought we could be friends.");
                                    
                                    Atkdmg2 = 1;
                                } else if (r == 4 || r == 5) {
                                    labelResponse.setText("Froggie: Betrayal at it's finest.");
                                   
                                    if (Atkdmg2 > 0) {
                                        Atkdmg2 = 3;
                                    }
                                }
                            } else if (FPoints == 4) {
                                if (r == 1 || r == 2 || r == 3) {
                                    labelResponse.setText("Froggie: I can't believe you'd attack me..");
                                    
                                    Atkdmg2 = 0;
                                } else if (r == 4 || r == 5) {
                                    labelResponse.setText("Froggie: HOW DARE YOU?????");
                                    
                                    if (Atkdmg2 > 0) {
                                        Atkdmg2 = 4;
                                        rCrit2 = 5;
                                    }
                                }
                            }

                            if (rCrit2 >= 94) {
                                labelResult2.setText("Froggie missed! Froggie: Frick!");
                            } else {
                                if (rCrit2 <= 5) {
                                    Atkdmg2 = Atkdmg2 * 2;
                                    labelResult2.setText("Critical hit! Froggie hit you and dealt "
                                            + Atkdmg2 + " damage.");
                                } else {
                                    labelResult2.setText("Froggie hit you and dealt " + Atkdmg2 + " damage.");
                                }
                            }

                            HP = HP - Atkdmg;

                            // Continue();

                        } else {
                            // Continue();
                            // labelResponse.setText("continue");
                        }

                    }
                });
                

                buttonCheck.addActionListener(new ActionListener() { // stat Buttona action

                    public void actionPerformed(ActionEvent b) {
                        frameStats.setVisible(true);
                        label5.setText("FPoints: " + FPoints + " // Enemy HP: " + EHP + " // Your HP: " + HP);
                        
                        JButton buttonOkay2 = new JButton("Okay");
                 buttonOkay2.setBounds(300, 500, 253, 80);
                buttonOkay2.setBackground(c);
                buttonOkay2.setForeground(c2);
                frameStats.add(buttonOkay2);

                buttonOkay2.addActionListener(new ActionListener() { // Okay button action

                    public void actionPerformed(ActionEvent b) {
                        System.out.println();
                            frameStats.setVisible(false);
                      
                       

                    }
                });
                    }
                });

                // aiziet uz jaunu vietu, kur jauni button etc.
                // bilde ar varoni, zemak buttons un labels etc.
            }
        });

    }

    // public static void frameCreation() {
    // JFrame frame = new JFrame("Game3");
    // frame.setSize(800, 800);
    // frame.setLayout(null);
    // frame.setVisible(true);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // }

    // public static void BgCreation() {
    // Image backgroundImage = Toolkit.getDefaultToolkit().getImage("src/bg2.png");
    // JPanel panel = new JPanel() {
    // @Override
    // public void paintComponent(Graphics g) {
    // super.paintComponent(g);
    // g.drawImage(backgroundImage, 0, 0, this);
    // }
    // };
    // panel.setSize(960, 640);
    // frame.add(panel);
    // }

}