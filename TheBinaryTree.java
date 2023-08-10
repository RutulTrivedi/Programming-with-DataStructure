public class TheBinaryTree{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = tree.createTree(arr);
        System.out.print("Pre Order Traversal : ");
        tree.preOrder(root);
        System.out.print("\nInOrder Traversal : ");
        tree.inOrder(root);
        System.out.print("\nPostorder Traversal : ");
        tree.postOrder(root);
    }
}

class BinaryTree{
    Node root;
    static int i = -1;
    Node createTree(int[] nodes){
        i++;
        if(nodes[i] == -1){
            return null;
        }
        Node newNode = new Node(nodes[i]);
        newNode.left = createTree(nodes);
        newNode.right = createTree(nodes);
        return newNode;
    }

    void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}