package problems;

import java.util.Scanner;
    /*
    A unival tree (which stands for "universal value") is a tree where all nodes under
    it have the same value.

    Given the root to a binary tree, count the number of unival subtrees.

    For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1

 */

class Node {
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}


public class problem_8 {

    static Scanner sc;
    static Node createTree(){
        Node root = null;

        System.out.println("Enter Data");

        int data  = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter data left" + data);

        root.left = createTree();

        System.out.println("Enter data right " + data);

        root.right = createTree();
        return root;
    }

    static boolean is_unival(Node root){

        if(root == null){
            return true;
        }
        if (root.left != null && root.left.value != root.value){
            return false;
        }if (root.right != null && root.right.value != root.value){
            return false;
        }

        if(is_unival(root.left) && is_unival(root.right)){
            return true;
        }

        return false;


    }

    static int count_unival(Node root){
        if (root == null){
            return 0;
        }

        int count = count_unival(root.left) + count_unival(root.right);

        if(is_unival(root)){
            count += 1;
        }

        return count;
    }


    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();
        //   tree ip :-   0, 1, -1, -1, 0, 1, 1, -1, -1, 1, -1, -1, 0, -1, -1

        int r = count_unival(root);

        System.out.println(" the following tree has "+ r +" unival subtrees");

    }


}
