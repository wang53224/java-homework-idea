package edu.dlufl.chapter04.example26;

public class Example26 {
    public static void main(String[] args) {
        int result = divide(4,-2);
        System.out.println(result);
    }

    public static int divide(int x, int y){
        if(y < 0){
            //throw new DivideByMinusException("除数是负数");
        }
        int result = x / y;
        return result;
    }
}
