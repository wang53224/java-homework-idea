package edu.dlufl.chapter04.example19_3;

//方法重写
class Animal {
    void cry() {
        System.out.println("动物喊叫");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("小狗喊叫");     //方法重写
    }
    void cry(int n){
        System.out.println("小狗喊叫");     //方法重载
        for (int i = 1; i <= n; i++){
            System.out.println("汪汪");
        }
    }
}

public class Example19_5 {
    static void makeCry(Animal a){
        a.cry();
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.cry();
        Dog d = new Dog();
        d.cry();
        makeCry(d);     //上转型
        d.cry(3);
    }
}
