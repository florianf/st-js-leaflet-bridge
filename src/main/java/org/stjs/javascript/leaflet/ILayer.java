package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public abstract class ILayer extends EventEmitter {
	public native void onAdd(Map map);
	public native void onRemove(Map map);
	protected native void _reset();
	
}
