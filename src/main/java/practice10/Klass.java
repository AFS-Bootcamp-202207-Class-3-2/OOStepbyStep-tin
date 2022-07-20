package practice10;

import practice10.Student;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    public Integer number;

    public Student leader;

    public List<Student> studentList = new ArrayList<>();

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }



    public void assignLeader(Student student) {
        if(!this.studentList.contains(student)){
            System.out.print("It is not one of us.\n");
            this.leader = null;
        }else {
            System.out.print("I am Tom. I know Jerry become Leader of Class 2.\n");
            this.leader = student;
        }

    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        System.out.print("I am Tom. I know Jerry has joined Class 2.\n");
        student.setKlass(this);
        this.studentList.add(student);
    }

}