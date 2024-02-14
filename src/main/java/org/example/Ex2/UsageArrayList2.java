package org.example.Ex2;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList2 {
    public static void main(String[] args) {

        // Перебрать ArrayList и найти наименьший элемент.
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int minElement = list.get(0);
        for (Integer integer : list) {
            if (integer < minElement) {
                minElement = integer;
            }
        }
        System.out.println(minElement);
        System.out.println("---------------------------------");

        // Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
        List<String> stringList = List.of("Tom", "Jon", "Sam", "Karl", "Pol", "Tim", "Piter", "Petra");
        char sample = 'P';
        int countChar = 0;
        for (String s : stringList) {
            if (s.charAt(0) == sample) {
                countChar++;
            }
        }
        System.out.println(countChar);
        System.out.println("---------------------------------");

        // Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию
        List<Kinder> kinderList = new ArrayList<>(List.of(new Kinder("Катя", 18), new Kinder("Оля", 20),
                new Kinder("Тамара", 5), new Kinder("Валера", 7), new Kinder("Марк", 2)));
        final int removeAge = 18;
        for (int i = 0; i < kinderList.size(); i++) {
            if (kinderList.get(i).getAge() > removeAge) {
                kinderList.remove(i);
            }
        }
        System.out.println(kinderList);
    }
}
