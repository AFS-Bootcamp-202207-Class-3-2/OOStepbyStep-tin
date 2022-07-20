package practice08;

import practice08.Klass;
import practice08.Person;
import practice08.Student;

public class Teacher extends Person {

    private Klass klass;

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

    @Override
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
