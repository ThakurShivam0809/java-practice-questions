package com.company.patterns;
import java.util.Scanner;

public class pattern_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 1;
        int star = n/2;
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<= star+1; j++){
                System.out.print("*\t");}
            for(int k = 1; k<= space; k++){
                System.out.print("\t");}
            for(int l = 1; l<= star+1; l++){
                System.out.print("*\t");}
        if (i <=(n/2)){
            space = space+2;
            star--;}
        else{
            space = space - 2;
            star++;}  
        System.out.println("\n");             
        }

    }
    
}
