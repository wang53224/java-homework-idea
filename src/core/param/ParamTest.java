package core.param;

/**
 * This program demonstrates parameter passing in Java.
 */

public class ParamTest {
    public static void main(String[] args) {
        /*
         * Test 1: Methods can't modify numeric parameters
         */
        System.out.println("Testing tripleValues: ");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        /*
         * Test 2: Methods can change the state of object parameters
         */
        System.out.println("\n\nTesting tripleSalary: ");
        Employee Harry = new Employee("Harry", 5000);
        System.out.println("Before: salary = " + Harry.getSalary());
        tripleSalary(Harry);
        System.out.println("After: salary = " + Harry.getSalary());

        /*
         * Test 3: Methods can't attach new objects to object parameters
         */
        System.out.println("\n\nTesting swap: ");
        Employee Alice = new Employee("Alice", 7000);
        Employee Bob = new Employee("Alice", 7000);
        System.out.println("Before: Alice = " + Alice.getName());
        System.out.println("Before: Bob = " + Bob.getName());
        swap(Alice, Bob);
        System.out.println("After: Alice = " + Alice.getName());
        System.out.println("After: Bob = " + Bob.getName());
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
