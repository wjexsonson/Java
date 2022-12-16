package ru.mirea.task8;

import java.awt.*;

class  Circle extends Shape {
    private int radius;

    Circle(int xPos, int yPos, int radius, Color color) {
        super(xPos, yPos, color);
        this.radius=radius;
        this.setSize(radius, radius);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.color);
        g.fillOval(0,0, radius, radius);
    }
}