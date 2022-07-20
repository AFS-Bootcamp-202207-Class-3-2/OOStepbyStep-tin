package practice08;

import java.util.Objects;

public class Person {

    private Integer id;

    private String name;

    private int age;

    public Person(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && id.equals(person.id) && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
