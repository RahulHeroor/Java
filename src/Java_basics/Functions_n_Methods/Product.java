package Java_basics.Functions_n_Methods;

import java.util.Scanner;

public class Product {
    public static int product(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int ans=product(a,b);
        System.out.println(ans);
    }
}
