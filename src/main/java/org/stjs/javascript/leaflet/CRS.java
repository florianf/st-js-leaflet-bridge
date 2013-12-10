package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class CRS {
	public static ICRS EPSG3857;
	public static ICRS EPSG4326;
	public static ICRS EPSG3395;
	public static ICRS Simple;
}
