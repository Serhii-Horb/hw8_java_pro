package org.example.Ex3;

public class Peoples {
private String name;
private int age;

    public Peoples(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Peoples{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
