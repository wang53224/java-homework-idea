package edu.dlufl.chapter04.example09_2;

public class Example09_2 {
    public static void main(String[] args) {
        System.out.println("************父类对象************");
        Ape monkey1 = new Ape();
        System.out.println("年龄：" + monkey1.age);
        monkey1.crySpeak("呜呜~");
        monkey1.sleep();
        System.out.println("************子类对象************");
        People p1 = new People();
        System.out.println("姓名：" + p1.name);
        System.out.println("年龄：" + p1.age);
        p1.crySpeak("你好");
        p1.sleep();
        p1.computer(3,4);
        System.out.println("************上转型对象************");
        Ape monkey2 = p1;
        //   System.out.println("姓名：" + monkey2.name);      //丧失新增的属性
        System.out.println("姓名：" + monkey2.age);            //覆盖前的属性
        monkey2.crySpeak("装作不会说话");                    //重写后的方法
        monkey2.sleep();                                      //继承父类的方法
        //      monkey2.computer(3,4);                        //丧失新增方法
        System.out.println("************上转型对象还原************");
        People p2 = (People) monkey2;
        System.out.println("姓名：" + p2.name);       //新增的属性
        System.out.println("年龄：" + p2.age);        //覆盖父类同名属性
        p2.crySpeak("你好");                       //重写父类同名方法
        p2.sleep();                                  //继承父类的方法
        p2.computer(5,5);                       //子类新增方法
    }
}
