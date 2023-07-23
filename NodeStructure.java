public class NodeStructure{
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertAtFirst(list1,10);
        list1.insertAtLast(list1, 20);
        list1.insertAtLast(list1, 30);
        list1.insertAtLast(list1, 40);
        list1.insertAtLast(list1, 50);
        list1.deleteAtLast(list1);
        list1.display(list1);
        list1.countNodes(list1);
    }
}

class LinkedList{
    Node head;
    int size = 0;
    
    LinkedList(){
        head = null;
    }

    void insertAtFirst(LinkedList myList,int value){
        Node tempNode = new Node(value);
        if(myList.head == null){
            myList.head = tempNode;
            size++;
        }
        else{
            tempNode.link = head;
            head = tempNode;
            size++;
        }
    }

    void insertAtLast(LinkedList myList,int value){
        Node tempNode = new Node(value);
        if(myList.head == null){
            myList.head = tempNode;
            size++;
        }
        else{
            Node save = myList.head;
            
            while(save.link != null){
                save = save.link;
            }

            save.link = tempNode;
            size++;
        }
    }

    void deleteAtFirst(LinkedList myList){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(myList.head.link == null){
            head = null;
            size--;
        }
        else{
            head = head.link;
            size--;
        }
    }

    void deleteAtLast(LinkedList myList){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(myList.head.link == null){
            head = null;
            size--;
        }
        else{
            Node save = myList.head;

            while(save.link.link != null){
                save = save.link;
            }
            save.link = null;
            size--;
        }
    }

    void deleteAtPosition(LinkedList myList, Node n){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node save = myList.head;        
        Node pre = save;
        while(save != n && save.link.link != null){
            pre = save;
            save = save.link;
        }

        if(save != n){
            System.out.println("Element not found");
        }
        else if(n == head){
            head = head.link;
            size--;
        }
        else{
            pre.link = n.link;
            size--;
        }
    }

    void countNodes(LinkedList myList){
        System.out.println("Total Nodes : "+myList.size);
    }

    void display(LinkedList myList){
        Node current = myList.head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.link;
        }
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