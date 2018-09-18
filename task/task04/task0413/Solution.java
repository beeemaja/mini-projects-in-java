package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String n = input.readLine();
        int num = Integer.parseInt(n);
        String numDay = "";
        switch (num) {
            case 1:
                numDay = "понедельник";
                break;
            case 2:
                numDay = "вторник";
                break;
            case 3:
                numDay = "среда";
                break;
            case 4:
                numDay = "четверг";
                break;
            case 5:
                numDay = "пятница";
                break;
            case 6:
                numDay = "суббота";
                break;
            case 7:
                numDay = "воскресенье";
                break;
            default:
                System.out.println("такого дня недели не существует");
                break;
            }
        System.out.println(numDay);

        }
    }
