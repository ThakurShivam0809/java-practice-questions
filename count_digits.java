package com.company;
import java.util.* ;

public class count_digits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        int count = 0;
        for (int i = 1; i<=c.length(); i++ ){
            count++;
        }
        System.out.println(count);

    }
}
