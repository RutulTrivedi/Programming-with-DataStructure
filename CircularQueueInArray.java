//Array implementation of Circular Queue
import java.util.Scanner;
public class CircularQueueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int length = sc.nextInt();
        sc.close();
        
        Queue queue = new Queue(3);
        queue.push(10);
        queue.display();
        queue.push(50);
        queue.display();
    }
}

class Queue{
    int[] arr;
    int front;
    int rear;

    Queue(int length){
        arr = new int[length];
        front = 0;
        rear = 0;
    }

    int pop(){
        if(front == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        else{
            int deletedValue = arr[front];
            if(front == rear){
                front = rear = 0;
            }
            else if(front == arr.length){
                front = 0;
            }
            else{
                front++;
            }
            return deletedValue;
        }
    }

    void push(int val){
        if(rear == front && rear != 0 && front != 0){
            System.out.println("Queue overflow");
        }
        else{
            if(rear == arr.length){
                rear = 0;
            }
            else{
                arr[rear++] = val;
            }
        }
    }

    int peek(){
        if(front == rear){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return arr[front];
        }
    }

    void display(){
        System.out.print("[ ");
        int temp = front;
        while(arr[temp] != 0){
            System.out.print(arr[temp]+" ");
            temp++;
            if(temp == arr.length){
                temp = 0;
            }
            if(temp == rear){
                break;
            }
        }
        System.out.println("]");
    }
}