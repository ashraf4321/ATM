
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Sec {
    
    private final String user="root";
    private final String pass="";
    private final String add="jdbc:mysql://localhost/atm";
    
    public Connection connect() throws SQLException{
        return DriverManager.getConnection(add,user,pass);
    }
    
}
