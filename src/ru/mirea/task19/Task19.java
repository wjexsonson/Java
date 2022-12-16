package ru.mirea.task19;

public class Task19 {
    static class Triangle {
        double a1,a2,a3;
        Triangle(double a1, double a2, double a3) throws Exception {
            if (a1+a2+a3!=180) {
                throw new Exception("Сумма углов не равна 180");
            }
            if (!(a1==90 || a2==90 || a3==90)) {
                throw new Exception("Нет прямого угла");
            }
            if (a1==0 || a2==0 || a3==0) {
                throw new Exception("Угол не может быть равен 0");
            }

            this.a1=a1;
            this.a2=a2;
            this.a3=a3;
        }

        @Override
        public String toString() {
            return "Triangle{" +
                    "a1=" + a1 +
                    ", a2=" + a2 +
                    ", a3=" + a3 +
                    '}';
        }
    }

    public static void main(String[] args) {
        Triangle triangle;

        try {
            triangle = new Triangle(90, 45, 45);
            System.out.println(triangle.toString());
        }
        catch (Exception e) {
            System.out.println("Ошибка №1: " + e.getMessage());
        }
        finally {
            System.out.println("----------------------------------------------");
        }

        try {
            triangle = new Triangle(60, 60, 60);
            System.out.println(triangle.toString());
        }
        catch (Exception e) {
            System.out.println("Ошибка №2: " + e.getMessage());
        }
        finally {
            System.out.println("----------------------------------------------");
        }

        try {
            triangle = new Triangle(90, 90, 90);
            System.out.println(triangle.toString());
        }
        catch (Exception e) {
            System.out.println("Ошибка №3: " + e.getMessage());
        }
        finally {
            System.out.println("----------------------------------------------");
        }

        try {
            triangle=new Triangle(0, 90, 90);
            System.out.println(triangle.toString());
        }
        catch (Exception e) {
            System.out.println("Ошибка №4: " + e.getMessage());
        }
        finally {
            System.out.println("----------------------------------------------");
        }

    }
}