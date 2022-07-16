package com.company.patterns;
import java.util.Scanner;

public class pattern_16 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int space = 1;
        int star = 2*n -3;
        for(int i =1; i <= n; i++){
            int a = 1;
            for (int  j = 1; j <= space; j++){
                System.out.print(a+"\t");
                a++;
            }
            for (int  k = 1; k <= star; k++){
                System.out.print(" \t");
            }
            if(i == n){
                space --;
            }
            int b = i;
            for (int  l = 1; l <= space; l++){
                System.out.print(b+"\t");
                b--;
            }
            System.out.println("\n");
            space++;
            star = star -2;
            
        }
}}
