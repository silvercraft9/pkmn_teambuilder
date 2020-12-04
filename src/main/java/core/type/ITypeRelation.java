/**
 * 
 */
package core.type;

/**
 * @author ro6k4
 *
 */
public interface ITypeRelation {
	
	/**
	 * 
	 * @return the type of an offensive move used against the defensive type
	 */
	public IType getOffensiveType();
	
	/**
	 * 
	 * @return the type of a pkmn receiving damages from the offensive type
	 */
	public IType getDefensiveType();
	
	/**
	 * 
	 * @return the efficiency of the offensive move on the defensive pkmn
	 */
	public double getEfficiency();

}
