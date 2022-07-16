package com.company;
import java.util.* ;

public class inverse_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int nc = c;
        int count = 0;
        while (nc != 0){
            nc = nc/10;
            count++;}
        int f = 0;
        for (int i = 1; i <= count; i++){
            int k = c%10;
            c = c/10;
            int j = i * (int)Math.pow(10,k-1);
            f = f+ j;
        }
        System.out.println(f);
    }
}
