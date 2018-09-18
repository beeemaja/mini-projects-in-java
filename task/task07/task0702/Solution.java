package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 8; i++){
            list[i] = in.readLine();
        }
        for(int j = list.length-1; j >= 0; j--)
            System.out.println(list[j]);
    }
}