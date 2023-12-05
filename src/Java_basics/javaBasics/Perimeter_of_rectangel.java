package Java_basics.javaBasics;

import java.util.Scanner;

public class Perimeter_of_rectangel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length");

        int length=scanner.nextInt();
        System.out.println("enter width of a rectangle");
        int width=scanner.nextInt();

        int parimeter=2*(length+width);

        System.out.println(parimeter);


    }
}
