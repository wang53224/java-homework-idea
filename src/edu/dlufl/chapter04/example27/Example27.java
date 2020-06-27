package edu.dlufl.chapter04.example27;

public class Example27 {
    public static void main(String[] args) {
        try {
            int result = divide(4, -2);
            System.out.println(result);
        }
        catch (DivideByMinusException e){
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int x, int y) throws DivideByMinusException{
        if(y < 0){
            throw new DivideByMinusException("除数是负数");
        }
        int result = x / y;
        return result;
    }
}
