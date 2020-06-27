package edu.dlufl.chapter04.example09_2;

class People extends Ape{
    String name = "张三";
    int age = 18;

    void crySpeak(String s){
        System.out.println("------开始说话---------");
        System.out.println("我叫：" + name);
        System.out.println(s);
    }

    void computer(int a,int b){
        super.crySpeak("开始算数：");
        System.out.println(a + "*" + b + "+" + a * b);
    }
}
