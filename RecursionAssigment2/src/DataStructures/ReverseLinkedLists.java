package DataStructures;

public class ReverseLinkedLists {

	
	public static DoubleNode reverseRecursive3(node<Integer> head) {
		if (head == null || head.next == null) {
			DoubleNode output = new DoubleNode();
			output.head = head;
			output.tail = head;
			return output;
		}
		
		DoubleNode smallerOutput = reverseRecursive3(head.next);
		smallerOutput.tail.next = head;
		head.next = null;
		
		DoubleNode output = new DoubleNode();
		output.head = smallerOutput.head;
		return output;
		
	}
	public static DoubleNode reverseDouble(node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			DoubleNode output = new DoubleNode();
			output.head=head;
			output.tail=head;
			
		}
		DoubleNode smallerHead=reverseDouble(head.next);
		smallerHead.tail.next=head;
		head.next=null;
		smallerHead.tail=smallerHead.tail.next;
		return smallerHead;
		
	}
	public static node<Integer> reverseRecursive2(node<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		node<Integer> smallerHead = reverseRecursive2(head.next);
		head.next.next = head;
		head.next = null;
		return smallerHead;
	}
	
	public static node<Integer> reverseRecursive(node<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		node<Integer> smallerHead = reverseRecursive(head.next);
		node<Integer> temp = smallerHead;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return smallerHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head = linkedList.takeInputOfLinkedList();
		DoubleNode headReversed = reverseDouble(head);
		linkedList.printLinkedList(headReversed.head);
	}

}
