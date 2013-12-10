package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;

@STJSBridge()
@SyntheticType
public abstract class IControl {
	public native Element onAdd(Map map);
	public native Element onRemove(Map map);
}
