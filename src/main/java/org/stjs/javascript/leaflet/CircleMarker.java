package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class CircleMarker extends Circle {
	public CircleMarker(LatLng latLng) {
		super(null, 0);
	}
	
	public CircleMarker(LatLng latLng, PathOptions options) {
		super(null, 0);
	}
}
