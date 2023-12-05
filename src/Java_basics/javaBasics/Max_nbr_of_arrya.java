package Java_basics.javaBasics;

public class Max_nbr_of_arrya {
    public void max(){
        int[] numbers={2,3,4,12,34,56,43,60,33,23};
        int maxNumber=numbers[0];
        int a=0;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>maxNumber){
                maxNumber=numbers[i];
                a=i;

            }

        }
        System.out.println(maxNumber);
        System.out.printf(String.valueOf(a));

    }
    public static void main(String[] args) {
        Max_nbr_of_arrya obj=new Max_nbr_of_arrya();
        obj.max();

    }
}
