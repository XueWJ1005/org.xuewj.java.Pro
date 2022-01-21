package chapter06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
/*    public void greet() {
        System.out.println("hello");
    }


    class Test1 extends Test {
        public static void main(String[] args) {

        }

        public void greet() {
            Timer t = new Timer(10000, super::greet);
            t.start();
        }
    }*/
    public static void repeatMessage(String text,int delay){
        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay,listener).start();
    }
}
