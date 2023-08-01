public class QueueUsingLinkedList {
    public static void main(String[] args){
        Queue q = new Queue();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        int temp = q.pop();
        System.out.println(temp);
        int temp2 = q.pop();
        System.out.println(temp2);
        q.display();
    }
}

class Queue{
    Node first;
    Node last;

    Queue(){
        first = null;
        last = null;
    }

    void push(int val){
        Node newNode = new Node(val);
        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.link = first;
            first = newNode;
        }
    }

    int pop(){
        if(first == null){
            System.out.println("Queue is empty.");
            return -1;
        }
        else if(first == last){
            int temp = first.data;
            first = last = null;
            return temp;
        }
        else{
            Node save = first;
            while(save.link != last){
                save = save.link;
            }
            int temp = last.data;
            last = save;
            last.link = null;
            return temp;
        }
    }

    void display(){
        Node save = first;
        while(save != null){
            System.out.print(save.data + " ");
            save = save.link;
        }
    }
}

class Node{
    int data;
    Node link;

    Node(int val){
        data = val;
        link = null;
    }
}