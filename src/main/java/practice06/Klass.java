package practice06;

public class Klass {

    public Integer number;

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }


    public String getDisplayName() {
        return "Class " + this.number;
    }
}
