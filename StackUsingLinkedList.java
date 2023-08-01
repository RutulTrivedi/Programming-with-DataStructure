public class StackUsingLinkedList{
    public static void main(String[] args){
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.pop();
        st.display();
    }
}

class Stack{
    Node head;

    Stack(){
        head = null;
    }

    void push(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.link = head;
            head = newNode;
        }
    }

    int pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }
        else if(head.link == null){
            int temp = head.data;
            head = null;
            return temp;
        }
        else{
            int temp = head.data;
            head = head.link;
            return temp;
        }
    }

    void display(){
        if(head == null){
            System.out.println("Stack is empty.");
        }
        else{
            Node save = head;
            while(save != null){
                System.out.print(save.data+" ");
                save = save.link;
            }
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