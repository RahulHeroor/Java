package Java_basics.javaBasics;

import java.util.Scanner;

public class SimpleInterest {

    float SI = 0;
    Scanner scanner = new Scanner(System.in);
    public void simpleIntrest(){
        System.out.println("Enter the  principal amt :");
        int P = scanner.nextInt();//where P=principal
        System.out.println("Enter the Rate :");
        float R = scanner.nextFloat();//where R=rate;
        System.out.println("Enter the Time(m or y) :");
        String time=scanner.next();
        int T;
        if(time.equals("m")){
            System.out.println("enter how many mounths :");
            T=scanner.nextInt();
            SI= (P*R*T) / (12 * 100);
        } else if (time.equals("y")) {
            System.out.println("Enter how many years :");
            T=scanner.nextInt();
            SI= (P*R*T) / 100;
        }
        else {
            System.out.println("Enterd the wrong time");
            return;
        }
        System.out.println("the simple intrest is :"+SI);
        System.out.println("the total amount you have to pay is :"+(P+SI));

    }
    public static void main(String[] args) {
        SimpleInterest obj=new SimpleInterest();
        obj.simpleIntrest();



    }
}