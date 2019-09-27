public class LinkedList {
	
	 Node head;
	 static int size;
	
	static class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
		}
	}
	
	public static void findMiddle(LinkedList list) {
		
		Node fast_ptr=list.head;
		Node slow_ptr=list.head;
		
		while(fast_ptr.next!=null && fast_ptr.next.next!=null ) {
			fast_ptr=fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
		}
		
		System.out.println("middle element is.."+slow_ptr.data);
	}
	
	
	public static LinkedList insert(LinkedList list,String data) {
		Node new_node=new Node(data);
		new_node.next=null;
		size=0;
		if(list.head==null) {
			list.head=new_node;
		}else {
			
			Node last=list.head;
			
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		
		return list;
		
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
	
	public static void print(LinkedList list) {
		
		Node currNode=list.head;
		
		while(currNode.next!=null) {
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
		System.out.println(currNode.data);
	}
	
	public static LinkedList roatateList(LinkedList list,int k) {
		System.out.println("size..."+size);
		
		Node currentNode=list.head;
		
		int count=1;
		
		while(count<k && currentNode.next!=null) {
			
			currentNode=currentNode.next;
			count++;
		}
		
		if(currentNode.next==null) {
			return list;
		}
		
		Node kthNode=currentNode;
		
		while(currentNode.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=list.head;
		list.head=kthNode.next;
		kthNode.next=null;
		return list;
		
	}
	
/*	public static LinkedList modifyList(LinkedList list) {
		Node headNode=list.head;
		Node currNode=list.head;
		int count=0;
		while(true) {
			++count ;
			if(currNode.data.equals("ID_A06")&& count ==6) {
				currNode.next=headNode;
				
			}else if(currNode.data.equals("ID_A04")&& count ==10) {
				currNode.next=null;
				break;
			}else if(currNode.data.equals("ID_A05")&& count ==5) {
				list.head=currNode;
			}
			
			currNode=currNode.next;
		}
		return list;
		
	}*/
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		System.out.println(list.isEmpty());
		list=LinkedList.insert(list,"ID_A01");
		list=LinkedList.insert(list,"ID_A02");
		list=LinkedList.insert(list,"ID_A03");
		list=LinkedList.insert(list,"ID_A04");
		list=LinkedList.insert(list,"ID_A05");
		list=LinkedList.insert(list,"ID_A06");
		list=LinkedList.insert(list,"ID_A07");
		
		LinkedList.print(list);
		
		findMiddle(list);
		list=roatateList(list,4);
		System.out.println("========================== modified===============");
		LinkedList.print(list);
		System.out.println(list.isEmpty());
	}

}
