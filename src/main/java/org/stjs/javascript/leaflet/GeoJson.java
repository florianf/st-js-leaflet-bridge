package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class GeoJson extends FeatureGroup {
	public GeoJson(Object geoJson, GeoJsonOptions options) {
		super(null);
	}
	
	public native GeoJson addData(Object data);
	public native GeoJson setStyle(Function1<Object, String> style);
	public native GeoJson resetStyle(Path layer);
	
	public static native ILayer geometryToLayer(Object featureData);
	public static native ILayer geometryToLayer(Object featureData, Function1<Object, Object> pointToLayer);
	
	public static native Array<LatLng> coordsToLatlng(Array<Object> coords);
	public static native Array<LatLng> coordsToLatlng(Array<Object> coords, boolean reverse);
	
	public static native Array<LatLng> coordsToLatlngs(Array<Object> coords);
	public static native Array<LatLng> coordsToLatlngs(Array<Object> coords, int levelsDeep);
	public static native Array<LatLng> coordsToLatlngs(Array<Object> coords, int levelsDeep, boolean reverse);

}
