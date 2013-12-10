package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class ErrorEvent extends Event {
	public String message;
	public int code;
}
