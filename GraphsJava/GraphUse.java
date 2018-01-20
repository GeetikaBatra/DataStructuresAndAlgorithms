package GraphDS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class GraphUse {
	static ArrayList<Vertex> Visited = new ArrayList<Vertex>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph();
		
//		g.addVertex("Tom");
//		g.addVertex("Dick");
//		g.addVertex("Harry");
//		g.AddEdge("Tom","Dick");
//		g.AddEdge("Tom", "Harry");
//		g.AddEdge("Harry", "Dick");
		for(int i = 0; i<10; i++) {
			g.addVertex(Integer.toString(i));
		}
		
		for(int i = 0; i<10; i++) {
			for(int j = i+1; j<10;j++) {
					g.AddEdge(Integer.toString(i), Integer.toString(j));
				
				
			}
			
		}
//		g.removeEdge("Tom", "Harry");
//		g.removeVertex("Tom");
		g.print();
//		Vertex source = g.getVertex("Tom");
//		ArrayList<Vertex> dfs = DFS(source);
//		for(Vertex v:dfs){
//			System.out.println(v.name);
//		}
		
//		System.out.println(g.numberOfVertices());
//		System.out.println(g.numberOfEdges());
//		System.out.println(g.getAdjacent("Tom"));
//		System.out.println(g.getDegree("Dick"));
//		System.out.println(g.areTwoVerticesConnected("Tom","Harry"));
		
		

	}
	
	public static ArrayList<Vertex> DFS(Vertex Source)
	{
		ArrayList<Vertex> outputList = new ArrayList<Vertex>();
		Stack<Vertex> Tracker = new Stack<Vertex>();
		Tracker.push(Source);
		
		while(!Tracker.isEmpty()) {
			Vertex TempVariable = Tracker.peek();
			if(Visited.contains(TempVariable)){
				ArrayList<Vertex> adjacentVertices = TempVariable.getAdjacent();
				for(Vertex V:adjacentVertices) {
					if(!Visited.contains(V)) {
						Tracker.push(V);
					}
				}
				
			}
			else {
				Visited.add(TempVariable);
			}
			if(Tracker.peek()==TempVariable) {
				outputList.add(Tracker.pop());
			}
		}
		
		return outputList;
	}

	
}
