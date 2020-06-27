package com.google;

import java.util.Scanner;

public class RemoteControl {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请选择频道：");
        int choice = in.nextInt();

        switch(choice){
            case 31:
                System.out.println("现在是CCTV体育频道！");
                break;
            case 33:
                System.out.println("现在是CCTV新闻频道！");
                break;
            case 30:
                System.out.println("现在是CCTV中文国际频道！");
                break;
            case 27:
                System.out.println("现在是CCTV综合频道！");
                break;
            default:
                System.out.printf("选择的频道%d不存在，请重新选择！",choice);
                break;
        }
    }
}
