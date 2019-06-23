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
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
  public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if(root1 != null && root2 != null){
            if(root1.val==root2.val) res = HasSubtreeCore(root1,root2);
            //如果根节点不匹配，则在左子树找找
            if(!res) res = HasSubtreeCore(root1.left,root2);
            //如果左子树也没有找到，则在右子树找找
            if(!res) res = HasSubtreeCore(root1.right,root2);
        }
        return res;
        
        
    }
    //用来判断main中是否包含sub
    public boolean HasSubtreeCore(TreeNode main,TreeNode sub){
        //递归出口
        //当main或者sub有一个为空的情况下
        if(main==null&&sub!=null) return false;
        if(sub==null) return true;
        //当两者都不为空的情况下
        if(main.val != sub.val) return false;
        
        return HasSubtreeCore(main.left,sub.left)&&HasSubtreeCore(main.right,sub.right);
        
    }