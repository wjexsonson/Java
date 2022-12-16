package ru.mirea.task8;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;

public class Task_8_2 {
    static BufferedImage image;
    public static void main(String[] args) {
        JFrame frame =new JFrame("Task8_2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            File file = new File(args[0]);
            image = ImageIO.read(file);
        } catch (Exception e){
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        JPanel panel =new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image,0, 0, this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(image.getWidth(), image.getHeight());
            }
        };
        System.out.print("image width = "+image.getWidth()+"\nimage height = "+ image.getHeight());
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}