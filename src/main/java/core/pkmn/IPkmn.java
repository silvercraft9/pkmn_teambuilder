/**
 * 
 */
package core.pkmn;

import java.util.ArrayList;

import core.move.IMove;
import core.type.IType;

/**
 * @author ro6k4
 *
 */
public interface IPkmn {

	/**
	 * 
	 * @return the name of the pkmn
	 */
	public String getPkmnName();
	
	/**
	 * 
	 * @return the types of the pkmn
	 */
	public ArrayList<IType> getTypes();
	
	/**
	 * 
	 * @return the moves of the pkmn
	 */
	public ArrayList<IMove> getMoves();
}
