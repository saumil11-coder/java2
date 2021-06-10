package linkedlist1;

public class detectloop {
	 static Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
 static 	boolean detectaloop(Node head)
	{
		Node low=head;
		Node high=head;
		while(head!=null&&head.next!=null)
		{
			low=low.next;
			high=high.next.next;
			if(high==low)
			{
				return true;
			}
		}
		return false;
	}
	void push(int newdata)
	{
		Node newd=new Node(newdata);
		newd.next=head;
		head=newd;
	}

	public static void main(String[] args) {
	detectloop llist=new detectloop()	;
	llist.push(20);
    llist.push(4);
    llist.push(15);
    llist.push(10);
	llist.head.next.next.next.next=llist.head;
	if(detectaloop(head))
	{
		System.out.println("loop is here");
	}
	else
		System.out.println("nope");
	}

}
