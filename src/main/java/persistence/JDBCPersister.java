/**
 * 
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import core.move.IMove;
import core.type.IType;

/**
 * @author ro6k4
 *
 */
public class JDBCPersister implements IPersistenceConnector {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4226877034457561433L;
	private final Connection connection;
	private static final Logger logger = Logger.getLogger("JdbcPersister");

	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * 
	 */
	public JDBCPersister(String dbName, String dbHost, String dbUser, String dbPassword) throws SQLException, ClassNotFoundException {
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://" + dbHost + "/" + dbName;
		Class.forName(jdbcDriver);
		this.connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
	}

	public void persistType(String typeName) {
		// TODO Auto-generated method stub

	}

	public void persistMove(String moveName, IType moveType) {
		// TODO Auto-generated method stub

	}

	public void persistPkmn(String pkmnName, ArrayList<IType> types, ArrayList<IMove> moves) {
		// TODO Auto-generated method stub

	}

}
