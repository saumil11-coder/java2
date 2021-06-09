package linkedlist1;

public class reverseingivensize {
Node head;
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
Node  reverseingvinsize(Node head,int k)
{
	Node prev=null;
	Node current =head;
    Node next=null;
    int count=0;
    while(current!=null&&count<k)
    {
    	next=current.next;
    	current.next=prev;
    	prev=current;
    	current=next;
    	count++;
    }
    if(next!=null)
    
    	head.next=reverseingvinsize(next, k);
    	return prev;
    
   
}
void printlist()
{
	Node temp = head;
    while (temp != null) 
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}
public void push(int newdata)
{
	Node newd=new Node(newdata);
	newd.next=head;
	head=newd;
}
	public static void main(String[] args) {
		reverseingivensize llist=new reverseingivensize();
	llist.push(9);
	        llist.push(8);
	        llist.push(7);
	        llist.push(6);
	        llist.push(5);
	        llist.push(4);
	        llist.push(3);
	        llist.push(2);
	        llist.push(1);
	        System.out.println("given linked list");
	        llist.printlist();
	        llist.head=llist.reverseingvinsize(llist.head, 3);
	        System.out.println("reverse linked list");
	        llist.printlist();
	}

}
