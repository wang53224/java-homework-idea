package edu.dlufl.chapter04.example17;

class Animal{
    public String toString(){
        return "这是一个动物...";
    }
}

public class Example17 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.toString());
    }
}
