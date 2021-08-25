/*program ti calculate volume of a cylinder*/
import java.util.Scanner;
class Code6{
   public static void main(String args[]){   
       
      Scanner s= new Scanner(System.in);
        
         System.out.print("Input the radius of the cylinder : ");
         double r=s.nextDouble();
         System.out.print("Input the height of the cylinder : ");
         double h=s.nextDouble();
 
          double volume=((22*r*r*h)/7);
 
          System.out.println("The volume of a cylinder is : " +volume);
     }
}