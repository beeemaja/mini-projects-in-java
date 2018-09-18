package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;



    public Cat() {
    }


    public boolean fight(Cat anotherCat) {
    int power = this.age*this.weight*this.strength;
    int power2 = anotherCat.strength*anotherCat.age*anotherCat.weight;


        if (power > power2){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
