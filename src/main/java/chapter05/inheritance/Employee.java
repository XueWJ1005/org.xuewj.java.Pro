package chapter05.inheritance;

import chapter05.abstractClasses.Person;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {

    private double salary;
    private String name;
    private LocalDate hireDay;
//    private Date hireDay;


    public Employee() {

    }

    public Employee(String name, double salary) {
//        super(name);
        this.name = name;
        this.salary = salary;
//        hireDay = new Date();
    }

    public Employee(String name, double salary, int year, int month, int day){
        this(name, salary);
        hireDay = LocalDate.of(year, month, day);
    }

/*    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee)super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }*/

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

/*    public void setHireDay(int year, int month, int day){
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }*/

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString() {
//        return "Employee[name = " + name + ",salary= " + salary + ",hireDay=" + hireDay + "]";
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }


    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}
