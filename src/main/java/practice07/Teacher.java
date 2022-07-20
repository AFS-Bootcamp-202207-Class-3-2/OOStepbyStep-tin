package practice07;

import practice07.Klass;
import practice07.Person;
import practice07.Student;

public class Teacher extends Person {

    private practice07.Klass klass;

    public Teacher(Integer id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, int age, Klass klass) {
        super(id, name, age);
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
