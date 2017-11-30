/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc455_database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;


/**
 *
 * @author Karim
 */
public class Cosc455_Database {
    static final String userName="adambo1";//put your MySQL user name
    static final String password="Cosc*qwrt";//put your MySQL password
    private static Connection connection=null;
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        //Create login window
        Login login = new Login();
        login.setVisible(true);
        
        /*        
        Object newInstance;
        newInstance = Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection("jdbc:mysql://triton.towson.edu:3360/adambo1db", userName, password);// Please use your database name here
        PreparedStatement updateStaff;
        Statement queryStatement = connection.createStatement();
        updateStaff = null;
            String querys="select * from adambo1db.EMPLOYEE;";
            ResultSet results = queryStatement.executeQuery(querys);
            while(results.next())
            {
                System.out.print(results.getString("fName"));
                System.out.print("    ");
                System.out.print(results.getString("lName"));
                System.out.println();
            }   querys="UPDATE adambo1db.EMPLOYEE SET salary = 8802 ;";
            updateStaff = connection.prepareStatement(querys);
            updateStaff.executeUpdate();
            
        DatabaseLayout dl = new DatabaseLayout();
        dl.setVisible(true);
        
        // TODO code application logic here
*/
    }
    
}
