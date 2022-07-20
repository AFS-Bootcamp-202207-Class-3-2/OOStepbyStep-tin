package practice07;

public class Klass {

    public Integer number;

    public Student leader;

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
        this.leader = student;
    }

    public Student getLeader() {
        return this.leader;
    }
}
