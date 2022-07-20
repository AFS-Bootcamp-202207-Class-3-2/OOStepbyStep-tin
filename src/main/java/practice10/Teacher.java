package practice10;

import practice10.Klass;
import practice10.Person;
import practice10.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {


    private LinkedList<Klass> list = new LinkedList<>();

    public Teacher(Integer id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, int age, LinkedList<Klass> list) {
        super(id, name, age);
        this.list = list;
    }

    public String introduceWith(Student student) {
        if(isTeaching(student)){
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    @Override
    public String introduce() {
        if(this.getClasses().size() != 0){
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + this.getClasses().stream()
                    .map(klass -> String.valueOf(klass.getNumber()))
                    .collect(Collectors.joining(", ")) + ".";
        }
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";

    }

    public List<Klass> getClasses() {
        return this.list;
    }

    public boolean isTeaching(Student student) {
        if (this.list.stream()
                .map(klass -> klass.getNumber()
                        .equals(student.getKlass()
                                .getNumber()))
                .findAny()
                .orElse(false)) {
            return true;
        }
        return false;
    }
}
