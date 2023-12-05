package Java_basics.Functions_n_Methods;

public class Nfactorial {
    public static int  factorial(int n){
        int m=1;
        for (int i=1;i<=n;i++){

            m *= i;
        }
        return m;

    }
    public static void main(String[] args) {
        int p=factorial(5);
        System.out.println(p);
    }
}
