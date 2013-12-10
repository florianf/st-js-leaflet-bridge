package org.stjs.javascript.leaflet.tilelayer;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.leaflet.LeafletNamespace;

@STJSBridge()
@Namespace(LeafletNamespace.TileLayer)
public class WMS extends TileLayer {

	public WMS(String urlTemplate, WMSLayerOptions options) {
		super(urlTemplate, options);	
	}

	public native WMS setParams(WMSLayerOptions options);
}
