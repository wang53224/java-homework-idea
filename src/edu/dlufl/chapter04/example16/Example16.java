package edu.dlufl.chapter04.example16;

class Animal{
    void shout(){
        System.out.println("动物叫！");
    }
}

public class Example16 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.toString());
    }
}
