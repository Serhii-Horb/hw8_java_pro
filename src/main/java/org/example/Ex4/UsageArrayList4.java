package org.example.Ex4;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList4 {
    public static void main(String[] args) {
        // Перебрать ArrayList и найти сумму квадратов всех элементов.
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int sum = 0;
        for (Integer num : list) {
            sum += num * num;
        }
        System.out.println(sum);
        System.out.println("------------------------------------");

        // Перебрать ArrayList и найти самую короткую строку.
        List<String> stringList = List.of("Tom", "Jon", "Sam", "Karl", "Pol", "Tim", "Piter", "Petra");
        String res = stringList.get(0);
        for (String str : stringList) {
            if (res.length() >= str.length()) {
                System.out.println(str);
            }
        }
        System.out.println("------------------------------------");

        // Перебрать ArrayList и заменить все гласные буквы в каждой строке на символ
        List<String> stringList2 = List.of("Tom", "Jon", "Sam", "Karl", "Pol", "Tim", "Piter", "Petra");
        for (int i = 0; i < stringList2.size(); i++) {
            String strBefore = stringList2.get(i);
            String strAfter = strBefore.replaceAll("[aeiouAEIOU]", String.valueOf('*'));
            System.out.println(strAfter);
        }
    }
}
