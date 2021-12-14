package chapter05.inheritance;

import chapter05.abstractClasses.Person;

import java.util.Objects;

public class Employee extends Person {


    private double salary;
    private String name;

    public Employee(){

    }
    public Employee(String name, double salary){
//        super(name);
        this.name = name;
        this.salary = salary;
    }


    public double getSalary(){
        return salary;
    }
    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public boolean equals(Object otherObject){
        if(this == otherObject) return true;

        if(otherObject == null) return false;

        if(getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;

        return Objects.equals(name, other.name) && salary == other.salary ;
    }
}
