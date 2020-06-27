package edu.dlufl.chapter04.example17_2;

public class Example17_2 {
    public static void main(String[] args) {
        Animal animal = new Animal("小黑",8);
        System.out.println(animal.name);
        System.out.println(animal.age);
        animal.shout();
        System.out.println(animal);
        System.out.println(animal.toString());

        Student stu = new Student("小兰", 18);
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.study();
        System.out.println(stu);
        System.out.println(stu.toString());
    }
}
