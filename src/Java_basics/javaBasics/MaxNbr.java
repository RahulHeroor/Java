package javaBasics;

import java.util.Scanner;

public class MaxNbr {
    Scanner scanner=new Scanner(System.in);


   public MaxNbr(){
        System.out.print("enter a :");
        int a=scanner.nextInt();
        System.out.print("enter b :");
        int b=scanner.nextInt();
        System.out.print("enter c :");
        int c=scanner.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("the max of 3 nbr is :a="+a);
            }
            else System.out.println("the max of 3 nbr is :c="+c);
        }
        else {
            if(b>c){
                System.out.println("the max of 3 nbr is : b="+b);
            }
            else System.out.println("the max of 3 nbr is :c="+c);
        }

    }
    public static void main(String[] args) {
        MaxNbr obj=new MaxNbr();

    }
}
