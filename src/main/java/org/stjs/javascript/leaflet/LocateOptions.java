package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class LocateOptions {
	public boolean watch;
	public boolean setView;
	public int maxZoom;
	public int timeout;
	public int maximumAge;
	public boolean enableHighAccuracy;
}
