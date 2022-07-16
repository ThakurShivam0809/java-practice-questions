package com.company.patterns;
import java.util.Scanner;
public class pattern_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=n;i++){
            for (int j = 1; j<=n;j++ ){
                if(j == ((n+1)/2)-count || j == ((n+1)/2)+ count){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
              }
            System.out.println("\n");
            if(i<=n/2){
                count++;}
            else{
                count--;
            }
        }

    }
    
}
