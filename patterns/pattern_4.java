package com.company.patterns;
import java.util.Scanner;

public class pattern_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i>=1; i--){
                int k = n- i;
                int l = i;
                while (k != 0){
                    System.out.print(" ");
                    k--;
                }
                while (l != 0){
                    System.out.print("*");
                    l--;
                }
                System.out.println("\n");

    }
    
}}
