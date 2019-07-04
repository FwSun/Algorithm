/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return null;
        RandomListNode p = pHead;
        RandomListNode q ;
        //复制链表，每个新节点复制到它的“源”节点之后
        while(p != null){
            q = new RandomListNode(p.label);
            q.next = p.next;
            p.next = q;
           if(p!=null) p = q.next;
        }
        //设置复制链表的随机指针
        p = pHead;
        q = p.next;
        while(p != null){
            //只有当父的随机指针不为空时
            if(p.random != null) q.random = p.random.next;
            
            p = q.next;
            if(p!=null)q = p.next;
        }
        //拆分链表
        RandomListNode root = pHead;
        RandomListNode cloneRoot = pHead.next;
        p = root;
        q = cloneRoot;
        while(p!=null){
            p.next = q.next;
            q.next = q.next==null?null: q.next.next;
            p = p.next;
            q = q.next;
        }
        return cloneRoot;
        
        
    }
}