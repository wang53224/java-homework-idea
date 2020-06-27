package edu.dlufl.chapter04.example19;

//定义Animal接口
interface Animal{
    void shout();           //定义抽象方法shout()
}

public class Example19 {
    public static void main(String[] args) {
        animalShout(new Animal() {
                        @Override
                        public void shout() {
                            System.out.println("喵喵...");
                        }
                    }
        );
    }
    public static void animalShout(Animal an){
        an.shout();
    }
}
