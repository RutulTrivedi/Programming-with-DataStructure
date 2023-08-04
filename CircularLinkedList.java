public class CircularLinkedList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtLast(30);  
        list.display();
    }
}

class LinkedList{
    Node first;
    Node last;

    LinkedList(){
        first = null;
        last = null;
    }

    void insertAtLast(int value){
        Node newNode = new Node(value);

        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.link = first;
            last.link = newNode;
        }
    }

    void insertAtFirst(int value){
        Node newNode = new Node(value);

        if(first == null){
            first = last = newNode;
        }
        else{
            newNode.link = first;
            first = newNode;
            last.link = first;
        }
    }

    int delete(int n){
        Node save = first;
        Node pred = null;
        while(save.data != n  && save != last){
            pred = save; 
            save = save.link;
        }
        if(save.data != n){
            System.out.println("Not found");
        }
        if(n == first.data){
            first = first.link;
            last.link = first;
        }
        else{
            pred.link = save.link;
            if(n == last.data){
                last = pred;
            }
        }
        return n;
    }

    void display(){
        Node save = first;
        do{
            System.out.print(save.data+" ");
            save = save.link;
        }while(save != first);
        // while(save != first){
        //     System.out.println(save.data+" ");
        //     save = save.link;
        // }
    }
}

class Node{
    int data;
    Node link;

    Node(int value){
        data = value;
        link = null;
    }
}