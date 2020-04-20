package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int mt = Integer.MIN_VALUE;//integerที่น้อยที่สุด
        for (int i=1;i<=n;i++){
            int x = scan.nextInt();
            if (x>mt){
                mt = x;
            }
        }
        System.out.printf("%d",mt);
    }
}
