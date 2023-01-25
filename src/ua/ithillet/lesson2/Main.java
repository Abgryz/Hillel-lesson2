package ua.ithillet.lesson2;

import ua.ithillet.lesson2.part2.Cat;
import ua.ithillet.lesson2.part2.Dog;
import ua.ithillet.lesson2.part3.Circle;
import ua.ithillet.lesson2.part3.Square;
import ua.ithillet.lesson2.part3.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //part2
        System.out.println("Введіть ім'я собаки: ");
        Dog dog = new Dog(scan.nextLine());
        System.out.println("Введіть ім'я кота: ");
        Cat cat = new Cat(scan.nextLine());

        System.out.println("Введіть дистацію бігу: ");
        int runDistance = scan.nextInt();
        dog.run(runDistance);
        cat.run(runDistance);
        System.out.println("Введіть дистанцію запливу: ");
        int swimDistance = scan.nextInt();
        dog.swim(swimDistance);
        cat.swim(swimDistance);

        //part3
        System.out.println("Введіть радіус кола: ");
        Circle circle = new Circle(scan.nextDouble());
        System.out.println("Площа кола: " + circle.area());

        System.out.println("Введіть довжину сторони квадрата: ");
        Square square = new Square(scan.nextDouble());
        System.out.println("Площа квадрата: " + square.area());

        System.out.println("Введіть сторони трикутника: ");
        Triangle triangle = new Triangle(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        System.out.println("Площа трикутника: " + triangle.area());
    }
}