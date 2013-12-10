package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class GeoJSONEvent extends Event {
	public ILayer layer;
	public Object properties;
	public String geometryType;
	public String id;
}
