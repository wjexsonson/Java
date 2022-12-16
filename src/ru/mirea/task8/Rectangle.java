package ru.mirea.task8;

import java.awt.*;

class Rectangle extends Shape {
    private int xPos2, yPos2, length, width;
    public Rectangle(int xPos, int yPos, int width, int length, Color color){
        super(xPos, yPos, color);
        this.length=length;
        this.width=width;
        this.xPos2=xPos+length;
        this.yPos2=yPos+width;
        this.setSize(width,length);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBounds(xPos, yPos, width, length);
        g.setColor(this.color);
        g.fillRect(0,0,width, length);
    }
}