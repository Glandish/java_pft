package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("jija");
        hello("Andrey");
        double len = 5;
        System.out.println("Площадь квадрата со стороной "+ len +" см = " + area(len));

        double a = 4;
        double b = 5;
        System.out.println("Площадь прямоугольника со сторонами "+ a +" и = " + b +" = " + area(a, b));
    }
    public static void hello(String world){
        System.out.println("Hello, " + world +"!");
    }
    public static double area(double l){
        return l*l;
    }
    public static double area(double a, double b){
        return a*b;
    }
}