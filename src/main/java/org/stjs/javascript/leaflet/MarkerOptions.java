package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class MarkerOptions {
	public Icon icon;
	public boolean clickable;
	public boolean draggable;
	public boolean keyboard;
	public String title;
	public String alt;
	public int zIndexOffset;
	public double opacity;
	public boolean riseOnHover;
	public int riseOffset;
}
