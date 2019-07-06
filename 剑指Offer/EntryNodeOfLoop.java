/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
//解法一
public class Solution {
    /*
        先得到环中的一个节点
        再计算出环的节点个数
        再让一个指针先走环的长度，另一个指针开始出发，最后就会相遇在环开始处
    
    */
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null) return null;
        //找出环中的一个节点
        ListNode nodeInLoop = findNodeInLoop(pHead);
        if(nodeInLoop==null) return null;
        //计算环的节点个数
        int count = 1;
        ListNode findNum = nodeInLoop;
        while(findNum.next != nodeInLoop){
            findNum = findNum.next;
            ++count;
        }
        //找出环的入口
        ListNode fast = pHead;
        for(int i=0;i<count;++i){
            fast = fast.next;
        }
        ListNode slow = pHead;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    
    public ListNode findNodeInLoop(ListNode pHead){
       
        ListNode slow = pHead.next;
        if(slow==null) return null;
        ListNode fast = slow.next;
        while(slow != null && fast != null){
            if(slow==fast) return slow;
            slow = slow.next;
            fast = fast.next;
            if(fast!=slow) fast = fast.next;
        }
        return null;
    }
    
    
}
//解法二：利用set不会保存重复元素的性质
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
import java.util.*;
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null) return null;
        //利用set不会保存重复元素的性质，当再次试图保存环的入口节点时，肯定会返回已经保存的值，此时就是入口节点
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode p  = pHead;
        while(p!=null){
            if(!set.add(p)) return p;
            p = p.next;
        }
        return null;
    }
}