package com.math;
import java.util.Scanner;
public class Math {
    public static void main (String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice (0 or 1):");
        a =sc.nextInt();
        if(a==1){
            System.out.println("Enter the number:");
            int x1 = sc.nextInt();
            System.out.println("Enter the index number:");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                int product = x1*i;
                System.out.print(product+" ");
            }
        }
        else if(a==0){
            System.out.println("Enter 1st number:");
            double x3 = sc.nextDouble();
            System.out.println("Enter 2nd number:");
            double x4 = sc.nextDouble();
            double sum = x3 + x4;
            System.out.println("The sum of numbers is "+sum);
        }

    }
}
