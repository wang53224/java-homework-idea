package core.equals;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject){

        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;
        return Objects.equals(name,other.name) && salary == other.salary && Objects.equals(hireDay,other.hireDay);
        //为了防止name,hireDay可能为null的情况，需要使用Objects.equals方法。
        //如果两个参数都为null, Objects.equals(a,b)返回true.
        //如果其中一个参数为null, 则返回false.
        //如果两个参数都不为null, 则调用 a.equals(b).
    }

    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    public String toString(){
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}

