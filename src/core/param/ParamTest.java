package core.param;

/**
 * This program demonstrates parameter passing in Java.
 */
public class ParamTest {
    public static void main(String[] args) {

    }

    public static void tripleValue(double x) {              //doesn't work
        x = 3 * x;
        System.out.println("End of method: x = " + x);
    }
    public static void tripleSalary(Employee x){            //works
        x.raiseSalary(200);
        System.out.println("End of method: salary = " + x);
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;

        System.out.println("End of method: x = " + x.getName());
        System.out.println("End of method: y = " + y.getName());
    }
}
