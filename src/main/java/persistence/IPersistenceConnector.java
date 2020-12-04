package persistence;


import java.io.Serializable;
import java.util.ArrayList;
import core.move.IMove;
import core.type.IType;


public interface IPersistenceConnector extends Serializable{

	/**
	 * This method persists a type in the database
	 * @param typeName 
	 */
	public void persistType(String typeName);

	/**
	 * This method persists a move in the database
	 * @param moveName
	 * @param moveType 
	 */
	public void persistMove(String moveName, IType moveType);
	
	/**
	 * This method persists a pkmn in the database with his type-s and move-s
	 * @param pkmnName the name of the pkmn to persist
	 * @param types the list of types associated to the pkmn
	 * @param moves the list of moves associated to the pkmn
	 */
	public void persistPkmn(String pkmnName, ArrayList<IType> types, ArrayList<IMove> moves);

}

