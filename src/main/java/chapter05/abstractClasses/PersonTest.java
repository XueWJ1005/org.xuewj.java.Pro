package chapter05.abstractClasses;

import chapter05.inheritance.Employee;

public class PersonTest {

    public static void main(String[] args) {

        Person[] people = new Person[2];

        people[0] = new Employee("harry", 10000);
        people[1] = new Student("maria", "computer science");

        for (Person p :
                people) {
            System.out.println(p.getName() + "," + p.getDescription());
        }
    }

}
