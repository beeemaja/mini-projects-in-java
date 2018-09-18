package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    String year = input.readLine();
    int y = Integer.parseInt(year);

    if (y%4 == 0){
        if (y%400 == 0){
            if(y%100 == 0)
        {
            System.out.println("количество дней в году: 366");
        }}}
    else{
        System.out.println("количество дней в году: 365");
    }
    }
}
