package edu.dlufl.chapter04.example09_1;

public class Instrument {
    String label = "instrument";

    public void play(){
        System.out.println("Instrument.play()");
    }
    public void play2(){
        System.out.println("Instrument.play2()");
    }
}

class Wind extends Instrument{
    String label = "wind";

    public void play() {
        System.out.println("Wind.play()");
    }

    public void play3(){
        System.out.println("Wind.play3()");
    }
}