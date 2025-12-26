package dsa.implementation.practice.Tree;


public class PrintKthDis {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode temp1 = new TreeNode(6);
        TreeNode temp2 = new TreeNode(8);
        TreeNode temp3 = new TreeNode(7);

        root.left=temp1;
        root.right=temp2;
        temp2.right=temp3;
        int k=1;
//        printKthDistance(root,k,0);
        printKthDistance2(root,k);


    }

    private static void printKthDistance(TreeNode root, int k, int count) {
        if(root == null) {
            return;
        }

        if(count == k) System.out.println(root.val);
        printKthDistance(root.left, k, count+1);
        printKthDistance(root.right,k,count+1);
    }
    private static void printKthDistance2(TreeNode root, int k) {
        if(root == null) {
            return;
        }
        if(k==0){
            System.out.println(root.val);
        }

        printKthDistance2(root.left, k-1 );
        printKthDistance2(root.right,k-1);
    }
}
