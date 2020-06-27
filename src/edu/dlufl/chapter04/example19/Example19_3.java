package edu.dlufl.chapter04.example19;

//方法重载
class Compute{
    void add(int a, int b)
    {
        System.out.println("两个整数相加： " + a + "+" + b + "=" + (a+b));
    }
    void add(double a, double b)
    {
        System.out.println("两个小数相加： " + a + "+" + b + "=" + (a+b));
    }
    void add(int a, int b , int c)
    {
        System.out.println("三个整数相加： " + a + "+" + b + "+" + c + "=" + (a+b+c));
    }
}

public class Example19_3 {
    public static void main(String[] args) {
        Compute c = new Compute();
        c.add(1,2);
        c.add(1.25,2.5);
        c.add(1,2,3);
    }
}
