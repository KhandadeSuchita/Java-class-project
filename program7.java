/*program to find area and perimeter of a rectangle*/

import java.util.Scanner;

public class Code7{

    public static void main(String[] args) {
        
        int length, width, area, perimeter;

        Scanner in = new Scanner(System.in);

        System.out.print("Input the  length of the rectangle : ");
        length = in.nextInt();
        
        System.out.print("Input the  width of the rectangle : ");
        
        width  = in.nextInt();
        perimeter = 2 * (length + width); 
        area = length * width; 
        
        System.out.println("The area of the rectangle is : " + area);
        
        System.out.println("The perimeter of the rectangle is : " + perimeter);
     }
}