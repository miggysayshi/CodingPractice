public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(intx) { val = x; }
}

class Solution{
    public int countNodes(TreeNode root){
        int leftDepth = leftDepth(root);
        int rightDepth = rightDepth(root);

        if(rightDepth == leftDepth) return (2**rightDepth)-1;
        else return 1 + countNodes(root.right) + countNodes(root.left); 
    }
    public int leftDepth(TreeNode root){
        int counter = 0;
        while(root != null){
            count++;
            root = root.left;
        }
        return count;
    }
    public int rightDepth(TreeNode root){
        int counter = 0;
        while(root != null){
            count++;
            root = root.right;
        }
        return count;
    }
}
