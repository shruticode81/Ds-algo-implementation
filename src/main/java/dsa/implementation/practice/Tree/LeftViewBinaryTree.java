package dsa.implementation.practice.Tree;

public class LeftViewBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode temp1 = new TreeNode(6);
        TreeNode temp2 = new TreeNode(8);
        TreeNode temp3 = new TreeNode(7);
        root.left=temp1;
        root.right=temp2;
        temp2.right=temp3;

        leftViewTraverse(root);
    }

    private static void leftViewTraverse(TreeNode root) {

    }
}
