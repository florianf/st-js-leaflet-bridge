package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@Namespace("L")
@SyntheticType
public class PanOptions {
	public boolean animate;
	public double duration;
	public double easeLinearity;
	public boolean noMoveStart;
}
