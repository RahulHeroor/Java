package Question_and_ans.javaBasics01;

import java.util.Scanner;

public class Total_bill {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter pencil cost:");
        float pencil_cost=scanner.nextFloat();
        System.out.println("enter the pen cost :");
        float pen_cost=scanner.nextFloat();
        System.out.println("enter the eraser cost :");
        float eraser_cost=scanner.nextFloat();
        float total_cost=pencil_cost+pen_cost+eraser_cost;
        System.out.println("the total cost of the item is : " +total_cost);
        float gst_amount= total_cost*0.18f;
        System.out.println("the total cost of the item with 18% gst is : " +(total_cost+gst_amount));

    }
}
