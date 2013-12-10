package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Polyline extends Path {
	public Polyline(Array<LatLng> latLngs) {
		
	}
	
	public Polyline(Array<LatLng> latLngs, PolylineOptions options) {
		
	}
	
	public native Polyline addLatLng(LatLng lagLng);
	
	public native Polyline setLatLngs(Array<LatLng> latLngs);
	
	public native Array<LatLng> getLatLngs();
	
	public native Array<LatLng> spliceLatLngs(int index, int pointsToRemove);
	
	public native Array<LatLng> spliceLatLngs(int index, int pointsToRemove, Array<LatLng> latLngs);
	
	public native Object toGeoJSON();
}
