package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guessing_Game {
    static int trying, digit;

    static private void replay(JLabel label){
        digit=(int)(Math.random()*21);
        trying=0;
        label.setText("Guess the number");
        System.out.println("Hidden number: " + digit);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        JFrame app = new JFrame("Guessing Game");
        JPanel panel = new JPanel();
        app.setContentPane(panel);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500,500);
        app.setVisible(true);
        app.setLocationRelativeTo(null);
        app.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JLabel label = new JLabel("Guess the number");
        panel.add(label, constraints);
        replay(label);

        JTextField text = new JTextField(5);
        constraints.gridy=1;
        panel.add(text, constraints);

        JButton button = new JButton("Guess");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().isEmpty()){
                    label.setText("You didn't enter anything");
                }
                else if (label.getText().equals("You win!") || label.getText().equals("You lose!")){
                    text.setText("");
                    replay(label);
                    button.setText("Ввести");
                }
                else if (Integer.parseInt(text.getText())==digit){
                    label.setText("You win!");
                    button.setText("Replay?");
                }
                else if(Integer.parseInt(text.getText())!=digit){
                    trying+=1;
                    label.setText("You didn't guess. Try again");
                }
                if (!label.getText().equals("You win!") && trying==3){
                    label.setText("You lose!");
                    button.setText("Replay?");
                }
            }
        });

        constraints.gridy=2;
        panel.add(button, constraints);
    }
}