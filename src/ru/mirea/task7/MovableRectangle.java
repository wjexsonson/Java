package ru.mirea.task7;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft.x=x1;
        topLeft.y=y1;
        bottomRight.x=x2;
        bottomRight.y=y2;
        topLeft.xSpeed=bottomRight.xSpeed=xSpeed;
        topLeft.ySpeed= bottomRight.ySpeed=ySpeed;
    }

    @Override
    public void moveUp() {
        this.topLeft.y++;
        this.bottomRight.y++;
    }

    @Override
    public void moveDown() {
        this.topLeft.y--;
        this.bottomRight.y--;
    }

    @Override
    public void moveLeft() {
        this.topLeft.x++;
        this.bottomRight.x++;
    }

    @Override
    public void moveRight() {
        this.topLeft.x--;
        this.bottomRight.x--;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() +
                '}';
    }
}