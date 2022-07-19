package com.company;
import java.util.* ;

public class fibonacci_numbers {
    public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            int x = 0;
            int y = 1;
            for(int i = 1; i<=n; i++){
                System.out.println(x);
                int c = x+y;
                x = y;
                y = c;
            } }}
    