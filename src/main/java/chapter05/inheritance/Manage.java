package chapter05.inheritance;

import chapter05.inheritance.Employee;

public class Manage extends Employee {


    private double bonus;

    public Manage(String name, double salary){
        super(name, salary);
        bonus = 0;
    }

    public Manage(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) return false;
        Manage other = (Manage) otherObject;
        return bonus == other.bonus;
    }

    public String toString(){
        return super.toString() + "[bonus=" + bonus + "]";
    }


}
