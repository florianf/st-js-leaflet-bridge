package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public abstract class ICRS {
	public abstract Point latLngToPoint(LatLng latlng, int zoom); 
}
