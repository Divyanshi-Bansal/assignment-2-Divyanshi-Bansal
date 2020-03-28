package problem2.main;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class BinarySearchTree {
    private TreeNode root;
    private int countRight;
    private MyQueue preQueue;
    private MyQueue postQueue;

    public BinarySearchTree (MyQueue preQueue , MyQueue postQueue){
        this.postQueue = postQueue;
        this.preQueue = preQueue;
    }

    public void insert(int data){
        TreeNode node = new TreeNode ( data );
        if(root == null){
            root = node;
        }
        else{
            TreeNode current = root;
            TreeNode parent = null;
            while(current != null){
                parent = current ;
                if(node.getData () < current.getData ()){
                    current = current.getLeft ();
                }
                else{
                    current = current.getRight ();
                }
            }
            if(node.getData () < parent.getData ()){
                parent.setLeft ( node );
            }
            else{
                parent.setRight ( node );
            }
        }
    }
}