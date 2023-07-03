import java.util.Scanner;
import java.util.Arrays;
public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Merger obj = new Merger();
        System.out.println("Enter the length of array 1 : ");
        int len1 = sc.nextInt();
        System.out.println("Enter the length of array 2 : ");
        int len2 = sc.nextInt();

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        for(int i=0;i<len1;i++){
            System.out.println("Enter element "+(i+1)+" of array 1 : ");
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<len2;i++){
            System.out.println("Enter element "+(i+1)+" of array 2 : ");
            arr2[i] = sc.nextInt();
        }
        sc.close();
        obj.mergeTwoArray(arr1,arr2);
    }
}

class Merger{

    void mergeTwoArray(int[] arr1,int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        for(int i=0;i<newArr.length;i++){
            if(i<arr1.length){
                newArr[i] = arr1[i];
            }
            else{
                newArr[i] = arr2[i-arr1.length];
            }
        }

        printArray(newArr);
    }

    void printArray(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+(i+1)+" : "+arr[i]);
        }
    }
}