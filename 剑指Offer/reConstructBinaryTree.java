 
    /*
    输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
    假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    */
    public TreeNode reConstructBinaryTreeCore(int[]pre,int preL,int preR,int in[],int inL,int inR){
        //if(pre.length==0||in.length==0) return null;
        //正确的递归出口        
        if(preL>preR||inL>inR) return null;
        int first = pre[preL];
        int k = 0;
        //找到根节点在中序遍历里的位置k，k的左边是左子树，k的右边是右子树
        for(int i=inL;i<=inR;++i){
            if(in[i]==first) k=i;
        }
        //左子树的长度
        int len = k-inL;
        //根节点
        TreeNode root = new TreeNode(first);
        //循环创造左子树和右子树
        root.left = reConstructBinaryTreeCore(pre,preL+1,preL+len,in,inL,k-1);
        root.right = reConstructBinaryTreeCore(pre,preL+1+len,preR,in,k+1,inR);
        return root;
    }




