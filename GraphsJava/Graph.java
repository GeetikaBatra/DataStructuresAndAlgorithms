package GraphDS;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph implements GraphInterface{
	private HashMap<String, Vertex> vertices;

	public Graph(){
		this.vertices = new HashMap<String, Vertex>();
		
	}
	@Override
	public void addVertex(String name) {
		// TODO Auto-generated method stub
			if (vertices.containsKey(name)) {
				return;
			}
			Vertex v = new Vertex(name);
			vertices.put(name, v);
	}
	
	@Override
	public Vertex getVertex(String data) {
		if (!vertices.containsKey(data)) {
			return null;
		}
		Vertex v = vertices.get(data);
		return v;
	}


	public void print() {
		System.out.println("Printing Graph");
//		 temp = new Vertex;
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		// if no new Vertex[0] the type of as object[] instaed of vertex[]
		for(Vertex v:allVertices) {
			System.out.println(v.name);
			v.print();
		}
	}
	@Override
	public void AddEdge(String first, String second) {
		// TODO Auto-generated method stub
		
		if(!vertices.containsKey(first) || !vertices.containsKey(second)) {
			return;
		}
		Vertex firstVertex = vertices.get(first);
		Vertex secondVertex = vertices.get(second);
		if(firstVertex.isAdjacent(secondVertex)) {
			return ;
		}
		Edge e = new Edge();
		e.first = firstVertex;
		e.second = secondVertex;
		firstVertex.addEdge(e);
		secondVertex.addEdge(e);
		
	}

	@Override
	public void removeVertex(String data) {
		// TODO Auto-generated method stub
		if(!vertices.containsKey(data)) {
			return;
		}
		Vertex toBeRemoved = vertices.get(data);
		vertices.remove(data);
		ArrayList<Vertex> adjacentVertices = toBeRemoved.getAdjacent();
		for(Vertex adjacentVertex:adjacentVertices){
			adjacentVertex.removeEdgeWith(toBeRemoved);
		}
	}

	@Override
	public void removeEdge(String first, String second) {
		// TODO Auto-generated method stub
		if(!vertices.containsKey(first) || !vertices.containsKey(second)) {
			return;
		}
		
		Vertex firstVertex = vertices.get(first);
		Vertex secondVertex = vertices.get(second);
		firstVertex.removeEdgeWith(secondVertex);
		secondVertex.removeEdgeWith(firstVertex);

	}

	@Override
	public ArrayList<String> getAdjacent(String from) {
		// TODO Auto-generated method stub
		
		if (!vertices.containsKey(from)){
			return null;
		}
		
		Vertex fromVertex = vertices.get(from);
		ArrayList<Vertex> adjacentVertices = fromVertex.getAdjacent();
		ArrayList<String> output = new ArrayList<String>();
		for(Vertex v: adjacentVertices) {
			String name = v.name;
			output.add(name);
		}
		return output;
		
		
	}

	@Override
	public int getDegree(String node) {
		// TODO Auto-generated method stub
		
		if(!vertices.containsKey(node)) {
			return  -1;
		}
		Vertex nodeVertex = vertices.get(node);
		return nodeVertex.getDegree();
	}

	@Override
	public int numberOfVertices() {
		// TODO Auto-generated method stub
		
		return vertices.size();
	}

	@Override
	public int numberOfEdges() {
		// TODO Auto-generated method stub
		int count  =  0;
	
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		
		for(Vertex v:allVertices) {
			count = count + v.getDegree();
		}
		
		return count/2	;
	}

	@Override
	public boolean areTwoVerticesConnected(String first, String second) {
		// TODO Auto-generated method stub
		if(!vertices.containsKey(first) || !vertices.containsKey(second)) {
			return false;
		}
		Vertex firstVertex = vertices.get(first);
		Vertex secondVertex = vertices.get(second);
		
		if(firstVertex.isAdjacent(secondVertex) || secondVertex.isAdjacent(firstVertex)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
