package practice10;

import practice10.Student;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    public Integer number;

    public Student leader;

    public List<Student> studentList = new ArrayList<>();

    public List<Teacher> teacherList = new ArrayList<>();

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
            for (Teacher teacher : this.teacherList) {
                System.out.print("I am " + teacher.getName() + ". I know " + student.getName() +
                        " become Leader of Class " + this.number + ".\n");
            }

            this.leader = student;
        }

    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        for (Teacher teacher : this.teacherList) {
            System.out.print("I am " + teacher.getName() + ". I know " +
                    student.getName() + " has joined Class " + this.number + ".\n");
        }
        student.setKlass(this);
        this.studentList.add(student);
    }

}