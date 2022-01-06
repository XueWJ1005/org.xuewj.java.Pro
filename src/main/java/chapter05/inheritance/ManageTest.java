package chapter05.inheritance;

import chapter05.inheritance.Employee;
import chapter05.inheritance.Manage;

public class ManageTest {

    public static void main(String[] args) {

        Manage boss = new Manage("harry", 10000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Tina", 20000);
        staff[2] = new Employee("Jack", 30000);

        for (Employee e:
             staff) {
            System.out.println(e.getClass().getName() + " name = " + e.getName() + ",salary = " + e.getSalary());
        }

//        System.out.println(staff[0]);
    }
}
