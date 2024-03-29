package org.example.Ex2;

public class Kinder {
    private String name;
    private int age;

    public Kinder(String name, int age) {
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
        return "Kinder { " +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
