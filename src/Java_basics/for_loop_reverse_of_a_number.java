public class for_loop_reverse_of_a_number {
    public static void main(String[] args) {
        int N=10399;
       int revesrse=0;
       for(;N!=0;N=N/10){
           int remainder=N%10;
           revesrse=revesrse*10+remainder;

       }
        System.out.println("the revers of the number is :"+revesrse);
    }
}
