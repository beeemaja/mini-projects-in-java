package com.javarush.task.task05.task0507;
import java.io.*;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double average = 0;
        int s = 0;


            while (s != -1){
                int s = Integer.parseInt(input.readLine());
                sum += s;
                count++;
            }
        }
         System.out.println(sum/count);
    }
}

