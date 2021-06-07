package linkedlist1;

public class removeduplicates {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	void removeduplicate()
	{
		Node temp=head,prev=head;
		while(temp!=null)
		{
			if(temp.data!=prev.data)
			{
				prev.next=temp;
				prev=temp;
			}
			temp=temp.next;
		}
		if(prev!=null)
			prev.next=null;
	}
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
		
	}
	void printlist()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+"=>");
			temp=temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		removeduplicates llist = new removeduplicates();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
         
        System.out.print("List before ");
        System.out.println("removal of duplicates");
        llist.printlist();
         
        llist.removeduplicate();
         
        System.out.println("List after removal of elements");
        llist.printlist();

	}

}
