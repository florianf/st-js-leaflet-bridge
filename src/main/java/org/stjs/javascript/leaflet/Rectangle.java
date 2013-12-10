package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Rectangle extends Polygon {
	public Rectangle(LatLngBounds bounds) {
		super(null);
	}
	
	public Rectangle(LatLngBounds bounds, PathOptions options) {
		super(null);
	}
	
	public native Rectangle setBounds(LatLngBounds bounds);
}
