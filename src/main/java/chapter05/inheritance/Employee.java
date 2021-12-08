package chapter05.inheritance;

import chapter05.abstractClasses.Person;

public class Employee extends Person {


    private double salary;

    public Employee(){

    }
    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }


    public double getSalary(){
        return salary;
    }
    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }
}
