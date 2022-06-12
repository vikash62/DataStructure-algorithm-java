package com.bridgelabz.ds;


import java.util.Scanner;

public class InsertionSort
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");

        int n = sc.nextInt();
        System.out.println("Enter elements of array");

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        //int a[] = {5,1,6,2,4,3};
        int temp,j;
        for (int i = 1; i < a.length; i++)
        {
            temp = a[i];
            j=i;
            while(j>0 && a[j-1]>temp) {

                a[j] = a[j-1];
                j= j-1;
            }
            a[j] = temp;
        }
        System.out.println("Insertion Sort Array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

    }
}