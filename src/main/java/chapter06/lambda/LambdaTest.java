package chapter06.lambda;

import javax.swing.*;
import java.sql.Time;
import java.util.Arrays;
import java.util.Date;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length: ");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(10000, event -> System.out.println("The time is " + new Date()));
//        Timer t = new Timer(10000, System.out::println);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program");
        System.exit(0);
    }
}
