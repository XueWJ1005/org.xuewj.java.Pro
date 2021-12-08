package chapter05.abstractClasses;

import chapter05.abstractClasses.Person;

public class Student extends Person {

    private final String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "a student major in" + major;
    }
}
