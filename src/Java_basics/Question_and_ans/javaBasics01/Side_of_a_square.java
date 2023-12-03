package Question_and_ans.javaBasics01;

import java.util.Scanner;

public class Side_of_a_square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("enter the side");
        int side=scanner.nextInt();

        int AreaofSquare=side*side;
        System.out.printf("the area of the square is :"+AreaofSquare);
    }
}
