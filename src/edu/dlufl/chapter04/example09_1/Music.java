package edu.dlufl.chapter04.example09_1;

public class Music {
    public static void main(String[] args) {
        System.out.println("****************父类对象****************");
        Instrument i1 = new Instrument();
        System.out.println(i1.label);
        i1.play();
        i1.play2();

        System.out.println("****************子类对象****************");
        Wind w = new Wind();
        System.out.println(w.label);    //覆盖父类属性
        w.play();                       //重写父类方法
        w.play2();                      //继承父类方法
        w.play3();                      //新增子类方法

        System.out.println("****************上转型对象****************");
        Instrument i2 = w;
        System.out.println(i2.label);       //覆盖前的属性
        i2.play();                          //重写后的方法
        i2.play2();                         //继承的方法
    }
}
