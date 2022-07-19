package com.company;
import java.util.* ;

public class digits_of_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int nc = c;
        int count = 0;
        while (nc != 0){
            nc = nc/10;
            count++;
        }
        int i = (int)Math.pow(10,count-1);
        while(c != 0){
            int q = c/i;
            System.out.println(q);
            c = c%i;
            i = i/10;
        }}}
