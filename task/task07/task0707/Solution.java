package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        for(int i = 0; i < 5; i++){

            list.add(s);
        }
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
