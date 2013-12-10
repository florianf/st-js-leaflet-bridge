package org.stjs.javascript.leaflet;

import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge()
@SyntheticType
public class PopupOptions {
	public int maxWidth;
	public int minWidth;
	public int maxHeight;
	public boolean autoPan;
	public boolean keepInView;
	public boolean closeButton;
	public Point offset;
	public Point autoPanPaddingTopLeft;
	public Point autoPanPaddingBottomRight;
	public Point autoPanPadding;
	public boolean zoomAnimation;
	public boolean closeOnClick;
}
