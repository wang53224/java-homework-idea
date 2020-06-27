package edu.dlufl.chapter04.example15;

interface Animal{
    void shout();       //定义抽象方法
}

class Cat implements Animal {
    //实现shout()方法
    public void shout() {
        System.out.println("喵喵~~~~~~");
    }
    void sleep(){
        System.out.println("猫睡觉~~~~~~");
    }
}

class Dog implements Animal{
    public void shout(){
        System.out.println("汪汪~~~~~~");
    }
}
public class Example15 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        animalShout(dog);
    }
    public static void animalShout(Animal animal){
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.shout();
            cat.sleep();
        } else{
            System.out.println("this animal is not a cat");
        }
    }
}

