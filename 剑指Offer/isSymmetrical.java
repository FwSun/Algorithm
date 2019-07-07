/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
//请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
//解法一：求得二叉树的镜像数，利用ArrayList来存储两颗树的顺序，再来比较两棵树的顺序是否相同
import java.util.*;
public class Solution {
     ArrayList<Integer>root = new ArrayList<Integer>();
     ArrayList<Integer>mirro = new ArrayList<Integer>();
    Map<Integer,Integer> rootMap = new HashMap
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) return true;
        visit(pRoot,root);
        getMirroTree(pRoot);
        visit(pRoot,mirro);
        for(int i=0;i<root.size();++i){
            if(root.get(i)!=mirro.get(i)) return false;
        }
       return true;
        
        
    }
    public void visit(TreeNode root,ArrayList<Integer> list){
        if(root==null) {
            list.add(-1);
            return ;
        }
        list.add(root.val);
        visit(root.left,list);
        visit(root.right,list);
    }
    
    

    public void getMirroTree(TreeNode root){
        if(root==null) return ;
        getMirroTree(root.left);
        getMirroTree(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
//递归解法
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) return true;
        boolean ans = isSymmetricalCore(pRoot.left,pRoot.right);
        return  ans;
        
    }
    public boolean isSymmetricalCore(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        return left.val==right.val&&isSymmetricalCore(left.left,right.right)
                &&isSymmetricalCore(left.right,right.left);
    }
}