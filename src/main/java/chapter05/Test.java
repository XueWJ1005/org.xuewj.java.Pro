package chapter05;

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
    }
}
