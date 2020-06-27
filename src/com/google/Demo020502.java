package com.google;

/**
 * 类型转换案例
 * @author wang
 * @version 1.0.0
 */

public class Demo020502 {
    public static void main(String[] args){
        //1.数值之间的转换
        long x = 1234567898765432199L;
        double y = x;
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);//精度有损失

        double a = 2.71828_18284_59045;
        short b = (short)a;

        char ch1 = 'A';
        char ch2 = '中';
        int add1 = ch1 + 10;
        int add2 = ch2 + 100;
        System.out.println("add1 = " + add1);
        System.out.println("add2 = " + add2);
        System.out.println("add1(char) = " + (char)add1);
        System.out.println("add2(char) = " + (char)add2);

        //2.字符串与数值之间的转换
        String s1 = "1949";
        int str_int = Integer.parseInt(s1);
        double str_double = Double.parseDouble(s1);

        double d =2.718;
        String double_str = "" + d;
        String double_str2 = String.valueOf(d);
    }
}
