/*program to calculate volume of a cube*/
import java.util.Scanner;
class Code5{
      
   public static void main(String args[]){   
        Scanner s= new Scanner(System.in);
        System.out.print("Input the side of a cube : ");
            int side=s.nextInt();
            int  volume=side*side*side;
            System.out.println("The volume of a cube is : " +volume);
    }
} 