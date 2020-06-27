package edu.dlufl.chapter04.example14;

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

public class Example14 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        animalShout(cat);
    }
    public static void animalShout(Animal animal){
        Cat cat = (Cat)animal;
        cat.shout();
        cat.sleep();
    }
}
