public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        //树的后序遍历
        if(root==null) return true;
        boolean left = IsBalanced_Solution(root.left);
        boolean right = IsBalanced_Solution(root.right);
        //当一棵树的左右子树高度之差不超过1时判断是平衡二叉树
        int l = getDepth(root.left);
        int r = getDepth(root.right);
        return Math.abs(l-r)<=1&&left&&right;
        
    }
    
    //求树的高度函数
    public int getDepth(TreeNode root){
        if(root==null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return Math.max(left,right)+1;
    }
        
}