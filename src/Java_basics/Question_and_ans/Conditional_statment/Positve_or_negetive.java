package Java_basics.Question_and_ans.Conditional_statment;

import java.util.Scanner;

public class Positve_or_negetive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the nbr :");
        int nbr=scanner.nextInt();
        if (nbr<0) System.out.println("The nbr is naegative");
        else System.out.println("the nbr is positive");

    }
}
