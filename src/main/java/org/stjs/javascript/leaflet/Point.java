package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Point {
	public Point (double x, double y) {
		
	}
	
	public Point (double x, double y, boolean round) {
		
	}
	
	public native Point add(Point otherPoint);
	
	public native Point subtract (Point otherPoint);
	
	public native Point multiplyBy (double number);
	
	public native Point dividyBy (double number, boolean round);
	
	public native double distanceTo(Point otherPoint);
	
	public native Point clone();
	
	public native Point round();
	
	public native Point floor();
	
	public native boolean equals (Point otherPoint);
	
	public native boolean contains(Point otherPoint);
	
	public native String toString();
}
