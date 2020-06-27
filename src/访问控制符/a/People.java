package 访问控制符.a;

public class People {       //以此类为基准相对物
    public String name;
    protected int age;
    double weight;
    private String secret;

    public void printInfo()     //包里类里
    {
        System.out.println("姓名（公开）：" + name);
        System.out.println("年龄（保护）：" + age);
        System.out.println("体重（默认）：" + weight);
        System.out.println("秘密（私有）：" + secret);
    }
}

class Student extends People{
    public void printInfo()     //包里类外
    {
        System.out.println("姓名（公开）：" + name);
        System.out.println("年龄（保护）：" + age);
        System.out.println("体重（默认）：" + weight);
    //非法    //System.out.println("秘密（私有）：" + secret);
    }
}
