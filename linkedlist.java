public class SimpleLinkedList {
    private static Node head;
  	private static Node tail;

	public static void main(String[] args) {
    	Node test = new Node(2);
        test.add(5);
      	test.printList();
	} 
  
    public static class Node {
    	Node next;
    	int data;

        public Node(int data){
          	System.out.println("adding: " + data);
			this.data = data;
          	this.next = null;
          
            if(head==null){
            	head = this;
            };
          	//tail = this;
        }

        public void add(int data){
            Node newNode = new Node(data);
            newNode.next = null;
            if(head == null) {
                //if first element, make it the head and tail of the list
              	//System.out.println("starting with: " + data);
                head = newNode;
                tail = newNode;
            } else {
              	//System.out.println("appending: " + data);
                //put new node at the end, previous node point to new
                tail.next = newNode;
                tail = newNode;
            }
        }
      	
        public void printList(){
          	System.out.println("Printing elements:");
        	Node temp = head;
          	while(temp!=null){
          		System.out.println(temp.data);
              	temp = temp.next;
          	}
        }

    }
}