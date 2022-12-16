package ru.mirea.task8;

import javax.swing.JComponent;
import java.awt.*;

public abstract class Shape extends JComponent{
    protected int xPos, yPos;
    protected Color color;

    public Shape(int xPos, int yPos, Color color) {
        super();
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
        this.setLocation(xPos, yPos);
        this.setVisible(true);
        this.setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    };
}



