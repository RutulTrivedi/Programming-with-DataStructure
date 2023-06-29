//Program to insert a number at a given location in an array.
import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the length of an array
        System.out.print("Enter the length of an array : ");
        int len = sc.nextInt();

        // Declaring array
        int[] arr = new int[len];

        // Scanning elements of array
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        // Asking new element and its position
        System.out.print("Enter the new element to be inserted : ");
        int newEle = sc.nextInt();
        System.out.print("Enter the position where new element must be inserted : ");
        int elePos = sc.nextInt();
        sc.close();

        // Declaring new array
        int[] newArr = new int[len + 1];

        // Inserting element
        for (int i = 0; i < newArr.length; i++) {
            if (i == elePos - 1) {
                newArr[i] = newEle;
            } else if (i >= elePos) {
                newArr[i] = arr[i - 1];
            } else {
                newArr[i] = arr[i];
            }
        }

        // Printing new array
        System.out.println("New array : ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}