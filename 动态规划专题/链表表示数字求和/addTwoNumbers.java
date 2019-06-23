/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//解法：两个链表从头至尾依次相加，和大于10则进位
class Solution {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode p1 = l1;
    	ListNode p2 = l2;
    	ListNode res = new ListNode(0);
    	ListNode rear = res;
    	int past = 0;//进位的数
    	int sum = 0;//当前两节点加上进位之和
    	while(p1 != null||p2!=null){
    		int t1 = (p1==null)?0:p1.val;
    		int t2 = (p2==null)?0:p2.val;    		 
    		 sum = (t1+t2+past)%10;
    		 past = (t1+t2+past)/10;
    		 ListNode node = new ListNode(sum);
    		 node.next = null;
    		 rear.next = node;
    		 rear = rear.next;
           if(p1!=null)p1 = p1.next;
           if(p2!=null) p2 = p2.next;

    	}
    	if(past != 0){
    		ListNode node = new ListNode(1);
    		rear.next = node;
    		rear = rear.next;
    	}
    	return res.next;

        
    }
}