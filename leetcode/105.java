/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //3 9 20 15 7
    //9 3 15 20 7
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode ans = core(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return ans;
        
    }
    public TreeNode core(int[] pre,int preL,int preR,int in[],int inL,int inR){
        
        //todo:判断递归的出口
        if(preL>preR||inL>inR) return null;
        int temp = pre[preL];
        int index = 0;
        for(int i=inL;i<=inR;++i){
            if(in[i]==temp) index = i;
        }
        int len = index-inL;
        TreeNode root = new TreeNode(temp);
        root.left = core(pre,preL+1,preL+len,in,inL,index-1);
        root.right = core(pre,preL+len+1,preR,in,index+1,inR);
        return root;
        
    }
}