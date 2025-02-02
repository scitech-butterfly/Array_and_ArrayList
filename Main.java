//Name: Kashvi Singh
//PRN: 23070126057
//Batch: AIML A3

//Main.java

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayInput arrayInput = new ArrayInput();
        ArrayFunctions functions = new ArrayFunctions();

        //Switch-case to display menu and perform different functions according to user's choice
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Separate Even and Odd numbers\n2. Find index of closest neighboring numbers\n3. Convert Array to ArrayList\n4. Convert ArrayList to Array\n0. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                //To separate even and odd numbers into different arrays
                case 1 -> {
                    int[] array = arrayInput.getUserArray();
                    functions.separateOddEven(array);
                }
                //To find the index of an array member with the smallest distance to its neighboring member
                case 2 -> {
                    int[] array = arrayInput.getUserArray();
                    int index = functions.findSmallestDistanceIndex(array);
                    System.out.println("Index of the first number in the closest pair: " + index);
                }
		case 3 -> {
                    int[] array = arrayInput.getUserArray();
                    ArrayList<Integer> arrayList = functions.arrayToArrayList(array);
                    System.out.println("Converted ArrayList: " + arrayList);
                }
                case 4 -> {
                    ArrayList<Integer> arrayList = arrayInput.getUserArrayList();
                    int[] array = functions.arrayListToArray(arrayList);
                    System.out.println("Converted Array: " + Arrays.toString(array));
                }
                //To exit the program and break out of the while loop
                case 0 -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default -> {
		    System.out.println("Invalid choice, please try again.");
		}
            }
        }
    }
}
