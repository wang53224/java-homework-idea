package com.google;

/**
 * 不使用方法时实现打印三个长宽不同的矩形
 */
public class Example19 {
    public static void main(String[] args) {
        //使用*打印一个宽为5、高为3的矩形
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        //使用*打印一个宽为4、高为2的矩形
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        //使用*打印一个宽为10、高为6的矩形
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
