package com.company.patterns;
import java.util.Scanner;

public class pattern_17 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int space = n/2;
        int str = 1;
        for(int i = 1; i<= n; i++){
           
            for(int j = 1; j<=space; j++){
                if(i == n/2 + 1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            for(int k = 1; k<=str;k++){
                System.out.print("*\t");
            }
            if (i<=n/2){
                str ++;
            }
            else{
                str --;
            }
            System.out.println("\n");

        }
    
}}
