package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;

@STJSBridge()
@SyntheticType
public class GeoJsonOptions {
	public Callback2<Object, LatLng	> pointToLayer;
	public Callback1<Object> style;
	public Callback2<Object, ILayer	> onEachFeature;
	public Callback2<Object, ILayer	> filter;
	public Callback1<Array<Object>> coordsToLatLng;
}
