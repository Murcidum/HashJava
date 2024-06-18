package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        passportsAndNames.put(162348, "Сашк");

        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);

        System.out.println(passportsAndNames.containsKey(11111));
        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп"));

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);

        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

    }
}