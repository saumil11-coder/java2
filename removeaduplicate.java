package linkedlist1;

public class removeaduplicate {
Node head;
class Node
{
	int data;
	Node next;
	Node(int d){ data=d; next=null;}
	
}
void removeduplicate()
{
	Node curr=head;
	while(curr!=null)
	{
		Node temp=curr;
		while(temp!=null&&temp.data==curr.data)
		{
			temp=temp.next;
					}
		curr.next=temp;
		curr=curr.next;

	}
}
 public void push(int newdata) {
Node newd=new Node(newdata);
newd.next=head;
head=newd;
}
 void print()
 {
	 Node temp=head;
	 while(temp!=null)
	 {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
		 
	 }
	 System.out.println();
 }
	public static void main(String[] args) {
		removeaduplicate llist=new removeaduplicate();
		llist.push(20);
	        llist.push(13);
	        llist.push(13);
	        llist.push(11);
	        llist.push(11);
	        llist.push(11);
	         
	        System.out.println("List before removal of duplicates");
	        llist.print();
	         
	        llist.removeduplicate();
	         
	        System.out.println("List after removal of elements");
	        llist.print();
	}

}
