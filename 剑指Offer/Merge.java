 //题目：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)return list2;
        if(list2==null) return list1;
        if(list1==null&&list2==null) return null;
        //合并后的新链表
        ListNode head = new ListNode(0);
        head.next = null;
        ListNode rear = head;
        //用以遍历两个递增的原始链表
        ListNode p = list1,q = list2;
        ListNode p1 = p.next,q1 = q.next;
        while(p!=null&&q!=null){
            //两个指针依次在两个链表上移动，每次取两个链表中较小值接入到新的链表
            if(p.val<q.val){
                rear.next = p;
                rear = rear.next;
                p = p1;
                if(p != null) p1 = p.next;
            }else{
                rear.next = q;
                rear = rear.next;
                q = q1;
                if(q != null) q1 = q.next;
            }
        }
        //将剩下的链表接入到新的链表
        if(p!=null) rear.next = p;
        if(q!=null) rear.next = q;
        return head.next;
        
        
        
    }