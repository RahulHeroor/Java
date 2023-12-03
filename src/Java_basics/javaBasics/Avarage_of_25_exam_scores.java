package javaBasics;

import java.util.Scanner;

public class Avarage_of_25_exam_scores {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int count=0;
        for(int i=0;i<25;i++){
            System.out.println("Enter the marks you scored in "+(i+1)+"th exam =");
            int score=scanner.nextInt();
            sum +=score;
            count++;
        }

        float Avr=(float)sum/count;
        System.out.println("The avr of the 25 exam scrore is ="+Avr);
    }
}
