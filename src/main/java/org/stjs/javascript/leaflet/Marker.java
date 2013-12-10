package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Marker extends ILayer{
	public IHandler dragging;
	
	public Marker(LatLng latLng) {
		// TODO Auto-generated constructor stub
	}
	
	public Marker(LatLng latLng, MarkerOptions options) {
		// TODO Auto-generated constructor stub
	}
	
	public native Marker addTo(Map map);
	
	public native Marker bindPopup(String html);
	public native Marker bindPopup(Element el);
	public native Marker bindPopup(Popup html);
	public native Marker bindPopup(String html, PopupOptions options);
	public native Marker bindPopup(Element el, PopupOptions options);
	public native Marker bindPopup(Popup html, PopupOptions options);
	
	public native Marker setPopupContent(String html);
	public native Marker setPopupContent(Element el);
	public native Marker setPopupContent(String html, PopupOptions options);
	public native Marker setPopupContent(Element el, PopupOptions options);

	public native Marker update();
	
	public native LatLng getLatLng();
	
	public native Marker setLatLng(LatLng latLng);
	
	public native Marker setIcon(IIcon icon);
	
	public native Marker setZIndexOffset(int offset);
	
	public native Marker setOpacity(double opacity);

	public native Marker unbindPopup();
	
	public native Marker openPopup(LatLng latLng);
	
	public native Marker closePopup();
	
	public native Marker togglePopup();
	
	public native Object toGeoJSON();
}
