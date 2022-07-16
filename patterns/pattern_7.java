package com.company.patterns;
import java.util.Scanner;

public class pattern_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
                int l = i-1;
                while(l != 0){
                    System.out.print("\t");
                    l--;
                }
                System.out.println("*");
            }}}