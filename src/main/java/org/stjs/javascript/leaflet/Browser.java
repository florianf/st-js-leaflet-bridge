package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Browser {
	public static boolean ie;
	public static boolean ie6;
	public static boolean ie7;
	public static boolean webkit;
	public static boolean webkit3d;
	public static boolean android;
	public static boolean android23;
	public static boolean mobile;
	public static boolean mobileWebkit;
	public static boolean mobileOpera;
	public static boolean touch;
	public static boolean msTouch;
	public static boolean retina;
	public static String test = "HELLO";
}
