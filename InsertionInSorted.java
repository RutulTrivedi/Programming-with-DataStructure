import java.util.Scanner;
import java.util.Arrays; 

public class InsertionInSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertElement obj = new InsertElement();
        System.out.println("Enter the length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len+1];

        for(int i=0;i<len;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be inserted : ");
        int num = sc.nextInt();
        obj.insertElement(arr,num);
        sc.close();    
    }
}

class InsertElement{
    void insertElement(int[] arr,int num){
        arr[arr.length-1] = num;
        Arrays.sort(arr);
        printArray(arr);
    }

    void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+(i+1)+" : "+arr[i]);
        }
    }
}