package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

        String name = input.readLine();
        String num1 = input.readLine();
        int n1 = Integer.parseInt(num1);
        String num2 = input.readLine();
        int n2 = Integer.parseInt(num2);
        System.out.println(name + " получает " + n1 + " через " + n2 + " лет.");
    }
}
