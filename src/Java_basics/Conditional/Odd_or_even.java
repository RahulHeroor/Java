package Conditional;

import java.util.Scanner;

public class Odd_or_even {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nbr=scanner.nextInt();
        if(nbr%2==0) System.out.println("the given nbr is even :");
        else System.out.println("the given nbr is odd :");
    }
}
