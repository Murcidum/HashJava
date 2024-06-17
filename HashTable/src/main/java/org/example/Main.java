package org.example;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        // Создаёт хэш-карту
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Маша", (3434.34));
        balance.put("Михаил",(123.22));
        balance.put("Олег", (1378.00));
        balance.put("Денис", (99.22));
        balance.put("Антон", (-19.08));

        // Показывает все балансы в хэш-таблицы.
        names = balance.keys();

        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Вносим 1,000 в аккаунт Маши.
        bal = ((Double)balance.get("Маша")).doubleValue();
        balance.put("Маша", (bal + 1000));
        System.out.println("Новый баланс Маши: " + balance.get("Маша"));
    }
}