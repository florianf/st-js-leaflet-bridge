package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.DOMEvent;

@STJSBridge()
@Namespace("L")
public class MouseEvent extends Event {
	public LatLng latLng;
	public Point layerPoint;
	public Point containerPoint;
	public DOMEvent originalEvent;
}
