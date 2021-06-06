package linkedlist1;
public class middleelement {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next =null;
		}
	}
	void printmiddle()
	{
		Node slow_ptr=head;
		Node fast_ptr=head;
		if(head!=null)
		{
			while(fast_ptr!=null&&fast_ptr.next!=null)
			{
				fast_ptr=fast_ptr.next.next;
				slow_ptr=slow_ptr.next;
			}
			System.out.println("the middle element["+slow_ptr.data+"]");
		}
	}
public 	void push(int newd)

	{
       Node newd_node=new Node(newd);
       newd_node.next=head;
       head=newd_node;
	}
public void printlist()
{
	Node tnode=head;
	while(tnode!=null) 
	{
		System.out.print(tnode.data+"->");
		tnode=tnode.next;
	}
	System.out.println("NULL");
}

	public static void main(String[] args) {
		middleelement  ml=new middleelement();
		for(int i=0;i<5;i++) {
		ml.push(i);
		ml.printlist();
		ml.printmiddle();
		
		}
	}

}

