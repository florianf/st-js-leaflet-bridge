package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge
@SyntheticType
public abstract class PathOptions {
	public boolean stroke;
	public String color;
	public int weight;
	public double opacity;
	public boolean fill;
	public String fillColor;
	public double fillOpacity;
	public String dashArray;
	public String lineCap;
	public String lineJoin;
	public boolean clickable;
	public String pointerEvents;
	public String className;
}
