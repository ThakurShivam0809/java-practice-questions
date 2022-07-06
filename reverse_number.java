package com.company;
import java.util.* ;

public class reverse_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while(c != 0){
            System.out.print(c%10);
            c = c/10;
        }}}
