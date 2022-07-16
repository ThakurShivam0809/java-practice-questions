package com.company.patterns;
import java.util.Scanner;

public class pattern_12 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(x + " ");
                int c = x+y;
                x = y;
                y = c;
        }
        System.out.println(" ");
    }
    
}}
