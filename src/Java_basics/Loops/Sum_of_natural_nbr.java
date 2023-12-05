package Java_basics.Loops;

import java.util.Scanner;

public class Sum_of_natural_nbr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int sum=0;
        int i=1;
        while (i<=N){
            sum +=i;
            i++;
        }
        System.out.println(sum);
    }
}
