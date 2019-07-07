/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
//解法一：通过linkedHashMap将重复节点去除，再重新构造节点
import java.util.*;
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null) return null;
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        ListNode p = pHead;
        while(p != null){
            if(map.get(p.val)==null) map.put(p.val,1);
            else{
                int count = map.get(p.val);
                map.put(p.val,count+1);
            }
            p = p.next;
        }
        ListNode res = new ListNode(0);
        ListNode rear = res;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                ListNode node = new ListNode(i);
                rear.next = node;
                rear = rear.next;
            }
        }
        rear.next = null;
        return res.next;
        

    }
}

//解法二

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null) return pHead;
        //令设置一个头指针，为了防止第一个节点也要被删除的情况
        ListNode root = new ListNode(0);
        root.next = pHead;
        ListNode back = root;
        ListNode front = root.next;
        while(front != null){
            //出现的重复节点的处理情况
            if(front.next!=null&&front.val==front.next.val){
                while(front.next!=null&&front.val==front.next.val) front = front.next;
                //没有确定下一个节点会不会删除前，绝不挪动back的位置
                back.next = front.next;
                front = front.next;
                
            }else{
                //当前没有出现重复节点的处理情况
                back = back.next;
               front = front.next;
            }
  
            
        }
        return root.next;

    }
}

