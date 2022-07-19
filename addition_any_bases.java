package com.company;
import java.util.Scanner;

public class addition_any_bases {
    public static void add(int b, int n1, int n2){
        int count = 1;
        int value = 0;
        int rem = 0;
        while(n1!= 0 && n2!=0){
            int x = n1%10;
            int y = n2%10;
            int res = x + y + rem;
            if(res >= b){
                res = x + y - b + rem;
                rem++;
            }
            else{
                res = x+y+ rem ; 
            }
            int r = res *count;
            value = value + r;
            count = count*10;
            n1 = n1/10;
            n2 = n2/10;
            if(rem>1){
                rem--;
            }

        }
        value = value + (rem*count);
        System.out.println(value);

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        add(b,n1,n2);

    }
    
}
