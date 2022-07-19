package com.company;
import java.util.*;

public class benjamin_bulbs {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int num = 0;
    for (int i = 1; i<=n; i++){
        int count = 0;
        for(int j = 1; j<=i; j++){
        if (i%j == 0){
            count ++;
        }}
        if (count % 2 != 0){
             num++;
    }}
    System.out.println(num);
}}
