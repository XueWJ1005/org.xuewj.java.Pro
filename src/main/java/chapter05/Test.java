package chapter05;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        double largest = Double.NEGATIVE_INFINITY;
        System.out.println(largest);

        String classname = "java.util.Random";
        Class cl = Class.forName(classname);
        System.out.println(cl);

        try{
            String name = "java.util.Random";
            Class cl1 = Class.forName(name);
            System.out.println(cl1);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        int[] luckyNumbers = {2, 3, 4, 5};
//        String s1 = "" + luckyNumbers;
        String s1 = Arrays.toString(luckyNumbers);
        System.out.println(s1);

        String s = "OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("OK");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
    }
}
