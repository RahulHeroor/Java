package Java_basics.Question_and_ans.Operator;

import java.util.Scanner;

public class BinaryOp {
    public static void main(String[] args) {
        int A=10,B=5;
        Scanner scanner=new Scanner(System.in);
        String op=scanner.nextLine();
        if(op.equals("+")) System.out.println("A + B ="+(A + B));
        else if (op.equals("-")) System.out.println("A - B ="+(A - B));
        else if (op.equals("*")) System.out.println("A * B ="+(A * B));
        else if (op.equals("/")) System.out.println("A / B ="+(A / B));
        else System.out.println("Enter the correct operator :");

    }
}
