package edu.dlufl.chapter04.example12;

interface Animal{
    String ANIMAL_BEHAVIOR = "动物的行为";
    void breathe();         //  默认修饰为 public abstract
    void run();
}
interface LandAnimal extends Animal{
    void liveOnLand();
}
class Dog implements LandAnimal {
    public void breathe(){
        System.out.println( ANIMAL_BEHAVIOR + ":" + "狗在呼吸");
    }
    public void run(){
        System.out.println( ANIMAL_BEHAVIOR + ":" + "狗在奔跑");
    }
    public void liveOnLand() {
        System.out.println("狗是陆地上的动物。。。");
    }
}

public class Example12 {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        System.out.println(dog.ANIMAL_BEHAVIOR);
//        System.out.println(Animal.ANIMAL_BEHAVIOR);
        dog.breathe();
        dog.run();
        dog.liveOnLand();
    }
}
