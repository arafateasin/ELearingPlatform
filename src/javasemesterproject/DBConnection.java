package javasemesterproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    public Connection c;
    public Statement s;
    public DBConnection(){
        try{
            //Register JDBC Driver with Class's Static method
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ELearningSystem","root","S34SMOK315140710");
            s = c.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
            System.err.println(e);
        }
    }
    public void Close(){
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
