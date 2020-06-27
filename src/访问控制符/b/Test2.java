package 访问控制符.b;

import 访问控制符.a.People;

class Teacher extends People{

    public void printInfo() {           //包外类外（子类）
        System.out.println("姓名（公开）：" + name);
        System.out.println("年龄（保护）：" + age);
    //非法    //System.out.println("体重（默认）：" + weight);
    //非法    //System.out.println("秘密（私有）：" + secret);
    }
}

public class Test2 {
    public static void main(String[] args) {        //包外类外（非子类）
        People p = new People();
        System.out.println("姓名（公开）：" + p.name);
//非法        //System.out.println("年龄（保护）：" + p.age);
//非法        //System.out.println("体重（默认）：" + p.weight);
//非法        //System.out.println("秘密（私有）：" + p.secret);
    }
}
