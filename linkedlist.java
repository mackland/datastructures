public class LinkedList{

    private class TreeNode(){
        TreeNode next;
        int val;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public LinkedList(){
        TreeNode head = null;
        TreeNode tail = head;
    }

    public void add(int val){
        TreeNode llnode = new TreeNode(val);
        if(head == null){
            head = llnode;
            tail = llnode;
        } else {
            tail.next = llnode;
            tail = llnode;
        }
    }

    public void addFirst(int val){
        TreeNode llnode = new TreeNode(val);
        llnode.next = head;
        head = llnode;
    }

    //public void addLast(int val){}

    public void removeFirst(){
        if(head == null) {
            return;
        } else if(head.next == null){
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast(){
        if(tail = null){
            return;
        } else {
        
        }
    }

    public int size(){}

    public int get(){}

    public boolean contains(int val){}
}

/*
 * addFirst
 * addLast
 * removeLast
 * removeFirst
 * size
 * get
 * contains
 */
