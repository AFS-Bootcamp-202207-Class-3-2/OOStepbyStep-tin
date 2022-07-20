package common;

import java.util.stream.Collectors;

public class Message {

    public static final String PERSON_INTRODUCE = "My name is %s. I am %d years old.";

    public static final String KLASS_NOT_CONTAINS_STUDENT = "It is not one of us.\n";

    public static final String KLASS_CONTAINS_STUDENT = "I am %s. I know %s become Leader of Class %d.\n";

    public static final String KLASS_APPEND_MEMBER= "I am %s. I know %s has joined Class %d.\n";

    public static final String STUDENT_NOT_HAS_LEADER= "My name is %s. I am %d years old. I am a Student. I am at Class %d.";

    public static final String STUDENT_HAS_LEADER= "My name is %s. I am %d years old. I am a Student. I am Leader of Class %d.";

    public static final String TEACHER_IS_TEACHING= "My name is %s. I am %d years old. I am a Teacher. I teach %s.";

    public static final String TEACHER_NOT_IS_TEACHING= "My name is %s. I am %d years old. I am a Teacher. I don't teach %s.";

    public static final String TEACHER_HAS_CLASSES= "My name is %s. I am %d years old. I am a Teacher. I teach Class %s.";

    public static final String TEACHER_NOT_HAS_CLASSES="My name is %s. I am %d years old. I am a Teacher. I teach No Class.";

}
