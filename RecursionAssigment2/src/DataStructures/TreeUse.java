package DataStructures;

import java.util.Scanner;

public class TreeUse {
	
	public static TreeNode<Integer> takeTreeInput2() {
		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<TreeNode<Integer>>();
		System.out.println("Enter root");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = queue.dequeue();
			} catch (queueEmptyException e) {
				// Cant reach here
				return null;
			}
			System.out.println("Enter number of children of " + currentNode.data);
			int numChildren = s.nextInt();
			for (int i =0; i < numChildren; i++) {
				System.out.println("Enter data for " + i + "th child of " + currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				currentNode.children.add(child);
				queue.enqueue(child);
			}
		}
		return root;
		
	}
	
	public static TreeNode<Integer> takeTreeInput() {
		System.out.println("Enter root");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		System.out.println("Enter number of children of " + rootData);
		int numChildren = s.nextInt();
		
		for (int i =0; i< numChildren; i++) {
			TreeNode<Integer> child = takeTreeInput();
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String rootString = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			rootString = rootString + root.children.get(i).data + ",";
		}
		System.out.println(rootString);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static void printAtK(TreeNode<Integer> root, int k) {
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		for (int i =0; i < root.children.size(); i++) {
			System.out.println("Calling " + root.children.get(i).data + " with " + (k-1));
			printAtK(root.children.get(i), k-1);
		}
	}
	
	public static int largestNode(TreeNode<Integer> root) {
		int max = root.data;
		
		for (int i =0; i < root.children.size(); i++) {
			int currentMax = largestNode(root.children.get(i));
			if (currentMax > max) 
				max = currentMax;
		}
		return max;
	}
	public static int numOfTimes(TreeNode<Integer> root,int k)
	{
		int count=0;
		if(root.data==k)
		{
			count++;
		}
		for(int i=0;i<root.children.size();i++)
		{
			count+=numOfTimes(root.children.get(i),k);
		}
		return count;
		
	}
	public static int sumOfNodes(TreeNode<Integer> root)
	{
		int sum=root.data;
		for(int i=0;i<root.children.size();i++)
		{
			sum+=sumOfNodes(root.children.get(i));
		}
		return sum;
	}
	public static int heightOfTree(TreeNode<Integer> root)
	{
		int max=0;
		for (int i =0; i < root.children.size(); i++) {
			int currentMax = heightOfTree(root.children.get(i));
			if (currentMax > max) 
				max = currentMax;
		}
		return max+1;
	}
	public static int totalNodes(TreeNode<Integer> root)
	{
		int count=1;
		for(int i=0;i<root.children.size();i++)
		{
			count+=totalNodes(root.children.get(i));
		}
		return count;
	}
	public static TreeNode<Integer> maxChildren(TreeNode<Integer> root)
	{
		int numChildren=root.children.size();
		TreeNode<Integer> nodeWithMax=root;
		for(int i=0;i<root.children.size();i++)
			
		{
			TreeNode<Integer> currentNode=maxChildren(root.children.get(i));
			int currentChildren = currentNode.children.size();
			if(currentChildren>numChildren)
			{
				numChildren=currentChildren;
				nodeWithMax=currentNode;
			}
	
		}
		return nodeWithMax;
		
	}
//	public static boolean identicalCheck(TreeNode<Integer> Tree1,TreeNode<Integer> Tree2){
//		if(Tree1.children.size()==0 && Tree2.children.size()==0)
//		{
//			return 
//		}
//	}
	public static TreeNode<Integer> MaxThanN(TreeNode<Integer> root,int n)
	{
		int numOfChildren = root.children.size();
		TreeNode<Integer> max=root;
		for(int i=0;i<numOfChildren;i++)
		{
			TreeNode<Integer> currentMax;
			currentMax=MaxThanN(root.children.get(i),n);
			if(currentMax.data>n )
				
				{
				max=currentMax;
				break;
				}
			
			
		}
		for(int i=0;i<numOfChildren;i++)
		{
			TreeNode<Integer> currentMax;
			currentMax=MaxThanN(root.children.get(i),n);
			if(currentMax.data>n && currentMax.data<max.data )
				max=currentMax;
			
			
		}
		
			return max;
		
	}
	public static int leafNodes(TreeNode<Integer> root)
	{
		int count=0;
		if(root.children.size()==0)
			count= 1;
		
		for(int i=0;i<root.children.size();i++)
		{
			count+=leafNodes(root.children.get(i));
			
		}
		return count;
		
	
	}
	public static boolean sameStructure(TreeNode<Integer> root1,TreeNode<Integer> root2)
	{
		if(root1.data==root2.data)
		{
			return false;
		}
		if(root1.children.size()!=root2.children.size())
		{
			return false;
		}
		for(int i=0;i<root1.children.size();i++)
		{
			boolean currentChildrenSame=sameStructure(root1.children.get(i),root2.children.get(i));
			if(!currentChildrenSame)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeTreeInput2();
		//print(root);
		//printAtK(root, 2);
	TreeNode<Integer> maxChildren=MaxThanN(root,2);
		System.out.println(maxChildren.data);
	//	System.out.println(leafNodes(root));
//		System.out.println(maxChildren.children.size());
	}

}
