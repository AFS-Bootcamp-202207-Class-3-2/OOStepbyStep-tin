package practice10;

import common.Message;
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
        for (Klass klass : list) {
            klass.teacherList.add(this);
        }
        this.list = list;
    }

    public String introduceWith(Student student) {
        if(isTeaching(student)){
            return String.format(Message.TEACHER_IS_TEACHING, this.getName(), this.getAge(), student.getName());
        }
        return String.format(Message.TEACHER_NOT_IS_TEACHING, this.getName(), this.getAge(), student.getName());
    }

    @Override
    public String introduce() {
        if(this.getClasses().size() != 0){
            return String.format(Message.TEACHER_HAS_CLASSES, this.getName(), this.getAge(),
                    this.getClasses().stream()
                    .map(klass -> String.valueOf(klass.getNumber()))
                    .collect(Collectors.joining(", ")));
        }
        return String.format(Message.TEACHER_NOT_HAS_CLASSES, this.getName(), this.getAge());

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
