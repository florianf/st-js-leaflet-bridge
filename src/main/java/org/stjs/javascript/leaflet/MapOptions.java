package org.stjs.javascript.leaflet;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@Namespace("L")
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
	
	//keyboard
	public boolean keyboard;
	public int keyboardPanOffset;
	public int keyboardZoomOffset;
	
	//Panning Inertia Options
	public boolean inertia;
	public int inertiaDeceleration;
	public int inertiaMaxSpeed;
	public int inertiaThreshold;
	
	//Control options
	public boolean zoomControl;
	public boolean attributionControl;
	
	//Animation options
	public boolean fadeAnimation;
	public boolean zoomAnimation;
	public int zoomAnimationThreshold;
	public boolean markerZoomAnimation;
}
