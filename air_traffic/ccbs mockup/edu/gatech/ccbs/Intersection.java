package edu.gatech.ccbs;

import java.awt.geom.Point2D;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection {
	public int index = 0;
	public int fileIndex = 0;
	public Point2D.Double point;
	public Set parents;
	public Set neighbors;
	public boolean automatic = false;
	
	public Intersection() {
		parents = new HashSet();
		neighbors = new HashSet();
	}
	
	public void printIntersection() {
		System.out.print("intersetion at: ");
		Iterator itr = parents.iterator();
		
		while(itr.hasNext()) {
			ShapeModel sm = (ShapeModel)itr.next();
			System.out.print(sm.desc);
			System.out.print(", ");
		}
		
		System.out.println("");
	}
	
	public String stringify() {
		StringBuffer sb = new StringBuffer();
		sb.append("Intersection: ");
		Iterator itr = parents.iterator();
		
		while(itr.hasNext()) {
			ShapeModel sm = (ShapeModel)itr.next();
			sb.append(sm.name);
			sb.append(", ");
		}
		
		return sb.toString();
	}
}
