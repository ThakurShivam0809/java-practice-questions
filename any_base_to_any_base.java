package com.company;
import java.util.*;


public class any_base_to_any_base {
    public static void convert(int n, int b1, int b2){
        int count = 1;
        int result = 0;
            while (n!=0){
                int y = n%b2;
                int r = y * count;
                result  = result +r;
                count = count* b1;
                n = n/b2;}
        System.out.println(result); 
            
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        convert(d,b,c);
    
    
    }
}
