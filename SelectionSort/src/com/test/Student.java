package com.test;

/**
 * @author 李国栋
 * @create 2020-11-11 9:56 上午
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals (Object object) {
        if (this == object)
            return true;

        if (object == null )
            return false;

        if (this.getClass() != object.getClass())
            return false;

        Student student = (Student) object;
        return this.getAge() == student.getAge() && this.getName().equals(student.getName());
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return String.format("Student (name : %s,age : %d)",name,age);
    }
}
