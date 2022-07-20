package practice10;

import common.Message;
import practice10.Klass;
import practice10.Person;

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
            return String.format(Message.STUDENT_NOT_HAS_LEADER,this.getName(), this.getAge(), this.getKlass().getNumber());
        }else{
            return String.format(Message.STUDENT_HAS_LEADER,this.getName(), this.getAge(), this.getKlass().getNumber());
        }

    }

    public Klass getKlass() {
        return this.klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
