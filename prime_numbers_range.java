package com.company;
import java.util.* ;

public class prime_numbers_range {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int i = low; i <= high; i++){
            int count = 0;
            for (int j = 2; j*j<= i; j++ ){
                if (i%j == 0){
                    count++;
                }
            }
            if (count == 0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }

    }
}
