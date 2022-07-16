package com.company.patterns;
import java.util.Scanner;

public class pattern_15 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int space = n/2;
        int st = 1;
        int l = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= space;j++){
                System.out.print("\t");
            }
            int m = l;
            for(int k = 1; k<= st;k++){
                System.out.print(m+"\t");
                if(k<=st/2){
                    m++;}
                else{
                    m--;
                }
            }
            if(i<=n/2){
                space--;
                st = st +2;
                l++;
            }
            else{
                space++;
                st = st-2;
                l--;
            }
        
            System.out.println("\n");
        }
}}
