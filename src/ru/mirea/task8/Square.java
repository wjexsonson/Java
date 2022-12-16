package ru.mirea.task8;

import java.awt.*;

class Square extends  Shape {
    private int xPos2, yPos2, side;
    public Square(int xPos, int yPos, int side, Color color){
        super(xPos, yPos, color);
        this.side=side;
        this.xPos2=xPos+side;
        this.yPos2=yPos+side;
        this.setSize(xPos2-xPos,yPos2-yPos);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBounds(xPos, yPos, side, side);
        g.setColor(this.color);
        g.fillRect(0,0,side, side);
    }
}