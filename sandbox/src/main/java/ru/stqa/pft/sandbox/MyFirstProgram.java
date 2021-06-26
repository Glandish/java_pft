package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("jija");
        hello("Andrey");
        hello("Andrey");
        hello("Andrey");


        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной "+ s.l +" см = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами "+ r.a +" и = " + r.b +" = " + r.area());
    }
    public static void hello(String world){
        System.out.println("Hello, " + world +"!");
    }


}