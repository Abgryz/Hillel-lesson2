package ua.ithillet.lesson2.part3;

public class Triangle implements FigureInterface {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double area(){
        if(a+b <= c || a+c <= b || b+c <= a){
            System.out.println("Такого трикутника не існує!");
            return 0;
        }
        else{
            double p = (a + b + c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
    }
}
