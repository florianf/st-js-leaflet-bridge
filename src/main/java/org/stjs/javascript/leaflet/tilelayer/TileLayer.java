package org.stjs.javascript.leaflet.tilelayer;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.leaflet.ILayer;
import org.stjs.javascript.leaflet.LeafletNamespace;
import org.stjs.javascript.leaflet.Map;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class TileLayer extends ILayer {
	
	public TileLayer(String urlTemplate, TileLayerOptions options) {
		
	}
	
	public TileLayer(String urlTemplate) {
	}
	
	public native TileLayer addTo(Map map);
	
	public native TileLayer bringToFront();
	
	public native TileLayer bringToBack();
	
	public native TileLayer setOpacity(double opacity);
	
	public native TileLayer setZIndex(int zIndex);
	
	public native TileLayer redraw();
	
	public native TileLayer setUrl(String urlTemplate);
	
	public native Element getContainer();
}
