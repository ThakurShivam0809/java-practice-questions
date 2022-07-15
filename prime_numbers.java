package com.company;
import java.util.*;
public class prime_numbers {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for (int i = 0; i < t; i++){
        int n = scan.nextInt();
        int count = 0;
        for (int j = 2; j*j <= n; j++) {
            if (n % j == 0) {
                count++;
                break;
            }}
        if (count == 1) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }}}