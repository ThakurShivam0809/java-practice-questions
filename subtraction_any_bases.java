package com.company;
import java.util.Scanner;

public class subtraction_any_bases {
    public static void subtract(int b, int n1, int n2){
        boolean rem = false;
        int count = 1;
        int sub = 0;
        int res =0;
        while(n1!=0 && n2 != 0 ){
            int x = n1%10;
            int y = n2%10;
            
            if (rem == true){
                y = y-1;
            }
            if(x>y){
                res = y + b - x;
                rem = true;
                
            }
            else{
                res = y-x;
                rem = false;
            }
            int result = res * count;
            sub = sub + result;
            n1 = n1/10;
            n2 = n2/10;
            count = count *10;

        }
        System.out.println(sub);
        System.out.println(res);
        System.out.println(rem);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        subtract(b, n1, n2);
    }
}
