package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Leo", 4, "Pushkina" );
        Man man2 = new Man("Ivan", 35, "Lapnina");
        Woman woman = new Woman("Veronika", 25, "Tverskaya");
        Woman woman2 = new Woman("Olga", 22, "Triftstrasse");//напишите тут ваш код
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }

    public static class Man{
        public String name;
        public int age;
        public String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;

        }
    }

    public static class Woman{
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;

        }
    }
}
