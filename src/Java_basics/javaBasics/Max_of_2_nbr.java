package Java_basics.javaBasics;

import java.util.Scanner;

public class Max_of_2_nbr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a :=");
        int a=scanner.nextInt();
        System.out.println("enter b :=");
        int b=scanner.nextInt();

        if(a>b) System.out.println("the max of the 2 nbr is a="+a);
        else System.out.println("the max of the 2 nbr is b="+b);
    }
}
