package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();

        //выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount;

        public Cat(){
           catCount += 1;
        }

        //создай конструктор
    }
}
