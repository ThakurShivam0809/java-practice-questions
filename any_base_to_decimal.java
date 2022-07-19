package com.company;
import java.util.*;

public class any_base_to_decimal {
    public static void convert(int n, int b){
        int count = 1;
        int result = 0;
            while (n!=0){
                int y = n%10;
                int r = y * count;
                result  = result +r;
                count = count* b;
                n = n/10;}
        System.out.println(result); 
            
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int b = sc.nextInt();
        convert(d,b);
    
}}
