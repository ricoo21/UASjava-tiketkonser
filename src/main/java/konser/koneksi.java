package konser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Rico.Handoyo 825190001
 * Muhammad.Farras 825190029
 * Jessen 825190040
 */
public class koneksi {
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException, ClassNotFoundException{
        try{
            String url ="jdbc:mysql://localhost:3306/exercise";
            String user ="root";
            String pass ="";

            Class.forName("com.mysql.jdbc.Driver");
            MySQLConfig = DriverManager.getConnection(url, user, pass);

        }catch(SQLException e){
            System.out.println("koneksi ke database gagal" + e.getMessage());
        }
        return MySQLConfig;
    }
}