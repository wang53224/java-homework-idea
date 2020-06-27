package edu.dlufl.chapter04.example20;

public class Example20 {
    public static void main(String[] args) {
        int result = divide(4,0);
        System.out.println(result);
    }

    public static int divide(int x,int y){
        int result = x / y;
        return result;
    }
}
