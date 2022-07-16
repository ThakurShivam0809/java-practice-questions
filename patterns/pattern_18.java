package com.company.patterns;
import java.util.Scanner;

public class pattern_18 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int c = n;
        int space = 1;
        for(int i =1; i<= n;i++){
            for(int k = 1; k<space;k++){
                System.out.print("\t");
            }
            for(int j = c; j>=1;j--){
                if(i> 1 && i<= n/2 && j>1 && j<c){
                    System.out.print("\t");}
                else{
                    System.out.print("*\t");}    
            }
            if(i<=n/2){
                c-=2;
                space++;
            }
            else{
                c+=2;
                space--;
            }
            
            System.out.println("\n");

        }
}}
