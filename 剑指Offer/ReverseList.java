 //输入一个链表，反转链表后，输出新链表的表头。
/*
    解题思路：采用头插法，将原始链表反转
*/
 public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        //用于头插法的首节点
        ListNode root = new ListNode(0);
        root.next = null;
        //当前待插入节点的位置
        ListNode p = head;
        //q用来保存下一个待待插入节点的位置
        ListNode q = p.next;
        while(p != null){
            p.next = root.next;
            root.next = p;
            p = q;
            //一定要判断p是否为空，否则会报空指针错误
            if(p!=null)q = p.next;
            
        }
        return root.next;
    }