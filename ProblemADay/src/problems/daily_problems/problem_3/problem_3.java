package problems.daily_problems.problem_3;

import java.util.*;


/*

    Given the root to a binary tree, implement serialize(root),
    which serializes the tree into a string, and deserialize(s),
    which deserializes the string back into the tree.

    For example, given the following Node class

    class Node:
        def __init__(self, val, left=None, right=None):
            self.val = val
            self.left = left
            self.right = right
    The following test should pass:

    node = Node('root', Node('left', Node('left.left')), Node('right'))
    assert deserialize(serialize(node)).left.left.val == 'left.left'

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

public class problem_3 {

    static Scanner sc;


     static Node createATree(){

        Node root = null;

        System.out.println("Enter Data :-  ");

        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

         System.out.println("Enter data left" + data);

         root.left = createATree();

         System.out.println("Enter data right " + data);

         root.right = createATree();
        return root;
    }

    static String serialize(Node root){
         if(root == null){
             return "x";
         }
         String left_serialize = serialize(root.left);
         String right_serialize = serialize(root.right);

         return root.value+","+left_serialize+","+right_serialize;

    }

    static Node  deserialize(String str){
         String arr[] = str.split(",");
         Queue<String> q = new LinkedList<>();

         for(String num : arr){
             q.add(num);
         }

         Node root = deserialize(q);

         return root;
    }

    static Node deserialize(Queue<String> q){
         if(q.size() == 0){
             return null;
         }
         String peek = q.poll();

         if(peek.equals("x")){
             return null;
         }

         Node root = new Node(Integer.parseInt(peek));
         root.left = deserialize(q);
         root.right = deserialize(q);
         return root;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createATree();

        String s = serialize(root);

        System.out.println("serialize tree :- " + s);

        Node r1 = deserialize(s);

        System.out.println("deserialize tree :- "+ r1);
    }

}
