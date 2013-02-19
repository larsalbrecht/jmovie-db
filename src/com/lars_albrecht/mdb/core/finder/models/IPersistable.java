/**
 * 
 */
package com.lars_albrecht.mdb.core.finder.models;

import java.util.HashMap;

/**
 * @author albrela
 * 
 */
public interface IPersistable {

	Object fromHashMap(final HashMap<String, Object> map);

	HashMap<String, Object> toHashMap();

}
