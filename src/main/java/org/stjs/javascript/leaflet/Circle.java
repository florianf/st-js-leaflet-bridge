package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Circle extends Path {
	
	public Circle(LatLng latLng, int radius) {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(LatLng latLng, int radius, PathOptions options) {
		// TODO Auto-generated constructor stub
	}
	
	public native LatLng getLatLng();
	
	public native Circle setLatLng(LatLng latLng);
	
	public native int getRadius();
	
	public native int setRadius(int radius);
	
	public native Object toGeoJSON();
	
}
