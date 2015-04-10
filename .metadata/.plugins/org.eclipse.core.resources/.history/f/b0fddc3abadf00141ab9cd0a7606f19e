package DataStructures;

import java.util.Scanner;

public class PracticeTreeUse {

	
	public static PracticeTreeNode<Integer> takeInput()
	{
		System.out.println("Enter root");
		Scanner s = new Scanner(System.in);
		int rootData= s.nextInt();
		PracticeTreeNode<Integer> root = new PracticeTreeNode<Integer>(rootData);
		System.out.println("Enter the number of Children of " + root.data );
		int numOfChildren = s.nextInt();
		for(int i=0;i<numOfChildren;i++)
		{
			PracticeTreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
	}
	public static void print(PracticeTreeNode<Integer> root)
	{
		String rootString = root.data + ":";
		for(int i =0;i<root.children.size();i++)
		{
			rootString=rootString + root.children.get(i).data + "," ;
			
			
			
		}
		System.out.println(rootString);
		for(int i =0;i<root.children.size();i++)
		{
			print(root.children.get(i));
			
		}
	}
	public static PracticeTreeNode<Integer> TakeInput()
	
	{
		QueueUsingLL<PracticeTreeNode<Integer>> queue=new QueueUsingLL<PracticeTreeNode<Integer>>();
		System.out.println("Enter root");
		Scanner s = new Scanner(System.in);
		int rootData= s.nextInt();
		PracticeTreeNode<Integer> root = new PracticeTreeNode<Integer>(rootData);
		queue.enqueue(root);
		PracticeTreeNode<Integer> currentNode;
		
		
		while(!queue.isEmpty())
		{
			try
			{
				currentNode = queue.dequeue();
			}
			catch(queueEmptyException e)
			{
				return null;
			}
			System.out.println("Enter the Number Of children for " + currentNode.data);
			int numOfChildren=s.nextInt();
		for(int i=0;i<numOfChildren;i++)
		{
			System.out.println("Enter the data for"+i+"t children of" + currentNode.data );
			int data= s.nextInt();
			
			PracticeTreeNode<Integer> child=new PracticeTreeNode<Integer>(data);
			currentNode.children.add(child);
			queue.enqueue(child);
			
		}
		
		
	}
		return root;
}
	public static void main(String[] args) {
		
		PracticeTreeNode<Integer> root = TakeInput();
		print(root);
		
		
	}
	
}
