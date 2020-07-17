package core.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        TalkingClockAnonymous clock = new TalkingClockAnonymous();
        clock.start(1000,true);

        //keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClockAnonymous{
    public void start(int interval, boolean beep){
        ActionListener listener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is " + new Date());
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }
}