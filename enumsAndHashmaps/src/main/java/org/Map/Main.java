package org.Map;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Map<String, Student> studentsList;


    public static void main(String[] args) {
        studentsList = new HashMap<>();
        fillMap();
        System.out.println(studentsList.toString());
        increaseGrades(studentsList);
        System.out.println("Increment grade 10%");
        System.out.println(studentsList.toString());
    }

    public static void fillMap() {
        Student student1 = new Student("Ana Perez", 8);
        Student student2 = new Student("Felipe Gonzalez", 2);
        Student student3 = new Student("Ana Botella", 4);
        Student student4 = new Student("Emilio Botin", 10);

        studentsList.put("Ana Perez", student1);
        studentsList.put("Felipe Gonzalez", student2);
        studentsList.put("Ana Botella", student3);
        studentsList.put("Emilio Botin", student4);
    }

    public static void increaseGrades(Map<String, Student> mapList) {

        mapList.values().stream()
                .forEach(student -> {
                    int grade = student.getGrade();
                    //round value, truncate value. Corrected using Math.ceil
                    double value = grade * 1.1;
                    int up10Grade = (int) Math.ceil(value);
                    student.setGrade(up10Grade);
                });

    }
}