package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace("L")
public class LatLng {
	public double lat;
	public double lng;
	public double altitude;
	
	public LatLng(double lat, double lng, double altitude) {
		// TODO Auto-generated constructor stub
	}
	
	public LatLng(double lat, double lng) {
		// TODO Auto-generated constructor stub
	}
	
	public native double distanceTo(LatLng latLng);
}
