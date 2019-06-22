  //输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        if(listNode== null) return list;
        ListNode p = listNode;
        while(p != null){
            list.add(p.val);
            p = p.next;
        }
        Collections.reverse(list);
        return list;
        
        
    }