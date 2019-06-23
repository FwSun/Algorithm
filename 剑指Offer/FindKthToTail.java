  /*
    输入一个链表，输出该链表中倒数第k个结点。
    解题思路：
            ①定义两个指针，一开始都指向头部。
            ②让第一个指针先走k-1步。
            ③两个指针一起移动。
            ④当第一个指针到达链表最后一个元素时，第一个指针刚好位于倒数第k个节点

    注意：当k<=0时，直接返回null
  */
  public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0) return null;
        ListNode first = head;
        ListNode second = head;
        int index=1;
        while(first != null&&index<k){
            first = first.next;
            ++index;
        }
        if(first==null) return null;
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        return second;

    }