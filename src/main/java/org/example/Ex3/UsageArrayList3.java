package org.example.Ex3;
/*

*/

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList3 {
    public static void main(String[] args) {
        // Перебрать ArrayList и объединить все элементы в одну строку.
        List<String> list = List.of("A", "B", "C", "D", "E");
        StringBuilder depletedString = new StringBuilder();
        for (String str : list) {
            depletedString.append(str);
        }
        String resString = depletedString.toString();
        System.out.println(resString);

        // Создать ArrayList с объектами вашего собственного класса и вывести только те,
        //которые удовлетворяют определенному условию.
        List<Peoples> peoples = new ArrayList<>(List.of(new Peoples("Тамара", 7), new Peoples("Боб", 9),
                                new Peoples("Даша", 18), new Peoples("Олег", 12)));
        for (Peoples people : peoples) {
            if (people.getAge() % 2 == 0) {
                System.out.println(people);
            }
        }
    }
}

