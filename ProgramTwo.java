 //Program to delete a number from a given location in an array.
import java.util.Scanner;

public class ProgramTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of an array : ");
        int len = sc.nextInt();

        //Declaring array
        int[] arr = new int[len];

        //Scanning elements of array
        for(int i=0;i<len;i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        //Asking element to be deleted and its position
        System.out.print("Enter the element to be deleted : ");
        int element = sc.nextInt();
        sc.close();
        int pos = -1;

        //Finding the position of element to be deleted
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                pos = i;
            }
        }

        //Declaring new array
        int[] newArr = new int[len-1];

        //Deleting element
        if(pos != -1){
            for(int i=0;i<newArr.length;i++){
                if(i >= pos){
                    newArr[i] = arr[i+1];
                }
                else{
                    newArr[i] = arr[i];
                }
            }
        }
        else{
            System.out.println("Element not found!!");
        }

        //Printing new array
        System.out.println("New array : ");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }   
}