package core.constructor;

import java.util.Random;

class Employee {
    private static int nextId;

    private int id;
    private String name = "";       //instance field initialization
    private double salary;

    //static initialization block
    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    //three overloaded constructors
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        // calls the Employee(String, double) constructor
        this("Employee #" + nextId, salary);
    }

    public Employee(){
        // the default constructor
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
