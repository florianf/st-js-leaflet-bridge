package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class IconOptions {
	public String iconUrl;
	public String iconRetinaUrl;
	public Point iconSize;
	public Point iconAnchor;
	public String shadowUrl;
	public String shadowRetinaUrl;
	public Point shadowSize;
	public Point shadowAnchor;
	public Point popupAnchor;
	public String className;
}
