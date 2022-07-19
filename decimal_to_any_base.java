package com.company;
import java.util.*;


public class decimal_to_any_base {
    public static void convert(int d, int b){
    int count = 1;
       int result = 0;
       while (d!=0){
           int y = d%b;
           int r = y * count;
           result  = result +r;
           count = count* 10;
           d = d/b;}
       System.out.println(result); }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int b = sc.nextInt();
        convert(d,b);
       }}
