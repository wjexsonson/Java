package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Task_11_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);
        frame.setVisible(true);

        Container container = frame.getContentPane();

        JLabel north = new JLabel("NORTH" );
        north.setHorizontalAlignment(JLabel.CENTER);
        north.setBorder(BorderFactory.createLineBorder(Color.black));
        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(north, "Добро пожаловать на NORTH");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel east = new JLabel("EAST" );
        east.setHorizontalAlignment(JLabel.CENTER);
        east.setBorder(BorderFactory.createLineBorder(Color.black));
        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(east, "Добро пожаловать на EAST");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel south = new JLabel("SOUTH" );
        south.setHorizontalAlignment(JLabel.CENTER);
        south.setBorder(BorderFactory.createLineBorder(Color.black));
        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(south, "Добро пожаловать на SOUTH");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel west = new JLabel("WEST" );
        west.setHorizontalAlignment(JLabel.CENTER);
        west.setBorder(BorderFactory.createLineBorder(Color.black));
        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(west, "Добро пожаловать на WEST");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel center = new JLabel("CENTER" );
        center.setHorizontalAlignment(JLabel.CENTER);
        center.setBorder(BorderFactory.createLineBorder(Color.black));
        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(center, "Добро пожаловать в CENTER");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        container.add(north, BorderLayout.NORTH);
        container.add(east, BorderLayout.EAST);
        container.add(south, BorderLayout.SOUTH);
        container.add(west, BorderLayout.WEST);
        container.add(center);
    }
}