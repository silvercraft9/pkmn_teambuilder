/**
 * 
 */
package core.move;

import core.type.IType;

/**
 * @author ro6k4
 *
 */
public interface IMove {

	/**
	 * 
	 * @return the name of the move
	 */
	public String getMoveName();
	
	/**
	 * 
	 * @return the type of the move
	 */
	public IType getMoveType();
}
