package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator; 

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
       HashSet<Integer> nums = new HashSet<>();
       for(int i = 0; i < 20; i++){
           nums.add(i);
       }
       return nums;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        
    Iterator itr = set.iterator(); 
        while (itr.hasNext()) 
        { 
            int x = (Integer)itr.next(); 
            if (x > 10) 
                itr.remove(); 
        } 
        return set;
    }

    public static void main(String[] args) {

    }
}
