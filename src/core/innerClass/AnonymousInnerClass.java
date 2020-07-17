package core.innerClass;
//匿名内部类实现语音时钟
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


/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClockAnonymous{
    /**
     * Starts the clock
     * @param interval the intervals between messages (in milliseconds)
     * @param beep true if the clock should beep
     */
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