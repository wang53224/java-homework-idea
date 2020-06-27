package com.google;

class Person {

    //定义成员变量
    private String name;
    private int age;

    //定义构造方法
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //重写equals方法
    public boolean equals(Object obj){
        //第一种重写equals方法
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Person temp = (Person) obj;//强制转换成Person对象
        if(this.name.equals(temp.name) && this.age == temp.age)
            return true;
        return false;
    }

    public String toString(){
        return "姓名："+name+",年龄:"+age;
    }
}

public class TestPerson{
    //向Person数组追加一个temp
    public static boolean contains(Person[] per,Object temp){
        for (Person p:per){
            if (p.equals(temp))
                return true;
        }
        return false;
    }

    public static void showPerson(Person[] per){
        System.out.println("取经人物数组：");
        for (Person p: per)
            System.out.println(p);
    }

    public static void main(String[] args) {
        Person[] group = {new Person("孙悟空",20),new Person("猪八戒",19),
        new Person("唐僧",35),new Person("沙和尚",27)}  ;

        //调用contains方法判断是否存在per
        System.out.println("1.有唐僧吗？"+contains(group,group[2]));
        System.out.println("1.有唐僧吗？"+contains(group,new Person("唐僧",35)));
        System.out.println("2.有唐僧吗？"+contains(group,new Person("唐僧",30)));
        System.out.println("3.有唐僧吗？"+contains(group,new Person("玄奘",35)));
        System.out.println("4.有唐僧吗？"+contains(group,new String("唐僧")));
        System.out.println("5.有空空吗？"+contains(group,null));

        //调用方法输出Person对象数组
        showPerson(group);
    }
}