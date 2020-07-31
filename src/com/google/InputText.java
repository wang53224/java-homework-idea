package com.google;

import java.io.Console;
import java.util.Scanner;

public class InputText {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("Input your name: ");
        String name = in.nextLine();

        // get second input
        System.out.print("Input your old: ");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello," + name + ".Next year,you'll be " + (age + 1));

        // 读取密码 NullPointerException
        try {
            Console console = System.console();
            String username = console.readLine("User name: ");
            char[]  password = console.readPassword("Password: ");
        }catch (Exception e){}

    }
}
