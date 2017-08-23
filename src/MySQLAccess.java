import java.sql.*;

public class MySQLAccess {

	public static Connection dbconnection = null;
	private Statement dbstatement = null;
	private ResultSet resultset = null;
	
	final private String dbname = "adcaravans";
	
	public void connectToDB(String aServer, String aUsername, String aPassword) throws Exception {
		try {
			//load the database driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//setup the datbase connection
			dbconnection = DriverManager.getConnection("jdbc:mysql://" + aServer + "/"
					+ dbname + "?" + "useSSL=false", aUsername, aPassword);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void close() {
		try {
			if (resultset != null) {
				resultset.close();
			}
			if (dbstatement != null) {
				dbstatement.close();
			}
			if(dbconnection != null) {
				dbconnection.close();
			}
		} catch (Exception e) {
			
		}
	}
	
	public static ResultSet executeSelectStatement(String aStatement) {
		Statement VStatement = null;
				try {
					VStatement = dbconnection.createStatement();
					return VStatement.executeQuery(aStatement);
				} catch (Exception e) {
					return null;
				}
	}
	
	public static boolean executeinsertStatement(String aStatement) {
		Statement VStatement = null;
				try {
					VStatement = dbconnection.createStatement();
					return VStatement.execute(aStatement);
				} catch (Exception e) {
					return false;
				}
	}
	
}
