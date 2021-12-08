package chapter05.inheritance;

import chapter05.inheritance.Employee;

public class Manage extends Employee {


    private double bonus;

    public Manage(String name, double salary){
        super(name, salary);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }


}
