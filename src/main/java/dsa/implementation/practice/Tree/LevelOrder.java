package dsa.implementation.practice.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode temp1 = new TreeNode(6);
        TreeNode temp2 = new TreeNode(8);
        TreeNode temp3 = new TreeNode(7);
        root.left=temp1;
        root.right=temp2;
        temp2.right=temp3;

        levelOrderTraverse(root);
    }

    private static void levelOrderTraverse(TreeNode root) {
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.println(curr.val);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
}
