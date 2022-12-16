package ru.mirea.task7;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center.x=x;
        this.center.y=y;
        this.center.xSpeed=xSpeed;
        this.center.ySpeed=ySpeed;
        this.radius=radius;
    }


    @Override
    public void moveUp() {
        this.center.y++;
    }

    @Override
    public void moveDown() {
        this.center.y--;
    }

    @Override
    public void moveLeft() {
        this.center.x++;
    }

    @Override
    public void moveRight() {
        this.center.x--;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}';
    }
}