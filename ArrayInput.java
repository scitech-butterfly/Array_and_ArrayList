//ArrayInput.java
import java.util.*;
class ArrayInput(){
  Scanner scan = new Scanner(System.in);

  // Method to take user input for an array
  int[] getUserArray() {
      System.out.println("Enter the size of the array:");
      int size = scan.nextInt();
      int[] array = new int[size];

      System.out.println("Enter " + size + " numbers:");
      for (int i = 0; i < size; i++) {
           array[i] = scan.nextInt();
      }
      return array;
  }

}
