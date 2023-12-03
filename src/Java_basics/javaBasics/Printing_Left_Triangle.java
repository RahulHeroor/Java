package javaBasics;

public class Printing_Left_Triangle

{
    public static void main(String[] args)
    {
        int rows=5,j,i;
        for(i=0;i<rows;i++)
        {
            for(j=(rows-i);j>0;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
