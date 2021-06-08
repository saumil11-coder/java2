package linkedlist1;

public class reverselinkedlist {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next =null;
		}
	}
	//reverse
	Node reverse(Node head)
	{
		Node prev=null;
		Node current =head;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}
	void printlist(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data+"->");
			head=head.next;
		}
		
	}

	public static void main(String[] args) {
		reverselinkedlist list=new reverselinkedlist();
		  list.head = new Node(85);
	        list.head.next = new Node(15);
	        list.head.next.next = new Node(4);
	        list.head.next.next.next = new Node(20);
	        System.out.println("given one::");
	        list.printlist(head);
	        head=list.reverse(head);
	        System.out.println("");
	        System.out.println("solution after reversing");
	        list.printlist(head);
	}

}
