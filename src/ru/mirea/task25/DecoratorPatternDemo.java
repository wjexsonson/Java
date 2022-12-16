package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        RedShapeDecorator red_circle = new RedShapeDecorator(circle);
        RedShapeDecorator red_rectangle = new RedShapeDecorator(rectangle);

        System.out.println();
        red_circle.draw();
        red_circle.setRedBoarder();
        System.out.println("--------------------------");
        red_rectangle.draw();
        red_rectangle.setRedBoarder();
    }
}