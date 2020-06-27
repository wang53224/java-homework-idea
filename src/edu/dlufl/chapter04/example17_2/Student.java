package edu.dlufl.chapter04.example17_2;

public class Student {
    int age;
    String name;

    public Student(String name,int age) {
        super();
        this.age = age;
        this.name = name;
    }

    void study(){
        System.out.println("开始上课！");
    }
    public String toString(){
        return "Student [name=" + name + ",age=" + age + "]";
    }
}
