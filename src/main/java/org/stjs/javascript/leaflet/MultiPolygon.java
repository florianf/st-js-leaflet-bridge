package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class MultiPolygon extends FeatureGroup {
	public MultiPolygon(Array<Array<LatLng>> latLngs) {
		super(null);
	}
	
	public MultiPolygon(Array<Array<LatLng>> latLngs, PolylineOptions options) {
		super(null);
	}
	
	public native MultiPolyline setLatLngs(Array<Array<LatLng>> latLngs);
	
	public native Array<Array<LatLng>> getLatLngs();
	
	public native MultiPolyline openPopup();
	
	public native Object toGeoJSON();
}
