package com.company;
import java.util.* ;

public class palindrome {
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();//It is the number variable to be checked for palindrome  
        int r,sum=0,temp; 
        temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("palindrome number ");    
        else    
         System.out.println("not palindrome");    
      }  
      }  
