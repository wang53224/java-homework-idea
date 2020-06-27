package edu.dlufl.chapter04.example19_2;

//方法重写
class Animal {
    void cry() {
        System.out.println("动物喊叫");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("小狗喊叫");
    }
}
class Cat extends Animal {
    void cry() {
        System.out.println("小猫喊叫");
    }
}

public class Example19_4 {
    static void makeCry(Animal a) {
        a.cry();
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.cry();
        Dog d = new Dog();
        d.cry();
        makeCry(d);         //上转型
        Cat c = new Cat();
        c.cry();
        makeCry(c);         //上转型
    }
}
