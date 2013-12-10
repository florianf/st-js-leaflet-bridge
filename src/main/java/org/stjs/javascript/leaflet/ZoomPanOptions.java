package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@Namespace("L")
@SyntheticType
public class ZoomPanOptions {
	public boolean reset;
	public PanOptions panOptions;
	public ZoomOptions zoomOptions;
	public boolean animate;
}
