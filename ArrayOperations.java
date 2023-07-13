public class ArrayOperations{
    public static void main(String[] args) {
        Stack obj = new Stack(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();
        obj.change(4, 50);
        obj.display();
    }
}

class Stack{
    int[] arr;
    int top;

    Stack(int size){
        arr = new int[size];
        top=0;
    }

    public void push(int value){
        if(top >= arr.length){
            System.out.println("Stack overflow.");
        }
        else{
            arr[top++] = value;
        }
    }

    public int pop(){
        if(top <=0){
            System.out.println("Stack underflow.");
            return -1;
        }
        else{
            int temp = arr[top--];
            return temp;
        }
    }

    public int peek(){
        if(top <=0){
            System.out.println("Stack underflow.");
            return -1;
        }
        else{
            return arr[top-1];
        }
    }

    public void change(int index, int newVal){
        if(top-index < 0){
            System.out.println("Stack underflow.");
        }
        else{
            arr[top-index] = newVal;
        }
    }
    public void display(){
        System.out.print("[ ");
        for(int i=top-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]\n");
    }
}