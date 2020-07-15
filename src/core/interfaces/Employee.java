package core.interfaces;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary
     * @param other another Employee object
     * @return a negative value if this employee has a low salary than otherObject
     *         ,0 if the salaries are the same, a positive value otherwise
     */
    public int compareTo(Employee other){
        return Double.compare(salary, other.salary);
        /*
                static int compare(double x, double y)
                如果 x < y,返回一个负数;
                x 等于 y , 返回 0 ;
                x > y , 返回一个正数。
         */
    }
}



