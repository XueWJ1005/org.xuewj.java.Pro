package chapter05.equals;

import chapter05.inheritance.Employee;
import chapter05.inheritance.Manage;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 70000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 70000, 1987, 12, 15);
        Employee bob = new Employee("Bob", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + (alice1.equals(alice3)));
        System.out.println("alice1.equals(bob): " + (alice1.equals(bob)));
        System.out.println("bob.toString(): " + bob);

        Manage carl = new Manage("Carl Cracker", 80000, 1987, 12, 15);
        Manage boss = new Manage("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}
