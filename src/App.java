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
    public static int EHP = 10000; // Enemy Health bar
    public static int EHPstarting = 10; // Enemy Health bar that it starts with
    public static int HP = 20; // Health bar
    public static int FPoints = 2; // FPOINTS

    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Game3");
        JFrame frame2 = new JFrame("Game3Continue");
        JFrame frameATTACK = new JFrame("Game3Continue");

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

        JLabel label = new JLabel("---- Rescue");
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameATTACK.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

                JButton buttonCompliment = new JButton("Compliment");
                buttonCompliment.setBounds(353, 450, 253, 80);
                buttonCompliment.setBackground(c);
                buttonCompliment.setForeground(c2);
                panel.add(buttonCompliment);

                JButton buttonMenu = new JButton("Menu");
                buttonMenu.setBounds(626, 450, 253, 80);
                buttonMenu.setBackground(c);
                buttonMenu.setForeground(c2);
                panel.add(buttonMenu);

                buttonMenu.addActionListener(new ActionListener() { // Menu Buttona action

                    public void actionPerformed(ActionEvent b) {
                        frame2.setVisible(false);
                        frame.setVisible(true);

                    }
                });

                JLabel label = new JLabel("You attack Froggie!");
                label.setBounds(20, 50, 900, 60);
                label.setFont(new Font("Arial", Font.BOLD, 50));
                label.setForeground(Color.RED);
                frameATTACK.add(label);

                Color c = new Color(91, 65, 76, 255);

                JLabel labelResult = new JLabel();
                labelResult.setBounds(40, 80, 500, 60);
                labelResult.setFont(new Font("Arial", Font.PLAIN, 30));
                labelResult.setForeground(c);
                frameATTACK.add(labelResult);

                JLabel labelResponse = new JLabel("TESTTTT");
                labelResponse.setBounds(40, 150, 500, 60);
                labelResponse.setFont(new Font("Arial", Font.PLAIN, 30));
                labelResponse.setForeground(c);
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

                        // frameATTACK.setVisible(true);
                        // ATTACK uzbrukt
                        System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
                        System.out.println("---------------------------------------");
                        System.out.println("\u001B[36m\u001B[1mYou chose to compliment Froggie");
                        System.out.println("---------------------------------------");

                        int r = (int) (Math.random() * (1 + 5 - 1) + 1);
                        switch (r) {
                            case 1:
                                System.out.println("You: Your eyes are as bright and beautiful as stars in the night.");

                                if (FPoints == 0) {
                                    System.out.printf("Froggie: T-Thanks? What is this about??");
                                    FPoints++;
                                } else if (FPoints == 1) {
                                    System.out.printf("Froggie: That's a bit sudden. Thanks though.");
                                    FPoints++;
                                } else if (FPoints == 2) {
                                    System.out.printf("Froggie: Thanks!");
                                    FPoints++;
                                } else if (FPoints == 3) {
                                    System.out.printf("Froggie: Thanks, mate!");
                                    FPoints++;
                                } else if (FPoints == 4) {
                                    System.out.printf("Froggie: Aww, thank you. You too!");

                                }
                                FPoints++;
                                FPoints++;

                                break;
                            case 2:
                                System.out.println("You: Oh, I love your shoes! Really fits your outfit today.");
                                if (FPoints == 0) {
                                    System.out.printf("Froggie: I know.");
                                    FPoints++;
                                    FPoints++;
                                } else if (FPoints == 1) {
                                    System.out.printf("Froggie: Thanks?");

                                } else if (FPoints == 2) {
                                    System.out.printf("Froggie: Oh, thank you!");

                                    FPoints++;
                                } else if (FPoints == 3) {
                                    System.out.printf("Froggie: Thanks, mate!");

                                } else if (FPoints == 4) {
                                    System.out.printf(
                                            "Froggie: Why thank you. Your shirt brings out your eye colour. Looks great!");

                                }
                                FPoints++;

                                break;
                            case 3:
                                System.out
                                        .println("You: Has anyone ever told you how beautiful of a smile you've got?");
                                if (FPoints == 0) {
                                    System.out.printf("Froggie: Nobody has ever said that, no.");
                                    FPoints++;
                                } else if (FPoints == 1) {
                                    System.out.printf("Froggie: No.");
                                    FPoints++;
                                    FPoints++;
                                } else if (FPoints == 2) {
                                    System.out.printf("Froggie: Thanks!");

                                } else if (FPoints == 3) {
                                    System.out.printf("Froggie: Thank you, that means a lot.");

                                    FPoints++;
                                } else if (FPoints == 4) {

                                    System.out.printf("Froggie: Thank you bud, your smile isn't so bad either.");

                                }
                                FPoints++;

                                break;
                            case 4:
                                System.out.println("You: You're really smart!");
                                if (FPoints == 0) {
                                    System.out.printf("Froggie: And you're the opposite.");
                                    FPoints--;
                                } else if (FPoints == 1) {
                                    System.out.printf("Froggie: I know right?. It's not hard to tell. ");
                                    FPoints++;
                                    FPoints++;
                                } else if (FPoints == 2) {
                                    System.out.printf("Froggie: Thank you.");
                                } else if (FPoints == 3) {
                                    System.out.printf("Froggie: Thanks, bud!");
                                    FPoints++;
                                } else if (FPoints == 4) {

                                    System.out.printf("Froggie: Thanks, you're smart as well!");

                                }
                                FPoints++;

                                break;
                            case 5:
                                System.out.println(
                                        "You: You know.. You're the best looking one out of all of these monsters");
                                if (FPoints == 0) {
                                    System.out.printf("Froggie: Are you insulting my friends?");
                                    FPoints--;
                                } else if (FPoints == 1) {
                                    System.out.printf("Froggie: Oh...");
                                    FPoints++;
                                } else if (FPoints == 2) {
                                    System.out.printf("Froggie: Thank you.");
                                    FPoints++;
                                } else if (FPoints == 3) {
                                    System.out.printf("Froggie: No way! Really?");
                                    FPoints++;
                                } else if (FPoints == 4) {
                                    System.out.printf("Froggie: Awww, shuckss... ");
                                }
                                FPoints++;

                                break;
                        }
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

                        rCrit = (int) (Math.random() * (1 + 100 - 0) + 0);
                        int r3 = (int) (Math.random() * (1 + 3 - 2) + 2);
                        Atkdmg = r3;

                        if (EHP > 0) {
                            int r = (int) (Math.random() * (1 + 5 - 1) + 1);
                            if (FPoints == 0) {
                                switch (r) {
                                    case 1:
                                        labelResponse.setText("Froggie: You'll pay for this!%n");
                                        break;
                                    case 2:
                                        labelResponse.setText("Froggie: You're about to get hurt!%n");
                                        break;
                                    case 3:
                                        labelResponse.setText("Froggie: You'll pay for this!%n");
                                        break;
                                    case 4:
                                        labelResponse.setText("Froggie: How stupid of you.%n");
                                        break;
                                    case 5:
                                        labelResponse.setText("Froggie: FOOOOL!!%n");
                                        break;
                                }

                            } else if (FPoints == 1) {
                                switch (r) {
                                    case 1:
                                        labelResponse.setText("Froggie: You'll wish you continued talking!%n");
                                        FPoints--;
                                        break;
                                    case 2:
                                        labelResponse.setText("Froggie: I see you're a fighter.%n");

                                        break;
                                    case 3:
                                        labelResponse.setText("Froggie: This is my kind of language.%n");
                                        if (Atkdmg > 1) {
                                            Atkdmg = Atkdmg - 1;
                                        }
                                        break;
                                    case 4:

                                        break;
                                    case 5:
                                        labelResponse.setText("Froggie: YOU'RE A FOOL!!%n");
                                        break;
                                }
                            } else if (FPoints == 2) {
                                if (r == 1 || r == 2 || r == 3) {
                                    labelResponse.setText("Froggie: Can't say I'm surprised.%n");
                                    if (Atkdmg > 1) {
                                        Atkdmg = Atkdmg - 1;
                                    }
                                    FPoints--;
                                } else if (r == 4 || r == 5) {
                                    labelResponse.setText("Froggie: You sure about that?%n");
                                    FPoints--;
                                }

                            } else if (FPoints == 3) {
                                if (r == 1 || r == 2 || r == 3) {
                                    labelResponse.setText("Froggie: And here I thought we could be friends.%n");
                                    FPoints--;
                                    Atkdmg = 1;
                                } else if (r == 4 || r == 5) {
                                    labelResponse.setText("Froggie: Betrayal at it's finest.%n");
                                    FPoints--;
                                    if (Atkdmg > 0) {
                                        Atkdmg = 3;
                                    }
                                }
                            } else if (FPoints == 4) {
                                if (r == 1 || r == 2 || r == 3) {
                                    labelResponse.setText("Froggie: I can't believe you'd attack me..%n");
                                    FPoints--;
                                    Atkdmg = 0;
                                } else if (r == 4 || r == 5) {
                                    labelResponse.setText("Froggie: HOW DARE YOU?????%n");
                                    FPoints--;
                                    if (Atkdmg > 0) {
                                        Atkdmg = 4;
                                        rCrit = 5;
                                    }
                                }
                            }

                            if (rCrit >= 94) {
                                labelResponse.setText("Froggie missed! Froggie: Frick!");
                            } else {
                                if (rCrit <= 5) {
                                    Atkdmg = Atkdmg * 2;
                                    labelResponse.setText("Critical hit! Froggie hit you and dealt "
                                            + Atkdmg + " damage.");
                                } else {
                                    labelResponse.setText("Froggie hit you and dealt " + Atkdmg + " damage.");
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