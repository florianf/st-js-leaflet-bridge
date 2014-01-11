package org.stjs.javascript.leaflet;

import java.rmi.registry.LocateRegistry;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;

@STJSBridge()
@Namespace(LeafletNamespace.Leaflet)
public class Map extends EventEmitter {
	public Map(Element element, MapOptions options) {
		
	}
	
	public Map(String element, MapOptions options) {
		
	}
	
	public native Map setView(LatLng center);
	public native Map setView(LatLng center, int zoom);
	public native Map setView(LatLng center, ZoomPanOptions options);
	
	public native Map zoomIn(int delta);
	public native Map zoomIn(int delta, ZoomOptions options);

	public native Map zoomOut(int delta);
	public native Map zoomOut(int delta, ZoomOptions options);
	
	public native Map setZoom(int zoom);
	
	public native Map setZoomAround(LatLng latLng, int zoom);
	public native Map setZoomAround(LatLng latLng, int zoom, ZoomOptions options);
	
	public native Map fitBounds(LatLngBounds bounds);
	public native Map fitBounds(LatLngBounds bounds, FitBounds options);
	
	public native Map panTo(LatLng latLng);
	public native Map panTo(LatLng latLng, PanOptions options);
	
	public native Map panInsideBounds(LatLngBounds bounds);
	public native Map panInsideBounds(LatLngBounds bounds, PanOptions options);
	
	public native Map panBy(Point point);
	public native Map panBy(Point point, PanOptions options);
	
	public native Map invalidateSize();
	public native Map invalidateSize(boolean animate);
	public native Map invalidateSize(ZoomPanOptions options);
	
	public native Map setMaxBounds(LatLngBounds bounds);
	
	public native Map locate(LocateOptions options);
	
	public native Map stopLocate();
	
	public native Map remove();
	
	public native LatLng getCenter();
	
	public native int getZoom();
	
	public native int getMinZoom();
	
	public native int getMaxZoom();
	
	public native LatLngBounds getBounds();
	
	public native int getBoundsZoom(LatLngBounds bounds);
	public native int getBoundsZoom(LatLngBounds bounds, boolean inside);
	
	public native Point getSize();
	
	public native Bounds getPixelBounds();
	
	public native Point getPixelOrigin();
	
	public native Map addLayer(ILayer layer);
	public native Map addLayer(ILayer layer, boolean insertAtTheBottom);
	
	public native Map removeLayer(ILayer layer);
	
	public native boolean hasLayer(ILayer layer);
	
	public native Map openPopup(Popup popup);
	
	public native Map openPopup(String html, Element el, LatLng latLng, PopupOptions options);
	
	public native Map closePopup(Popup popup);
	
	public native Map addControl(IControl control);
	
	public native Map removeControl(IControl control);
	
	public native Point latLngToLayerPoint(LatLng latLng);
	
	public native LatLng layerPointToLatLng(Point point);
	
	public native Point containerPointToLayerPoint(Point point);
	
	public native Point layerPointToContainerPoint(Point point);
	
	public native Point latLngToContainerPoint(LatLng latLng);
	
	public native LatLng containerPointToLatLng(Point point);
	
	public native Point project(LatLng latLng);
	public native Point project(LatLng latLng, int zoom);
	
	public native LatLng unproject(Point point);
	public native LatLng unproject(Point point, int zoom);
	
	public native Point mouseEventToContainerPoint(MouseEvent 	event);
	
	public native Point mouseEventToLayerPoint(MouseEvent event);
	
	public native LatLng mouseEventToLatLng(MouseEvent event);
	
	public native Element getContainer();
	
	public native MapPanes getPanes();
	
	public native Map whenReady(Callback0 callback);	
}
