package org.stjs.javascript.leaflet.control;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class ScaleOptions extends ControlOptions {
	public int maxWidth;
	public boolean metric;
	public boolean imperial;
	public boolean updateWhenIdle;
}
