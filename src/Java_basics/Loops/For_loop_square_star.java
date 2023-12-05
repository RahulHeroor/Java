package Java_basics.Loops;

public class For_loop_square_star {
    public static void main(String[] args) {
        int n=4;
       for(int colums=1;colums<=n;colums++){
           for(int row=1;row<=n;row++){
               System.out.print(" * ");
           }
           System.out.println();
       }
    }
}
