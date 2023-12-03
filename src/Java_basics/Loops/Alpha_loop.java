package Loops;

public class Alpha_loop {
    public static void main(String[] args) {
        char a='A';
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println("");
        }
    }

}
