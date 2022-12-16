package ru.mirea.task9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task9 {
    protected static int first_team_score=0, second_team_score=0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task9");
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JButton first_team_button = new JButton("CSKA");
        first_team_button.setBounds(100,180,120,25);
        frame.add(first_team_button);

        JButton second_team_button = new JButton("Spartak");
        second_team_button.setBounds(300,180,120,25);
        frame.add(second_team_button);

        JLabel scoreLabel = new JLabel("Result: " + first_team_score + " X " + second_team_score);
        scoreLabel.setSize(200, 100);
        scoreLabel.setBounds(220, 120, 150, 25);
        frame.add(scoreLabel);

        JLabel lastGoalLabel = new JLabel("Last scorer: N/A");
        lastGoalLabel.setSize(200, 100);
        lastGoalLabel.setBounds(220, 140, 150, 25);
        frame.add(lastGoalLabel);

        JLabel winnerLabel = new JLabel("Winner: Draw");
        winnerLabel.setSize(200, 100);
        winnerLabel.setBounds(220, 100, 150, 25);
        frame.add(winnerLabel);

        first_team_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_team_score+=1;
                scoreLabel.setText("Result: " + first_team_score + " X " + second_team_score);
                lastGoalLabel.setText("Last scorer: CSKA");
                if (first_team_score>second_team_score){
                    winnerLabel.setText("Winner: SPARTAK");
                }
                else if(first_team_score<second_team_score){
                    winnerLabel.setText("Winner: SPARTAK");
                }
                else{
                    winnerLabel.setText("Winner: DRAW");
                }
            }
        });

        second_team_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_team_score+=1;
                scoreLabel.setText("Result: " + first_team_score + " X " + second_team_score);
                lastGoalLabel.setText("Last scorer: Spartak");
                if (first_team_score>second_team_score){
                    winnerLabel.setText("Winner: CSKA");
                }
                else if (first_team_score<second_team_score){
                    winnerLabel.setText("Winner: Spartak");
                }
                else {
                    winnerLabel.setText("Winner: DRAW");
                }
            }
        });
    }
}