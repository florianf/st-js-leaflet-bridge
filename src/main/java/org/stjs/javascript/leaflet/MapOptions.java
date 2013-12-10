package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class MapOptions {
	//Map state options
	public LatLng center;
	public int zoom;
	public int minZoom;
	public int maxZoom;
	public LatLngBounds maxBounds;
	public ICRS crs;
	public Array<ILayer> layers;
	
	//Interaction option
	public boolean dragging;
	public boolean touchZoom;
	public boolean scrollWheelZoom;
	public boolean doubleClickZoom;
	public boolean boxZoom;
	public boolean tap;
	public boolean tapTolerance;
	public boolean trackResize;
	public boolean worldCopyJump;
	public boolean closePopupOnClick;
	public boolean bounceAtZoomLimits;
}
