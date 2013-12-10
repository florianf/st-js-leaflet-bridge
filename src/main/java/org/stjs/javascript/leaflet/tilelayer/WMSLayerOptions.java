package org.stjs.javascript.leaflet.tilelayer;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.leaflet.ICRS;

@STJSBridge()
@SyntheticType
public class WMSLayerOptions extends TileLayerOptions {
	public String layers;
	public String styles;
	public String format;
	public boolean transparent;
	public String version;
	public ICRS crs;
}
