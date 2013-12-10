package org.stjs.javascript.leaflet.control;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.leaflet.ILayer;
import org.stjs.javascript.leaflet.LeafletNamespace;

@STJSBridge()
@Namespace(LeafletNamespace.Control)
public class Layers extends Control {
	public Layers() {
		super(null);
	}

	public Layers(Map<String, ILayer> baseLayers) {
		super(null);
	}
	
	public Layers(Map<String, ILayer> baseLayers, Map<String, ILayer> overlays) {
		super(null);
	}
	
	public Layers(Map<String, ILayer> baseLayers, Map<String, ILayer> overlays, LayersOptions options) {
		super(null);
	}
	
	public native Layers addBaseLayer(ILayer layer, String name);
	
	public native Layers addOverlay(ILayer layer, String name);
	
	public native Layers removeLayer(ILayer layer);
}
