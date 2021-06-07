package linkedlist1;

public class deletemiddle {
	static class Node{
		//link list node
		int data;
		Node next;
	}
	static Node deletemid(Node head)
	{//BASE CASES
		if(head==null)
			return null;
		if(head.next==null) {
			return null;
	}
		Node slow_ptr=head;
		Node fast_ptr=head;
		//find the middle and the previous of middle
		Node prev =null;
		//to store previous of slow_ptr
		while(fast_ptr!=null&&fast_ptr.next!=null)
		{
			fast_ptr=fast_ptr.next.next;
		prev=slow_ptr;
		slow_ptr=slow_ptr.next;
		}
		//delete the middle
		prev.next=slow_ptr.next;
		return head;
	}
	static void printlist(Node ptr)
	{
		while(ptr!=null)
		{
			System.out.println(ptr.data+"->");
			ptr=ptr.next;
		}
		System.out.println("NuLL");
	}
	static Node newNode(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		return temp;
	}
	public static void main(String[] args) {
		Node head=newNode(1);
		head.next=newNode(2);
		head.next.next=newNode(4);
		head.next.next.next=newNode(5);
		System.out.println("given linked  list");
		printlist(head);
		head=deletemid(head);
		System.out.println("linkedlist after deletion");
		printlist(head);

	}

}
