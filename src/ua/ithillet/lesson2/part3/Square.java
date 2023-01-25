package ua.ithillet.lesson2.part3;

public class Square implements FigureInterface {
    private double a;

    public Square(double a){
        this.a = a;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double area(){
        return a*a;
    }
}
