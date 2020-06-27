package edu.dlufl.chapter04.example11;

interface Animal{
    String ANIMAL_BEHAVIOR = "动物的行为";

    void breathe();
    void run();
}

class Dog implements Animal{
    public void breathe(){
        System.out.println( ANIMAL_BEHAVIOR + ":" + "狗在呼吸");
    }
    public void run(){
        System.out.println( ANIMAL_BEHAVIOR + ":" + "狗在奔跑");
    }
}

public class Example11 {
    public static void main(String[] args) {
        Dog dog = new Dog();

//        System.out.println(dog.ANIMAL_BEHAVIOR);
//        System.out.println(Animal.ANIMAL_BEHAVIOR);

        dog.breathe();
        dog.run();
    }
}
