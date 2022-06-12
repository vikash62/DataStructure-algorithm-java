package com.bridgelabz.ds;

import java.util.Arrays;
public class BinarySearch
{
    public static void main(String[] args) {
        String[] words = {"pooja", "rahul", "vikash", "rajan", "raju" };
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        int index, left=0;

        int right = words.length-1;
        while (true)
        {
            int mid = (left+right) / 2;
            if (words[mid].compareTo("vikash") == 0){
                System.out.println("vikash is on : "+mid);
                break;
            }else if (words[mid].compareTo("vikash") > 0){
                System.out.println("vikash is : " + (mid-1));
                break;
            }
            else{
                System.out.println("vikash is : "+(mid+1));
                break;
            }
        }
    }
}