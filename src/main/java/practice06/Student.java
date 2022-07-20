package practice06;

import practice06.Person;

public class Student extends Person {

    private Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public String introduce(){
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am at Class " + this.getKlass().getNumber() + ".";
    }

    public Klass getKlass() {
        return this.klass;
    }
}
