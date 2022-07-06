package com.company;
import java.util.*;

public class rotate_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int nc = c;
        int count = 0;
        while (nc != 0){
            nc = nc/10;
            count++;}
        int g;
        int f = 0;
        if(d> count){
            g = d-count;
            int l = g;
            for (int i = 1; i <= g; i++){
                int k = c%10;
                c = c/10;
                int j = k * (int)Math.pow(10,count-l);
                f = f+ j;
                l--;}}
        else{
            int l = d;
            for (int i = 1; i <= d; i++){
            int k = c%10;
            c = c/10;
            int j = k * (int)Math.pow(10,count-l);
            f = f+ j;
            l--;
        }}
        System.out.println(f+c);
}}
