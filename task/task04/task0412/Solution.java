package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

       String n = input.readLine();
       int num = Integer.parseInt(n);
       if (num > 0)
       {
           num *= 2;
           System.out.println(num);
       }
       else if (num < 0)
       {
           num +=1;
           System.out.println(num);
       }
       else
        {
           System.out.println(0);
        }//напишите тут ваш код

    }

}