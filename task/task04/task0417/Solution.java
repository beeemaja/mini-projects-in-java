package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

       String n = input.readLine();
       String n2 = input.readLine();
       String n3 = input.readLine();

       int a = Integer.parseInt(n);
       int b = Integer.parseInt(n2);
       int c = Integer.parseInt(n3);

       if (a==b)
       {
           System.out.print(a);
           System.out.print(b);
       }
       else if (a==c)
       {
           System.out.print(a);
           System.out.print(c);
       }
       else if (b==c)
       {
           System.out.print(b);
           System.out.print(c);
       }
       else if ((a==b) && (a==c))
       {
           System.out.print(a);
           System.out.print(b);
           System.out.print(c);
       }
    }
}