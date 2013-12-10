package org.stjs.javascript.leaflet.control;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.leaflet.LeafletNamespace;

@STJSBridge()
@Namespace(LeafletNamespace.Control)
public class Zoom extends Control {
	public Zoom (ControlZoomOptions options) {
		super(null);
	}
}
