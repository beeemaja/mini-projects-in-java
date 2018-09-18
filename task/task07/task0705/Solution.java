package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] num = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < num.length; i++)
            num[i] = Integer.parseInt(br.readLine());

        int[] num2 = new int[10];
        int[] num3 = new int[10];

        System.arraycopy(num, 0, num2, 0, 10);
        System.arraycopy(num, 10, num3, 0, 10);

        for(int i = 0; i < num3.length; i++){
            System.out.println(num3[i]);
        }



    }
}
