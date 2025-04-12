package org.Map;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int grade;
    private Map <String, Student> studentsList;

    public Map<String, Student> getStudentsList() {
        return studentsList;
    }

    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (0<=grade && grade<=100) this.grade = grade;
        else throw new IllegalArgumentException("Incorrect range value to grade");
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", grade=" + grade +

                '}' + "\n\n";
    }
}
