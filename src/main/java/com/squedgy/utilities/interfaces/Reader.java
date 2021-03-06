
package com.squedgy.utilities.interfaces;

import java.io.IOException;

/**
 * This interface is designed to allow for a
 * simple and flexible reader system when combined with the Formatter interface
 * 
 * @author Squedgy
 * @version 1.0
 * @param <ReadType>
 * @param <WriteType>
 * @since 1.0
 */
public interface Reader <WriteType, ReadType>{


	/**
	 *Accepts a &lt;ReadType&gt; and creates a &lt;WriteType&gt; depending on circumstance this could be something external
	 *That doesn't actually change return anything
	 *@return a list of &lt;WriteType&gt; read from somewhere or something
	 */
	public abstract WriteType read(ReadType toRead) throws IOException;

}
