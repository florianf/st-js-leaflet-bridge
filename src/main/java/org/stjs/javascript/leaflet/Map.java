package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;

@STJSBridge()
@Namespace("L")
public class Map {
	public Map(Element element, MapOptions options) {
		
	}
	
	public Map(String element, MapOptions options) {
		
	}
	
	public native void setView(LatLng center);
	public native void setView(LatLng center, int zoom);
}
