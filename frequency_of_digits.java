package com.company;
import java.util.Scanner;

public class frequency_of_digits {
    public static void freq(int n , int d){
        int count = 0;
        while (n!= 0){
            int r = n%10;
            if (d == r){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }


    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        freq(n,d);
    
}}
