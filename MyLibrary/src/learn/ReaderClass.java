/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class ReaderClass {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    JOptionPane op =null;
    JDialog dia = null;
    public boolean readReader(String reader){
    try {
      // this will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // setup the connection with the DB.
      connect = DriverManager
          .getConnection("jdbc:mysql://localhost/library?"
              + "user=name&password=password");

      // statements allow to issue SQL queries to the database
      statement = connect.createStatement();

        preparedStatement = connect.prepareStatement("SELECT * FROM reader WHERE reader_id = ?");
        preparedStatement.setString(1, reader);
        resultSet = preparedStatement.executeQuery();
      // resultSet gets the result of the SQL query
        if(resultSet.next())
            return true;
        else
            return false;     
    } catch (Exception e) {
      op.setMessage(e.getMessage());
      op.setMessageType(0);
      dia = op.createDialog("Error");
      dia.setVisible(true);
    } 
    return false;
  }

  // you need to close all three to make sure
  private void close() {
      try{
    resultSet.close();
    statement.close();
    connect.close();
      }
      catch(Exception e)
      {
          
      }
  }
}
