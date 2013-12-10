package org.stjs.javascript.leaflet.tilelayer;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.leaflet.LeafletNamespace;
import org.stjs.javascript.leaflet.Point;

@STJSBridge
@Namespace(LeafletNamespace.TileLayer)
public class Canvas extends TileLayer {

	public Canvas(String urlTemplate, CanvasLayerOptions options) {
		super(urlTemplate, options);
		// TODO Auto-generated constructor stub
	}

	public Canvas(String urlTemplate) {
		super(urlTemplate);
		// TODO Auto-generated constructor stub
	}
	
	public native Canvas drawTile(org.stjs.javascript.dom.Canvas canvas, Point tilePoint, int zoom);
	
	public native void tileDrawn(org.stjs.javascript.dom.Canvas canvas);

}
