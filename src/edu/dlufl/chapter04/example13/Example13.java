package edu.dlufl.chapter04.example13;

interface Animal{
    void shout();       //定义抽象方法
}

class Cat implements Animal{
    //实现shout()方法
    public void shout() {
        System.out.println("喵喵~~~~~~");
    }
}

class Dog implements Animal{
    //实现shout()方法
    public void shout() {
        System.out.println("汪汪~~~~~~");
    }
}

public class Example13 {
    public static void main(String[] args) {
        Animal an1 = new Cat();
        Animal an2 = new Dog();

        animalShout(an1);
        animalShout(an2);
    }
    public static void animalShout(Animal an){
        an.shout();         //调用实际参数的shout()方法
    }
}
