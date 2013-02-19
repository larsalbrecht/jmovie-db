/**
 * 
 */
package com.lars_albrecht.general.objects.EventArrayList.event;

import java.util.EventListener;

/**
 * @author albrela
 * 
 */
public interface ArrayListListener extends EventListener {

	public void arrayListenerAdd(ArrayListEvent e);

	public void arrayListenerClear(ArrayListEvent e);

	public void arrayListenerRemove(ArrayListEvent e);

}
