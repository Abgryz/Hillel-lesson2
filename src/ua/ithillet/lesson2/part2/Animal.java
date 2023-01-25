package ua.ithillet.lesson2.part2;

public class Animal {
    protected String name;
    protected int maxRunning;
    protected int maxSwimming;

    public void run(int distance){
        if(distance > maxRunning)
            distance = maxRunning;
        if (distance == 0)
            System.out.println(name + " не пробіг жодного метра");
        else
            System.out.println(name + " пробіг " + distance + "м");
    }
    public void swim(int distance){
        if(distance > maxSwimming)
            distance = maxSwimming;
        if (distance == 0)
            System.out.println(name + " не проплив жодного метра");
        else
            System.out.println(name + " проплив " + distance + "м");
    }
}
