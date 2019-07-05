/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*
	解题思路：
		①如果两条链表长度一致的话，那么两条链表第一次遍历就会找到公共节点
		②如果长度不一致，那么短链表b肯定会首先走到null处，这时将他重新指向长链表的初始节点，
		 此时长链表a还没有走完，长链表剩下的节点数数正好等于它比短链表多的长度length，因此当第一次的长链表a走到null时
		 此时从头开始在长链表上走的b正好走了length个节点，它剩下的路程长度正好等于短链表长度
		 这是将a重新指向短链表，这是他们就会一起到达公共节点


*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null) return null;
        ListNode p = pHead1,q = pHead2;
        while(p!=q){
            p = (p==null?pHead2:p.next);
            q = (q==null?pHead1:q.next);
        }
        return p;
 
    }
}