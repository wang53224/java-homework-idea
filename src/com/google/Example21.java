package com.google;
/**
 * 使用有返回值的方法求矩形面积
 */
public class Example21 {
    public static void main(String[] args) {
        int area = getArea(3, 5);
        System.out.println("The area is " + area);
    }
    public static int getArea(int x,int y){
        int temp = x * y;
        return temp;
    }
}
