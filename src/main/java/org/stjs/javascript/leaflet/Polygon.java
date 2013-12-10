package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Polygon extends Polyline {

	public Polygon(Array<LatLng> latLngs) {
		super(null);
	}

	public Polygon(Array<LatLng> latLngs, PolylineOptions options) {
		super(null);
	}
}
