package linkedlist1;

public class intersection {
	//for pointing to both linked list
	static  Node a=null,b=null;
	//for the resultant one
	static Node dummy=null;
	static Node tail=null;
	static class Node
	{
		int data;
		Node next;
		 Node(int d){
		data=d;
		next=null;
		 }
	}
	void srotedintersect()
	{
		Node p=a,q=b;
		while(p!=null&&q!=null)
		{
			if(p.data==q.data)
			{
				push(p.data);
				p=p.next;
				q=q.next;
			}
			else if(p.data<q.data)
			{
				p=p.next;
				
			}
			else
				q=q.next;
		}
	}
	void push(int data)
	{
		Node temp=new Node(data);
		if(dummy==null)
		{
			dummy=temp;
			tail=temp;
		}
		else {
			tail.next=temp;
			tail=temp;
		}
	}
void printlist(Node head)
{
	while(head!=null)
	{
		System.out.println(head.data+"->");
		head=head.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		intersection list=new intersection();
		  list.a = new Node(1);
	        list.a.next = new Node(2);
	        list.a.next.next = new Node(3);
	        list.a.next.next.next = new Node(4);
	        list.a.next.next.next.next = new Node(6);
	 
	        // creating second linked list
	        list.b = new Node(2);
	        list.b.next = new Node(4);
	        list.b.next.next = new Node(6);
	        list.b.next.next.next = new Node(8);
	         list.srotedintersect();
	         System.out.println("resultant linkedlist");
	         list.printlist(dummy);
	}

}
