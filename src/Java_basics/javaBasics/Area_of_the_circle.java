package javaBasics;

import java.util.Scanner;

public class Area_of_the_circle {
    public void area_of_circle(){
        Scanner scanner=new Scanner(System.in);
        float r=scanner.nextFloat();//where the r = radius of the circle
        float A=(float) 3.14*r*r;
        System.out.println("The area of the circle is : A="+A);
    }
    public static void main(String[] args) {
        Area_of_the_circle obj=new Area_of_the_circle();
        obj.area_of_circle();
    }
}
