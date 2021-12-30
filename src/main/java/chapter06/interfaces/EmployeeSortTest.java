package chapter06.interfaces;

import chapter05.inheritance.Employee;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("harry", 10000);
        staff[1] = new Employee("Tina", 20000);
        staff[2] = new Employee("Jack", 30000);

        Arrays.sort(staff);

        for (Employee e:
                staff) {
            System.out.println(e.getClass().getName() + " name = " + e.getName() + ",salary = " + e.getSalary());
        }
    }
}
