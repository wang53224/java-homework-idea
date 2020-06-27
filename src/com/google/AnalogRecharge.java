package com.google;

import java.util.Scanner;

public class AnalogRecharge {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入话费余额：");
        double balance = in.nextDouble();

        if (balance < 10 && balance >= 0)
            System.out.println("余额" + balance + "元，余额不足10元，请及时充值");
        else if (balance >= 10) {
            System.out.println("余额" + balance + "元，余额充足，请放心使用！");
        }else {
            System.out.println("余额透支!");
        }
    }
}
