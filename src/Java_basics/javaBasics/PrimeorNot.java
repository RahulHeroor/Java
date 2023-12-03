package javaBasics;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();

        if(n%2==0) System.out.println("n is not a prime number");
        else System.out.println("n is a prime number");
    }
}
