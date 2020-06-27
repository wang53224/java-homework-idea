package edu.dlufl.chapter04.example09_2;

public class Ape {
    private String secret = "爱吃香蕉";
    int age = 10;

    void crySpeak(String s){
        System.out.println("------开始喊叫：------");
        System.out.println("小秘密：" + secret);
        System.out.println("今年：" + age + "岁");
        System.out.println(s);
    }

    void sleep(){
        System.out.println("睡觉呼呼");
    }
}
