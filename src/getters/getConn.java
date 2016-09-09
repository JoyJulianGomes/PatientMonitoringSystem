package getters;

import java.sql.Connection;
import java.sql.DriverManager;


public class getConn {
	
	public static Connection c;
	
	public static Connection getDBConnection(){
        if(c==null){
            //No connection exist so, required to create the conection
            try {
                //STEP 1: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                //STEP 3: Open a connection
                c = DriverManager.getConnection("jdbc:mysql://localhost/javaproject", "root", "");
            }catch(Exception ex){
                System.out.println("Failed to get DBConn:: "+ex.getMessage());
            }

            
            return c;
        }
        else
            return c;
    }

}
