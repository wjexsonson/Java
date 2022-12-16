package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;

public class Task_11_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JRadioButton color1 = new JRadioButton("Черный");
        panel.add(color1, constraints);

        JRadioButton color2 = new JRadioButton("Красный");
        color2.setForeground(Color.red);
        constraints.gridy=1;
        panel.add(color2, constraints);

        JRadioButton color3 = new JRadioButton("Синий");
        color3.setForeground(Color.blue);
        constraints.gridy=2;
        panel.add(color3, constraints);

        ButtonGroup g1 = new ButtonGroup();
        g1.add(color1);
        g1.add(color2);
        g1.add(color3);

        JRadioButton font1 = new JRadioButton("Usual");
        font1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        constraints.gridy=0;
        panel.add(font1, constraints);

        JRadioButton font2 = new JRadioButton("Italic");
        font2.setFont(new Font(Font.DIALOG, Font.ITALIC, 12));
        constraints.gridy=1;
        panel.add(font2, constraints);

        JRadioButton font3 = new JRadioButton("Bold");
        font3.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        constraints.gridy=2;
        panel.add(font3, constraints);

        ButtonGroup g2 = new ButtonGroup();
        g2.add(font1);
        g2.add(font2);
        g2.add(font3);

        TextField text = new TextField(20);
        text.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        constraints.gridy=3;
        constraints.gridwidth=2;
        panel.add(text, constraints);

        color1.addActionListener(e -> text.setForeground(Color.black));
        color2.addActionListener(e -> text.setForeground(Color.red));
        color3.addActionListener(e -> text.setForeground(Color.blue));
        font1.addActionListener(e -> text.setFont(font1.getFont()));
        font2.addActionListener(e -> text.setFont(font2.getFont()));
        font3.addActionListener(e -> text.setFont(font3.getFont()));
    }
}