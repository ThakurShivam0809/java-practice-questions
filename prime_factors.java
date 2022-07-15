package com.company;
import java.util.Scanner;

public class prime_factors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int i = 2; i<= c; i++){
            int count = 0;
            for(int k = 2; k*k<=i; k++ ){
                if(i%k==0) {
                    count++;}}
            if (count == 0){
                while(c%i == 0){
                    System.out.println(i);
                    c = c/i; }}}}}
