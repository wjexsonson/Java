package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class Task27_1 {
    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<>();
        people.put("Кузьмин", "Никита");
        people.put("Коробкин", "Илья");
        people.put("Ильюк", "Илья");
        people.put("Кушнарёв", "Роман");
        people.put("Дорохин", "Дмитрий");
        people.put("Миненко", "Владимир");
        people.put("Фоминок", "Роман");
        people.put("Березин", "Алексей");
        people.put("Голубев", "Андрей");
        people.put("Москаленко", "Иван");
        people.put("Скутин", "Данил");
        System.out.println("Список до коррекции:\n"+people);
        ArrayList<String> toDelete = new ArrayList<>();
        for (String surname:people.keySet()){
            String name = people.get(surname);
            for (String surname2:people.keySet()){
                String name2 = people.get(surname2);
                if (name2.equals(name) && !surname.equals(surname2)){
                    toDelete.add(surname);
                }
            }
        }
        for(String surname:toDelete){
            people.remove(surname);
        }
        System.out.println("Список после коррекции:\n"+people);
        people.clear();
    }
}