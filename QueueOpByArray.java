//Array implications of Queue
public class QueueOpByArray{
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.display();

        queue.pop();
        queue.pop();
        queue.display();

        queue.peek();
        queue.peek();
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

    void push(int val){
        if(rear == arr.length){
            System.out.println("Queue overflow");
        }
        else{
            arr[rear++] = val; 
        }
    }

    int pop(){
        if(front == rear){
            System.out.println("Queue is empty");
        }
        else{
            arr[front++] = 0;
        }
        return arr[front-1];
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
        if(front == rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("[ ");
        for(int i=front;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}