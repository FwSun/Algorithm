import java.util.ArrayList;
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
    ArrayList<Integer>list = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    int sum = 0;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        //递归出口，一定要返回res
        if(root==null) return res;
        sum += root.val;
        list.add(root.val);
        //如果是叶子节点，且路径之和等于target，那么将这条路径加入res
        //if(sum==target&&root.right==null&&root.left==null) res.add(list);
        //这里不能用上面的res.add(list),因为list是引用类型，在后面list里的元素会被移除，这样导致最终加入到res里的list数据不对
        if(sum==target&&root.right==null&&root.left==null) res.add(new ArrayList<Integer>(list));
        FindPath(root.left,target);
        FindPath(root.right,target);
        //remove函数传入的是下标值，一定要注意
        //list.remove(root.val);
        list.remove(list.size()-1);
        sum -= root.val;
        return res;
        
    }
}