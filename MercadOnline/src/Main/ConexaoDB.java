package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

		public Connection conn = null;

		  private String hostName = null;
		  private String userName = null;
		  private String password = null;
		  private String url = null;
		  private String jdbcDriver = null;
		  private String dataBaseName = null;
		  private String dataBasePrefix = null;
		  private String dabaBasePort = null;

		  public ConexaoDB() {
		    jdbcDriver = "org.gjt.mm.mysql.Driver";
		    hostName = "127.0.0.1";
		    userName = "root";
		    password = "MERCADON";    
		    dataBaseName = "MercadonDB";
		    dataBasePrefix = "jdbc:mysql://";
		    dabaBasePort = "3306";
		    url = dataBasePrefix + hostName + ":"+dabaBasePort+"/" + dataBaseName + "?useUnicode=true&characterEncoding=utf8";
		  }

		  public Connection getConnection() {
		    try {
		      if (conn == null) {
		        Class.forName(jdbcDriver);
		        conn = DriverManager.getConnection(url, userName, password);
		      } else if (conn.isClosed()) {
		        conn = null;
		        return getConnection();
		      }
		    } catch (ClassNotFoundException e) {
		      e.printStackTrace();
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		    return conn;
		  }

		  /**
		   * Fecha a conexão com BD.
		   *
		   */
		  public void closeConnection() {
		    if (conn != null) {
		      try {
		        conn.close();
		      } catch (SQLException e) {
		        e.printStackTrace();
		      }
		    }
		  }
	}

