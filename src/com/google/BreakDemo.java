package com.google;

public class BreakDemo {
    public static void main(String[] args){
        int count = 0;
        long startTime = System.currentTimeMillis();

        while(true)
            if(++count == Integer.MAX_VALUE)
                break;
        long endTime = System.currentTimeMillis();
        System.out.println("循环用时：" + (endTime - startTime) + "毫秒");
        count = 0;
    }
}
