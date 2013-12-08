package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace("L")
public abstract class ICRS {
	public abstract Point latLngToPoint(LatLng latlng, int zoom); 
}
