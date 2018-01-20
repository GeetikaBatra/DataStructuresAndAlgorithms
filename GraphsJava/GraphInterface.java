package GraphDS;

import java.util.ArrayList;

public interface GraphInterface {
	public void addVertex(String data);
	public Vertex getVertex(String data);
	public void AddEdge(String first, String second);
	public void removeVertex(String data);
	public void removeEdge(String first, String second);
	
	public ArrayList<String> getAdjacent(String from);
	public int getDegree(String node);
	public int  numberOfVertices();
	public int numberOfEdges();
	public boolean areTwoVerticesConnected(String first, String second);
	public boolean isConnected();
	
}
