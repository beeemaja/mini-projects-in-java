package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;


    public static void main(String[] args) throws Exception {
        strings = new List<>();

        BufferedReader br = new BufferedReader(InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            String s = br.readLine();
            strings.add(s);
        }

        //find max length string
        int maxLength = 0;
        String longestString = null;
        for(String a : strings){

            if(a.length() > maxLength){
                maxLength = a.length();
                longestString = a;
                System.out.println(a);
            }
        }

    }
}
