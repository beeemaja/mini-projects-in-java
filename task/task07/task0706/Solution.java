package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws Exception {
        int[] num = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 1; i < num.length; i++){
            sumEven += num[2*i-1];
        }

        for(int i = 0; i < num.length; i++){
            sumOdd += num[2*i];
        }

        if(sumEven < sumOdd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }

}
