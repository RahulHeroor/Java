package Java_basics.Question_and_ans.Conditional_statment;

import java.util.Scanner;

public class Q5_LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year");
         int Year=scanner.nextInt();
         if (Year%100 ==0 && Year% 400 ==0 || Year% 100!=0 && Year%4==0){
             System.out.println("this is the leap Year :");
         }
         else System.out.println("this not a leap year");
    }
}
