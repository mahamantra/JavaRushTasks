package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University {

    private String name;
    private int age;
    private List<Student> students=new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public University(String name, int age) {

    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public Student getStudentWithAverageGrade(double grade) {
        for (Student s:students
             ) {
            if(s.getAverageGrade()==grade)return s;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.getAverageGrade()-o1.getAverageGrade());
            }
        });


        return students.get(0);
    }

    public Student getStudentWithMinAverageGrade() {
        return Collections.max(students, (o1, o2) -> Double.compare(o2.getAverageGrade(),o1.getAverageGrade()));
    }

    public void expel(Student student){
        students.remove(student);
    }

   /* public static void main(String[] args) {
        List<Student> sss = new ArrayList<>();
        sss.add(new Student("a", 1, 2));
        sss.add(new Student("b", 2, 2));
        sss.add(new Student("c", 3, 3));
        Student ddd=new Student("del",13,2323);
        sss.add(ddd);
        sss.add(new Student("d", 1, 4));
        sss.add(new Student("e", 1, 5));
University university=new University("qq    ",22);
university.setStudents(sss);

        System.out.println(university.getStudentWithMinAverageGrade().getAverageGrade());
        System.out.println(university.students);

        university.expel(ddd);
        System.out.println(university.students);
    }*/


}