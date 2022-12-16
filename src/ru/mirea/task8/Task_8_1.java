package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class  Task_8_1 {
    public static void main(String args[]){
        JFrame frame = new JFrame("Task8_1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color[] colors = new Color[]{Color.red, Color.blue, Color.yellow, Color.gray, Color.green, Color.pink, Color.cyan, Color.magenta, Color.orange, Color.black, Color.darkGray, Color.gray};
        Random rand = new Random();
        for (int i=0; i<20; i++){
            switch ((int)(Math.random()*3)) {
                case 0:
                    frame.add(new Circle(
                            rand.nextInt(250),
                            rand.nextInt(250),
                            rand.nextInt(50)+50,
                            colors[rand.nextInt(colors.length)]
                    ));
                    break;
                case 1:
                    frame.add(new Rectangle(
                            rand.nextInt(250),
                            rand.nextInt(250),
                            rand.nextInt(100),
                            rand.nextInt(150),
                            colors[rand.nextInt(colors.length)]
                    ));
                    break;
                case 2:
                    frame.add(new Square(
                            rand.nextInt(250),
                            rand.nextInt(250),
                            rand.nextInt(100),
                            colors[rand.nextInt(colors.length)]
                    ));
                default:
                    break;
            }
        }
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}