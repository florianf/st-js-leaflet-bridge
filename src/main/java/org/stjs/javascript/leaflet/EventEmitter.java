package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback1;

@STJSBridge()
@SyntheticType
public class EventEmitter {
	public native Map addEventListener(String type, Callback1 fn);
	public native Map addEventListener(org.stjs.javascript.Map<String, Callback1> eventMap);
	
	public native Map addOneTimeEventListener(String type, Callback1 fn);
	
	
	public native Map removeEventListener(String type);
	public native Map removeEventListener(String type, Callback1 fn);
	public native Map removeEventListener(org.stjs.javascript.Map<String, Callback1> eventMap);
	public native Map removeEventListener();
	
	public native boolean hasEventListeners(String type);
	
	public native Map fireEvent(String type);
	public native Map fireEvent(String type, Object data);
	
	public native Map clearAllEventListeners();
	
	public native Map on(String type, Callback1 fn);
	public native Map on(org.stjs.javascript.Map<String, Callback1> eventMap);
	
	public native Map once(String type, Callback1 fn);
	
	public native Map off(String type);
	public native Map off(String type, Callback1 fn);
	public native Map off(org.stjs.javascript.Map<String, Callback1> eventMap);
	public native Map off();
	
	public native Map fire(String type);
	public native Map fire(String type, Object data);
}
