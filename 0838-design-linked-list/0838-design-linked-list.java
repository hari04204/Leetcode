class MyLinkedList {
    ListNode head;
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        ListNode curr = head;
        while(index-- > 0){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        head = new ListNode(val,head);
        size++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            head = new ListNode(val);
            size++;
            return;
        }
        ListNode curr = head;
        while(curr.next!= null){
            curr = curr.next;
        }
        curr.next = new ListNode(val);
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        ListNode curr = head;
        for(int i = 0; i<index-1; i++){
            curr = curr.next;
        }
        curr.next = new ListNode(val,curr.next);
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        if(index==0){
            head = head.next;
            size--;
            return;
        }
        else{
            ListNode curr = head;
            for(int i = 0; i<index-1; i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
        
    }
}
class ListNode{
    public int val;
    public ListNode next = null;
    public ListNode(int val, ListNode next){
        this.next = next;
        this.val = val;
    }
    public ListNode(int val){
        this.val = val;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */