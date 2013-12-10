package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class FeatureGroup extends LayerGroup {

	public FeatureGroup(Array<ILayer> layers) {
		super(layers);
		// TODO Auto-generated constructor stub
	}
	
	public native Path bindPopup(String html);
	public native Path bindPopup(Element el);
	public native Path bindPopup(Popup html);
	public native Path bindPopup(String html, PopupOptions options);
	public native Path bindPopup(Element el, PopupOptions options);
	public native Path bindPopup(Popup html, PopupOptions options);
	
	public native Path setStyle(PathOptions options);
	
	public native LatLngBounds getBounds();
	
	public native Path bringToFront();
	
	public native Path bringToBack();

}
