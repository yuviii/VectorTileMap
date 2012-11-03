package org.osmdroid.overlays;

import org.oscim.core.GeoPoint;

/**
 * Interface for objects that need to handle map events thrown by a
 * MapEventsOverlay.
 * 
 * @see MapEventsOverlay
 * @author M.Kergall
 */
public interface MapEventsReceiver {

	/**
	 * @param p
	 *            the position where the event occurred.
	 * @return true if the event has been "consumed" and should not be handled
	 *         by other objects.
	 */
	boolean singleTapUpHelper(GeoPoint p);

	/**
	 * @param p
	 *            the position where the event occurred.
	 * @return true if the event has been "consumed" and should not be handled
	 *         by other objects.
	 */
	boolean longPressHelper(GeoPoint p);
}
