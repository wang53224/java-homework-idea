package core.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TimeTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(1000, listener);        //构造定时器，每隔interval毫秒通告 listener 一次。
        t.start();      //启动定时器，成功后定时器调用监听器的 actionPerformed。

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

/**
 * static void showMessageDialog(Component parent , Object message);
 *显示一个包含一条消息和OK按钮的对话框
 * 位于parent组件的中央
 * 如果parent为null，显示在屏幕中央
 */