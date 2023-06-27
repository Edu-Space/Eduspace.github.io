import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class Registerdao {
 private String dburl = "jdbc:mysql://localhost:3306/userdb";
 private String dbuname = "root";
 private String dbpassword = "";
 private String dbdriver = "com.mysql.jdbc.Driver";
 
 public void loadDriver(String dbDriver)
 {
 try {
 Class.forName(dbDriver);
 } catch (ClassNotFoundException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 }
 public Connection getConnection() {
 Connection con = null;
 try {
 con = DriverManager.getConnection(dburl, dbuname, dbpassword);
 } catch (SQLException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 return con;
 }
 
 public String insert(Member member) {
 loadDriver(dbdriver);
 Connection con = getConnection();
 String sql = "insert into member values(?,?,?,?)";
 String result="Data Stored Successfully";
 try {
 PreparedStatement ps = con.prepareStatement(sql);
 ps.setString(1, member.getName());
 ps.setString(2, member.getEmail());
 ps.setString(3, member.getMobile());
 ps.setNString(4, member.getPassout());
 ps.executeUpdate();
 } catch (SQLException e) {
 // TODO Auto-generated catch block
 result="Data Not Entered Successfully";
 e.printStackTrace();
 }
 return result;
 
 }
}