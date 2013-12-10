package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class LayerGroup extends ILayer {
	public LayerGroup(Array<ILayer> layers) {
		
	}
	
	public native LayerGroup addTo(Map map);
	
	public native LayerGroup addLayer(ILayer layer);
	
	public native LayerGroup removeLayer(String id);
	
	public native boolean hasLayer(String id);
	
	public native Array<ILayer> getLayers();
	
	public native LayerGroup clearLayers();
	
	public native 	LayerGroup eachLayer(Callback1<ILayer> callback);
	
	public native Object toGeoJSON();
	
}
