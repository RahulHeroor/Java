package Question_and_ans.javaBasics01;
import java.util.Scanner;

public class Avg_og_3nbr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt();
        int sum=0;
        for(int i=0;i<N;i++){
            int Nbr=scanner.nextInt();
            sum +=Nbr;
        }
        double ans=(double) sum / N;
        System.out.println(ans);
    }

}
