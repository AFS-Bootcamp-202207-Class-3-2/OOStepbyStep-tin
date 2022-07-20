package practice06;

import practice06.Person;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduceWith(Student student) {
        if(student.getKlass().getNumber().equals(this.klass.getNumber())){
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public String introduce() {
        if(this.getKlass() != null){
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + this.klass.getNumber() + ".";
        }else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }

    public Klass getKlass() {
        return this.klass;
    }
}
