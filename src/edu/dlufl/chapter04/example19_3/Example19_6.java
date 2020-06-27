package edu.dlufl.chapter04.example19_3;

abstract class Shape{
    abstract double getArea();
}
class Rect extends Shape{
    double width,height;

    public Rect(double width,double height){
        super();
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return width * height;
    }
}

class Circle extends Shape{
    double radius;
    static final double pi = Math.PI;

    public Circle(double radius){
        super();
        this.radius = radius;
    }
    double getArea(){
        return pi * radius * radius;
    }
}

public class Example19_6 {
    static void getArea(Shape s){
        System.out.println("面积是：" + s.getArea());
    }

    public static void main(String[] args) {
        getArea(new Rect(4,5));
        getArea(new Circle(5));
    }
}
