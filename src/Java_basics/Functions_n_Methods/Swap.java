package Java_basics.Functions_n_Methods;

public class Swap {
    public static void swap(int a,int b){

        int temp=a;
        a=b;
        b=temp;
        System.out.println("the value of a is :"+a);
        System.out.println("the value of b is :"+b);
    }
    public static void main(String[] args) {
        int x=2;
        int y=3;
          swap(x,y);

    }
}
