package com.google;

/**
 * 基本数据类型的存储空间，取值范围
 * @author wang
 * @version 1.0.0
 */

public class Demo0204 {
    public static void main(String[] args){
        System.out.println("int 的存储空间（位）：" + Integer.SIZE);
        System.out.println("int 的最小值：" + Integer.MIN_VALUE);
        System.out.println("int 的最大值:" + Integer.MAX_VALUE);
        System.out.println("-----------------------------------");
        System.out.println("double 的存储空间（位）：" + Double.SIZE);
        System.out.println("double 的最小值：" + Double.MIN_VALUE);
        System.out.println("double 的最大值：" + Double.MAX_VALUE);
    }
}
