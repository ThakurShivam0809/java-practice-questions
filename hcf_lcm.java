package com.company;
import java.util.*;

public class hcf_lcm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int j = 0;
        int k = 0;
        if (x > y ){
            j = x;
            k = y ; }
        else if (y>x){
            j = y;
            k = x;}
        //lcm
        for(int i = 1; i<= 10; i++){
            if((j*i)%k == 0){
                System.out.println(j*i);
                break;}}
        //hcf
        int n = 0;
        for (int l = 2; l <= k/2; l++ ){
            if(x%l == 0 & y%l == 0){
                n = l; }}
        System.out.println(n);
    }
}
