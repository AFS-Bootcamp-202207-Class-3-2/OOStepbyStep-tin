package practice10;

import common.Message;
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
            System.out.print(Message.KLASS_NOT_CONTAINS_STUDENT);
            this.leader = null;
        }else {
            for (Teacher teacher : this.teacherList) {
                System.out.print(String.format(Message.KLASS_CONTAINS_STUDENT,teacher.getName(),student.getName(),this.number));
            }

            this.leader = student;
        }

    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        for (Teacher teacher : this.teacherList) {
            System.out.print(String.format(Message.KLASS_APPEND_MEMBER,teacher.getName(), student.getName(), this.number));
        }
        student.setKlass(this);
        this.studentList.add(student);
    }

}