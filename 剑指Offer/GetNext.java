/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
//给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
//解题：一个节点的下一个节点只可能是在他的右孩子或者父亲节点（此时他是父亲节点的左孩子）
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null) return null;
       
        //有右孩子
        if(pNode.right!=null){
            pNode = pNode.right;
            while(pNode.left !=null) pNode = pNode.left;
            return pNode;
           
        }
        //没有右孩子
        while(pNode.next!=null){
            if(pNode.next.left==pNode) return pNode.next;
            pNode = pNode.next;
        }
        return  null;
        
    }
}