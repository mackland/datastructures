public class LinkedList{
    ListNode head;
    ListNode tail;
    
    private class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    
    public LinkedList(){
        this.head = null;
        this.tail = head;
    }
    
    public void add(int data){
        if(head == null){
            this.head = new ListNode(data);
            this.tail = head;
        }

        ListNode currentNode = new ListNode(data);
        this.tail.next = currentNode;
        this.tail = currentNode;
    }

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addLast(int data){
        add(data);
    }

    public void removeLast(){
        ListNode current = this.head;
        while(current.next != this.tail){
            current = current.next;
        }

        this.tail = current;
        this.tail.next = null;
    }

    public void removeFirst(){
        this.head = this.head.next;
    }

    public boolean contains(int val){
        ListNode current = this.head;

        while(current != null){
            if(current.data == val){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size(){
        int size = 0;
        ListNode current = this.head;
        while(current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}

/*
 *x addFirst
 *x addLast
 *x removeLast
 *x removeFirst
 *x size
 * get
 *x contains
 */
