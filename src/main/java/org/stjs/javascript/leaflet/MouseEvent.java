package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.DOMEvent;

@STJSBridge()
@SyntheticType
public class MouseEvent extends Event {
	public LatLng latLng;
	public Point layerPoint;
	public Point containerPoint;
	public DOMEvent originalEvent;
}
