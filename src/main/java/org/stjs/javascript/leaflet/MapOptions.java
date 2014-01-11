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
	
	//keyboard Navigation Options
	public boolean keyboard;
	public boolean keyboardPanOffset;
	public boolean keyboardZoomOffset;
	
	//Panning inertia options
	public boolean inertia;
	public double inertiaDeceleration;
	public double inertiaMaxSpeed;
	public int inertiaThreshold;
	
	//control options
	public boolean zoomControl;
	public boolean attributionControl;
	
	
	//animation options
	public boolean fadeAnimation;
	public boolean zoomAnimation;
	public int zoomAnimationThreshold;
	public boolean markerZoomAnimation;
}
