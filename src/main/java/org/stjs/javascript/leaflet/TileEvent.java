package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class TileEvent extends Event {
	public ILayer layer;
	public String name;
}
