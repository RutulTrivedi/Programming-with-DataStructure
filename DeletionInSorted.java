import java.util.Scanner;
import java.util.Arrays;

public class DeletionInSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeletionInArray obj = new DeletionInArray();
        System.out.println("Enter the length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for(int i=0;i<len;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be deleted : ");
        int num = sc.nextInt();
        obj.deleteElement(arr,num);
        sc.close();    
    }
}

class DeletionInArray{
    void deleteElement(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                arr[i]=0;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        printArray(arr);
    }

    void printArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            System.out.println("Element "+(i+1)+" : "+arr[i]);
        }
    }
}