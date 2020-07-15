package core.interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);
        /*
                static void sort(Object[] a)
                使用 归并排序算法 对数组a中的元素进行排序
                要求数组中的元素必须属于实现了Comparable接口的类，并且元素间可比较
         */

        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + "\t,salary = " + e.getSalary());
        }
    }
}
