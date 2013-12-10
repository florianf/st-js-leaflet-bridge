package org.stjs.javascript.leaflet.control;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.leaflet.LeafletNamespace;

@STJSBridge()
@Namespace(LeafletNamespace.Control)
public class Scale extends Control {
	public Scale (ScaleOptions options) {
		super(null);
	}
}
