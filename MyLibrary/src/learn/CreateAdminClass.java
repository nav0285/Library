package learn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CreateAdminClass {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    public void createadmin(String admin_id, String pwd) throws Exception {
    try {
      // this will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // setup the connection with the DB.
      connect = DriverManager
          .getConnection("jdbc:mysql://localhost/library?"
              + "user=name&password=password");

      // statements allow to issue SQL queries to the database
      statement = connect.createStatement();

        preparedStatement = connect.prepareStatement("insert into admin(admin_id,password)"
                + " values(?,?)");
        preparedStatement.setString(1, admin_id);
        preparedStatement.setString(2, hashing(pwd));
        preparedStatement.executeUpdate();
      // resultSet gets the result of the SQL query
         
      
    } catch (Exception e) {
      throw e;
    } finally {
      close();
    }
    }
    public boolean readAdmin(String user, String pass) throws Exception {
    try {
      // this will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // setup the connection with the DB.
      connect = DriverManager
          .getConnection("jdbc:mysql://localhost/library?"
              + "user=name&password=password");

      // statements allow to issue SQL queries to the database
      statement = connect.createStatement();

        preparedStatement = connect.prepareStatement("SELECT * FROM admin WHERE admin_id = ?"
                + "and password=?");
        preparedStatement.setString(1, user);
        preparedStatement.setString(2, hashing(pass));
        resultSet = preparedStatement.executeQuery();
      // resultSet gets the result of the SQL query
        if(resultSet.next())
            return true;
        else
            return false;     
      
    } catch (Exception e) {
      throw e;
    } finally {
      close();
    }
    }
    private void close() {
      try{
    statement.close();
    connect.close();
      }
      catch(Exception e)
      {
          
      }
  }
String hashing(String s){
        try{
            MessageDigest md;
            md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            String result = "";
            byte byteData[] = md.digest();
            for(int i=0;i<byteData.length; i++){
                result +=Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1);
             }
            return result;
           }
        catch(NoSuchAlgorithmException e){
            return null;
        }
    }
}
