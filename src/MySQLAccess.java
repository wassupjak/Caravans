import java.sql.*;

import javax.swing.JOptionPane;

public class MySQLAccess {

	public static Connection dbconnection = null;
	private Statement dbstatement = null;
	private ResultSet resultset = null;
	
	final public static String dbname = "adcaravans";
	
	public void connectToDB(String aServer, String aUsername, String aPassword) throws Exception {
		try {
			//load the database driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//setup the database connection
			dbconnection = DriverManager.getConnection("jdbc:mysql://" + aServer + "/"
					+ dbname + "?" + "useSSL=false", aUsername, aPassword);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "You can't do that", "ERROR", JOptionPane.INFORMATION_MESSAGE);
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
	
	public static void executeinsertStatement(String aStatement) {
		Statement VStatement = null;
				try {
					VStatement = dbconnection.createStatement();
					VStatement.execute(aStatement);
//					 ResultSet Results = VStatement.executeQuery("select LAST_INSERT_ID();");
//					return Results.getString(1);
				} catch (Exception e) {
//					return "-1";
				}
	}
	
}
