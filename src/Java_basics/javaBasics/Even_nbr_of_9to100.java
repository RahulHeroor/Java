package javaBasics;

public class Even_nbr_of_9to100 {

    public void evennbr(){
        for(int i=9;i<=100;i++){
            if(i%2==0) System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Even_nbr_of_9to100 obj=new Even_nbr_of_9to100();
        obj.evennbr();
    }
}
