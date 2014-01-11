package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Polygon extends Polyline {
	
	public Polygon(Array<Array<LatLng>> latLngs) {
		super(null);
	}

	public Polygon(Array<Array<LatLng>> latLngs, PathOptions options) {
		super(null);
	}
	
	
}
