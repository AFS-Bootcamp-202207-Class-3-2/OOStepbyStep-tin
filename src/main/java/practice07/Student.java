package practice07;

import practice07.Klass;
import practice07.Person;

public class Student extends Person {

    private Klass klass;

    public Student(Integer id, String name, int age) {
        super(id, name, age);
    }

    public Student(Integer id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    @Override
    public String introduce(){
        if(this.klass.getLeader() == null){
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am at Class " + this.getKlass().getNumber() + ".";
        }else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am Leader of Class " + this.getKlass().getNumber() + ".";
        }

    }

    public Klass getKlass() {
        return this.klass;
    }
}
