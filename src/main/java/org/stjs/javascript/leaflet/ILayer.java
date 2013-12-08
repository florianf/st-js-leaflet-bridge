package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace("L")
public abstract class ILayer {
	public abstract void onAdd(Map map);
	public abstract void onRemove(Map map);
	protected abstract void _reset();
	
}
