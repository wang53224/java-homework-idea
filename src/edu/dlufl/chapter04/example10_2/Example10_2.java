package edu.dlufl.chapter04.example10_2;

abstract class Animal{
    abstract void shout();
}
class Dog extends Animal{
    void shout(){
        System.out.println("汪汪......");
    }
}
class Cat extends Animal{
    void shout(){
        System.out.println("喵喵......");
    }
}

public class Example10_2 {
    public static void makeCry(Animal a) {
        a.shout();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        makeCry(dog);

        Cat cat = new Cat();
        makeCry(cat);
    }
}
