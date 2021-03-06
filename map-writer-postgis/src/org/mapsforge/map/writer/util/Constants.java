/*
 * Copyright 2010, 2011, 2012 mapsforge.org
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.mapsforge.map.writer.util;

/**
 * Defines some constants.
 * 
 * @author bross
 */
public final class Constants {

	private Constants() {
		throw new IllegalStateException();
	}

	/**
	 * The name of the property that refers to the version of the map file specification.
	 */
	public static final String PROPERTY_NAME_FILE_SPECIFICATION_VERSION = "mapfile.specification.version";
	/**
	 * The name of the property that refers to the version of the map file writer.
	 */
	public static final String PROPERTY_NAME_WRITER_VERSION = "mapfile.writer.version";

	/**
	 * The name of the map file writer.
	 */
	public static final String CREATOR_NAME = "mapsforge-map-writer";

	/**
	 * The default size of a tile in pixel.
	 */
	public static final int DEFAULT_TILE_SIZE = 256;

	/**
	 * The maximum base zoom level for which we apply a simplification algorithm to filter way points.
	 */
	public static final int MAX_SIMPLIFICATION_BASE_ZOOM = 12;

	/**
	 * Default name for out file.
	 */
	public static final String DEFAULT_PARAM_OUTFILE = "mapsforge.map";
	/**
	 * Default data processor type.
	 */
	public static final String DEFAULT_PARAM_TYPE = "ram";
	/**
	 * Default bbox enlargement.
	 */
	public static final int DEFAULT_PARAM_BBOX_ENLARGEMENT = 20;
	/**
	 * Default coordinate encoding.
	 */
	public static final String DEFAULT_PARAM_ENCODING = "auto";
	/**
	 * Default simplification factor.
	 */
	public static final double DEFAULT_SIMPLIFICATION_FACTOR = 2.5;
}
