package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class LatLngBounds {
	public LatLngBounds(LatLng southWest, LatLng northEast) {
		
	}
	
	public LatLngBounds(Array<LatLng> latLngs) {
		
	}
	
	public native LatLngBounds extend(LatLngBounds bounds);
	
	public native LatLngBounds extend(Array<LatLng> latLngs);
	
	public native LatLng getSouthWest();
	
	public native LatLng getNorthEast();
	
	public native LatLng getNorthWest();
	
	public native LatLng getSouthEast();
	
	public native LatLng getWest();
	
	public native LatLng getSouth();
	
	public native LatLng getEast();
	
	public native LatLng getNorth();
	
	public native LatLng getCenter();
	
	public native boolean contains(LatLngBounds bounds);
	
	public native boolean contains(LatLng latLng);
	
	public native boolean intersects(LatLngBounds bounds);
	
	public native boolean equals(LatLngBounds bounds);
	
	public native String toBBoxString();
	
	public native LatLngBounds pad(double bufferRatio);
	
	public native boolean isValid();
}
