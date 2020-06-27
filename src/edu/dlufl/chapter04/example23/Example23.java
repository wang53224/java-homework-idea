package edu.dlufl.chapter04.example23;

public class Example23 {

    public static void main(String[] args) {
//        int result = divide(4,2);
//        System.out.println(result);
        //出现错误：是因为没有对异常进行捕获或声明
    }

    public static int divide(int x,int y) throws Exception{
        int result = x / y;
        return result;
    }
}
