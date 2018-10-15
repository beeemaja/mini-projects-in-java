package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.ArrayList;
/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Сидоров", "Михаил");
        map.put("Сидорова", "Мария");
        map.put("Сидор", "Тамара");
        map.put("Сирова", "Любовь");
        map.put("Дорова", "Изабелла");
        map.put("Тихов", "Степан");
        map.put("Иванов", "Кирилл");
        map.put("Шмихов", "Леонид");
        map.put("Снидоров", "Федор");
        map.put("Творожников", "Данил");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
            ArrayList<String> list = new ArrayList<>(map.values());
           // for (Map.Entry<String, String> pair : map.entrySet())
           // {
           //    String value = pair.getValue();
           //    list.add(value);
           // }
            
            for(String s : list){
               if(Collections.frequency(list, s) > 1){
                   removeItemFromMapByValue(map, s);
               }
            }

        
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
