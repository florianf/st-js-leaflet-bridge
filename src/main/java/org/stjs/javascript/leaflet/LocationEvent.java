package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class LocationEvent extends Event {
	public LatLng latLng;
	public LatLngBounds bounds;
	public double accuracy;
	public double altitude;
	public double altitudeAccuracy;
	public double heading;
	public double speed;
	public long timestamp;
}
