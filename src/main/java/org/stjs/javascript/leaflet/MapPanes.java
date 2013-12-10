package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;

@STJSBridge()
@SyntheticType
public class MapPanes {
	public Element mapPane;
	public Element tilePane;
	public Element objectsPane;
	public Element shadowPane;
	public Element overlayPane;
	public Element markerPane;
	public Element popupPane;
}
