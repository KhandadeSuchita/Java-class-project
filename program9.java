/*program to find the area and circumference of a circle.*/   

import java.util.Scanner;
class Code9
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Input the radius(1/2 of diameter of a circle : ");
   
      double radius = sc.nextDouble();
      //Area = PI*radius*radius
      double area = Math.PI * (radius * radius);
      System.out.println("The area of the circle is : " + area);
      //Circumference = 2*PI*radius
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is : "+circumference) ;
   }
}