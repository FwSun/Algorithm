//操作给定的二叉树，将其变换为源二叉树的镜像。
/*
    解题思路：递归遍历树，将树的每个节点左右子树互换即可
*/
  public void Mirror(TreeNode root) {
        if(root==null) return;
        //对树进行递归遍历和交换左右孩子
        if(root.left != null) Mirror(root.left);
        if(root.right != null) Mirror(root.right);
        exchange(root);
    }
    //交换树节点的左右孩子
    public void exchange(TreeNode root){
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
    }