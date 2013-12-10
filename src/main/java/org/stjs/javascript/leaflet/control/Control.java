package org.stjs.javascript.leaflet.control;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.leaflet.IControl;
import org.stjs.javascript.leaflet.LeafletNamespace;
import org.stjs.javascript.leaflet.Map;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Control extends IControl{
	public Control (ControlOptions options) {
		
	}
	
	public native Control setPosition(String position);
	
	public native String getPosition();
	
	public native Control addTo(Map map);
	
	public native Control removeFrom(Map map);
	
	public native Element getContainer();
}
