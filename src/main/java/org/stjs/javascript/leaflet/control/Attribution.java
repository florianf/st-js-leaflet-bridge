package org.stjs.javascript.leaflet.control;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.leaflet.LeafletNamespace;

@STJSBridge()
@Namespace(LeafletNamespace.Control)
public class Attribution extends Control {
	public Attribution (AttributionOptions options) {
		super(null);
	}
	
	public native Attribution setPrefix(String prefix);
	public native Attribution addAtribution(String text);
	public native Attribution removeAttribution(String text);
}
