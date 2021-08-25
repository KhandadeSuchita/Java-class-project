/* program to swap two numbers*/
public class Code3{

public static void main(String[] args) {

        int first = 25, second = 39;
 System.out.println("Input 1st number : " + first);
 
System.out.println("Input 2nd number : " + second);

     int temporary = first;
        first = second;

        second = temporary;

        System.out.println("After swapping the 1st number is : " + first);
        
        System.out.println("After Swapping the 2nd number is : " + second);
    }
}