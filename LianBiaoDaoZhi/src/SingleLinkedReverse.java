
public class SingleLinkedReverse {
	class Node{
		 int data;
		 Node next;
		  
		 public Node(int data){
		 this.data = data;
		 } 
		 }
		 public static void main(String[] args) {
		 SingleLinkedReverse slr = new SingleLinkedReverse();
		 Node head, tail,ta;
		 head = tail = slr.new Node(0);
		 for(int i=1; i<10; i++){
		 Node p = slr.new Node(i);
		 tail.next = p;
		 tail = p;
		 }
		 ta = head;
		 while(ta != null){
		 System.out.print(ta.data);
		 ta = ta.next;
		 }
		  
		 head = reverse(head);
		  
		 System.out.println( );
		 while(head != null){
		 System.out.print(head.data);
		 head = head.next;
		 }
		 }
		 private static Node reverse(Node head) {
			 Node pre = null;
			    Node next = null;
			    while (head != null) {
			        next = head.next;
			        head.next = pre;
			        pre = head;
			        head = next;
			    }
			    return pre;
		 }
}
