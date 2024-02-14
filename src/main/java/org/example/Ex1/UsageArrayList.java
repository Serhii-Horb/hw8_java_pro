package org.example.Ex1;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {


    public static void main(String[] args) {
        // Найти сумму всех элементов ArrayList.
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4));
        System.out.println("----------------------------------");

        //Перебрать ArrayList и вывести все элементы на экран.
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("----------------------------------");

        // Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        List<People> people = new ArrayList<>();
        people.add(new People("Оля", 23));
        people.add(new People("Толя", 33));
        people.add(new People("Валя", 43));
        System.out.println(people);
    }
}
