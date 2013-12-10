package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public abstract class Path extends EventEmitter {
	public static boolean SVG;
	public static boolean VML;
	public static boolean CANVAS;
	public static boolean CLIP_PADDING;
	
	public native Path addTo(Map map);
	
	public native Path bindPopup(String html);
	public native Path bindPopup(Element el);
	public native Path bindPopup(Popup html);
	public native Path bindPopup(String html, PopupOptions options);
	public native Path bindPopup(Element el, PopupOptions options);
	public native Path bindPopup(Popup html, PopupOptions options);
	
	public native Path unbindPopup();
	
	public native Path openPopup(LatLng latLng);
	
	public native Path closePopup();
	
	public native Path setStyle(PathOptions options);
	
	public native LatLngBounds getBounds();
	
	public native Path bringToFront();
	
	public native Path bringToBack();
			
	public native Path redraw();
}
