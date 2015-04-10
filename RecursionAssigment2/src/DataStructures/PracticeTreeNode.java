package DataStructures;

import java.util.ArrayList;

public class PracticeTreeNode<T> {
   T data;
   ArrayList<PracticeTreeNode<T>> children;
   
   public PracticeTreeNode(T data)
   {
	   this.data=data;
	   children = new ArrayList<PracticeTreeNode<T>>();
   }
}
