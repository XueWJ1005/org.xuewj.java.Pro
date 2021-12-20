package chapter05.arrayList;

import chapter05.inheritance.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("harry", 10000));
        staff.add(new Employee("tina", 20000));
        staff.add(new Employee("mary", 30000));

        for (Employee e:
             staff) {
            e.raiseSalary(5);
        }

        for (Employee e:
             staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
