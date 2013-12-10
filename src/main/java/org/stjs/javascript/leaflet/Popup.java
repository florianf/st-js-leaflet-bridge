package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Popup {
	public Popup() {
		// TODO Auto-generated constructor stub
	}
	
	public Popup(PopupOptions options) {
		// TODO Auto-generated constructor stub
	}
	
	public Popup(PopupOptions options, ILayer source) {
		// TODO Auto-generated constructor stub
	}
	
	public native LatLng getLatLng();
	
	public native Popup setLatLng(LatLng latLng);
	
	public native Popup setContent(String html);
	public native Popup setContent(Element el);
	
	public native Popup update();
	
	public native Popup addTo(Map map);
	
	public native Popup openOn(Map map);
}
