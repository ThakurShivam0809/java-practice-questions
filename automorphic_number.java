package com.company;
import java.util.* ;

public class automorphic_number {
    public static void main(String args[])  {  
        Scanner in = new Scanner(System.in);  
        int num = in.nextInt();  
        int count=0;  
        int square = num*num;  
        int temp = num;    
        while(temp>0)  {  
            count++;  
            temp=temp/10; 
        }   
        int lastDigit = (int) (square%(Math.pow(10, count)));   
        if(num == lastDigit)  
        System.out.println(num+ " is an automorphic number.");  
        else  
        System.out.println(num+ " is not an automorphic number.");  
    }  
}  
