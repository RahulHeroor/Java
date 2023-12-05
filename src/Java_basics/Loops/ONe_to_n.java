package Java_basics.Loops;

import java.util.Scanner;

public class ONe_to_n {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}

