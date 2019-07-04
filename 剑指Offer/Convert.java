//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
/**
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
    //用于存储中序遍历的前一个节点，需要定义为全局变量
    TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        ConvertCore(pRootOfTree);
        //寻找转换后链表的首节点，即最左边的节点
        while(pRootOfTree.left != null) pRootOfTree = pRootOfTree.left;
       return pRootOfTree;
        
        
    }
    public void ConvertCore(TreeNode root){
        if(root==null) return;
        //中序遍历改变指针的位置
        ConvertCore(root.left);         
        if(pre !=null) pre.right = root;
        root.left = pre;
        pre = root;
        ConvertCore(root.right);
    }
}