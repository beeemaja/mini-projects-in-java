package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String sAge = input.readLine();
        int nAge = Integer.parseInt(sAge);
        String name = input.readLine();

        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}
