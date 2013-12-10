package org.stjs.javascript.leaflet.tilelayer;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class TileLayerOptions {
	public int minZoom;
	public int maxZoom;
	public int maxNativeZoom;
	public int tileSize;
	public Object subdomains;
	public String errorTileUrl;
	public String attribution;
	public boolean tms;
	public boolean continousWorld;
	public boolean noWrap;
	public int zoomOffset;
	public boolean zoomReverse;
	public double opacity;
	public int zIndex;
	public boolean unloadInvisibleTiles;
	public boolean updateWhenIdle;
	public boolean detectRetina;
	public boolean reuseTiles;
}
