package techno;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Employee {
	
	private TreeMap  tmap;
	public TreeMap getTmap() {
		return tmap;
	}
	public void setTmap(TreeMap tmap) {
		this.tmap = tmap;
	}
	public Vector getVector() {
		return vector;
	}
	public void setVector(Vector vector) {
		this.vector = vector;
	}
	public TreeSet getSet() {
		return set;
	}
	public void setSet(TreeSet set) {
		this.set = set;
	}
	private Vector vector;
	private TreeSet set;
	
}
