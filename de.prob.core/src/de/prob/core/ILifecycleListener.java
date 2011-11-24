/** 
 * (c) 2009 Lehrstuhl fuer Softwaretechnik und Programmiersprachen, 
 * Heinrich Heine Universitaet Duesseldorf
 * This software is licenced under EPL 1.0 (http://www.eclipse.org/org/documents/epl-v10.html) 
 * */

package de.prob.core;

public interface ILifecycleListener {

	/**
	 * A new machine was loaded, marks the start of an animation or model
	 * checking.
	 * 
	 * @param ressource
	 */
	public void reset();

}
