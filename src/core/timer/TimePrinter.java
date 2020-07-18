package core.timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}

//static Toolkit getDefaultToolkit()    获得默认的工具箱，工具箱包含有关GUI环境的信息
//void beep()       发出一声铃响
