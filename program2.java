/*program to add two numbers*/
import java.util.Arrays;
class Code2
{
   public static void main (String args[])
 {
   int[] Array1 = new int[]{10,20,30};
   int[] Array2 = new int[]{40,50,60,70,80,90};
   int lenArray1 = Array1.length;
   int lenArray2 = Array2.length;
   int[] concate = new int[lenArray1 + lenArray2];
   System.arraycopy(Array1, 0, concate, 0, lenArray1);  
   System.arraycopy(Array2, 0, concate, lenArray1, lenArray2);  
   System.out.println("Original array: " + Arrays.toString(Array1));
   System.out.println("After append values to the end of the array: " + Arrays.toString(concate)); 
 }  
}
