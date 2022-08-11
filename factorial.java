package com.company;
import java.util.* ;

public class factorial {
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        int number= sc.nextInt();//It is the number to calculate factorial  
        int fact=1;  
        for(int i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
       }  
      }  
    

