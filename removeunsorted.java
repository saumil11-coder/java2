package linkedlist1;

import java.util.HashSet;

public class removeunsorted {
	static Node head;
	 static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	 static void remove(Node head)
	 {
		 HashSet<Integer> hs=new HashSet<>();
		 Node current =head;
		 Node prev=null;
		 while(current!=null)
		 {
			 int curval=current.data;
			 if(hs.contains(curval))
			 {
				 prev.next=current.next;
			 }
			 else
			 {
				 hs.add(curval);
				 prev=current;
			 }
			 current=current.next;
			 
		 }
		 
	 }
	 static void print(Node head)
	 {
		 while(head!=null)
		 {
			 System.out.print(head.data+" ");
			 head=head.next;
			 
			 
		 }
		System.out.println();
	 }

	public static void main(String[] args) {
		  Node start = new Node(10);
	        start.next = new Node(12);
	        start.next.next = new Node(11);
	        start.next.next.next = new Node(11);
	        start.next.next.next.next = new Node(12);
	        start.next.next.next.next.next = new Node(11);
	        start.next.next.next.next.next.next = new Node(10);
System.out.println("before removing");
print(start);
remove(start);
System.out.println("after removing ");
print(start);
	}

}
