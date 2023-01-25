package ua.ithillet.lesson2.part3;

public class Circle implements FigureInterface {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}
