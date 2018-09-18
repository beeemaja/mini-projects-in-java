package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String n1 = input.readLine();
        String n2 = input.readLine();
        String n3 = input.readLine();

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);

        if ((a >= (b+c)) || (b >= (a + c)) || (c >= (a + b)))
            {
            System.out.println("Треугольник не существует.");
            }
        else
            {
            System.out.println("Треугольник существует.");
            }
    }
}