package com.google;

public class Demo020501 {
    public static void main(String[] args){
        //1.常量
        //1.1 整数默认常量是int类型
   //   long x = 123456789876543210;    //错误
        long x = 123456789874563210L;   //正确
        //1.2 浮点数的默认常量是double类型
   //   float fx = 3.1415;      //错误
        double fy = 3.1415;     //正确
        //1.3 整型常量
        int a = 65;  //十进制
        int b = 0101;//八进制
        int c = 0x41;//十六进制
        int d = 0B101;//二进制
        //1.4 字符串常量
        String s1 = "day day up";
        String s2 = "天天向上 \u5959\u5929\u5411\u4e0a";
        String s3 = ""+1949+10+"10";//字符串连接
        String s4 = "好好学习\n天天向上";//转义字符

        //2.变量定义
        double Π = 3.14;    //含有希腊字母
        int cn国庆 = 19491001;//含有汉字
    }
}
