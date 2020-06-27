package edu.dlufl.chapter04.example19;

//定义CanFly接口
interface CanFly{
    void fly();         //定义抽象方法fly()
}

class Bird implements CanFly{
    public void fly(){
        System.out.println("鸟儿在飞");
    }
}

class Plane implements CanFly{
    public void fly(){
        System.out.println("飞机在飞");
    }
}

//定义测试类
public class Example19_2 {
    public static void main(String[] args) {
        makeFly(new Bird());
        makeFly(new Plane());
    }
    public static void makeFly(CanFly cf){
        cf.fly();
    }
}
