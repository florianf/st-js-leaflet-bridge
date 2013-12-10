package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class ImageOverlay extends ILayer {
	public ImageOverlay(String imageUrl, LatLngBounds bounds) {
		// TODO Auto-generated constructor stub
	}
	
	public ImageOverlay(String imageUrl, LatLngBounds bounds, ImageOverlayOptions options) {
		// TODO Auto-generated constructor stub
	}
	
	public native ImageOverlay setUrl(String url);
	
	public native ImageOverlay addTo(Map map);
	
	public native ImageOverlay bringToFront();
	
	public native ImageOverlay bringToBack();
	
	public native ImageOverlay setOpacity(double opacity);

}
