package com.company.patterns;
import java.util.Scanner;

public class pattern_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1;
        while(l<=n){
            int m = (n -1) /2; 
            int k = l;
                while(m != 0){
                    System.out.print("\t");
                    m--;}
                while(k != 0){
                    System.out.print("*\t");
                    k--;}  
                l = l+2;
                System.out.println("\n");

            }
            l= l-4;
            while(l>=1){
                int m = (n-1)/2; 
                int k = l;
                    while(m != 0){
                        System.out.print("\t");
                        m--;}
                    while(k != 0){
                        System.out.print("*\t");
                        k--;}  
                    l = l-2;
                    System.out.println("\n");}
     }}
