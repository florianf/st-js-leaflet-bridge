package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback1;

@STJSBridge()
@Namespace("L")
public class Map {
	public Map(Element element, MapOptions options) {
		
	}
	
	public Map(String element, MapOptions options) {
		
	}
	
	public native void setView(LatLng center);
	public native void setView(LatLng center, int zoom);
	public native void setView(LatLng center, ZoomPanOptions options);
	
	public native void zoomIn(int delta);
	public native void zoomIn(int delta, ZoomOptions options);

	public native void zoomOut(int delta);
	public native void zoomOut(int delta, ZoomOptions options);
	
	public native void setZoomAround(LatLng latLng, int zoom);
	public native void setZoomAround(LatLng latLng, int zoom, ZoomOptions options);
	
	public native void addEventListener(String type, Callback1 fn);
	
}
