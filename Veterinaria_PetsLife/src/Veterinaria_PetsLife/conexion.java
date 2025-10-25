package veterinaria_petslife;

import com.mysql.jdbc.Connection;
import static veterinaria_petslife.conexion.con;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class conexion {
    
    //Declaramos la conexión a mysql
    public static Connection con;
    //Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/veterinariapetslife?characterEncoding=utf8";
    
    public Connection conectar(){
        con = null;
        try {
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error" + e.toString());
        }
        return con;
    }

    void llenaCombo(String veterinario, String id_v, JComboBox<String> list_veterinario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
