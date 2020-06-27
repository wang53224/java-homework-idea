package com.google;

import java.util.Scanner;

public class InputText {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();
        System.out.print("Input your old: ");
        int age = in.nextInt();
        System.out.println("Hello," + name + ".Next age,you'll be " + (age + 1));
    }
}
