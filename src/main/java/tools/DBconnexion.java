package tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnexion {
    public String url="jdbc:mysql://localhost:3306/culturetripp";
    public  String login="root";
    public String pwd="";
    public  static DBconnexion instance;
    Connection cnx ;
    public DBconnexion(){
        try {
           cnx= DriverManager.getConnection(url, login, pwd);
            System.out.println("connexion etabli");
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    public Connection getCnx() {
        return cnx;
    }

    public static DBconnexion getInstance() {
        if(instance== null){
            instance=new DBconnexion();
        }
        return instance;
    }
}
