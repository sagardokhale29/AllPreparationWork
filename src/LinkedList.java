
public class LinkedList {
	
	static Node head;
	
	public static void insert(int data) {
		
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	
	public static void print() {
		
		Node node=head;
		
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}

}
