package practice03;

public class Student extends Person{

    private Integer klass;


    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce(){
        return "I am a Student. I am at Class " + this.getKlass() + ".";
    }
}
