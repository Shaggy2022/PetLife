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
    private String tabla;
    
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

    public void llenaCombo(String tabla, String idColumna, String nombreColumna, JComboBox combo) {
    String sql = "SELECT " + idColumna + ", " + nombreColumna + " FROM " + tabla;
    Statement st;
    conexion con = new conexion();
    Connection conexion = con.conectar();
    try{
        st = conexion.createStatement();
        ResultSet rs = st.executeQuery(sql);
        combo.removeAllItems(); // opcional
        while(rs.next()){
            String item = rs.getString(idColumna) + " - " + rs.getString(nombreColumna);
            combo.addItem(item);
        }
    }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error" + e.toString());
        } 
    }
    

    public void llenarTablas(JComboBox combo) {
    String sql = "show tables";
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               String tabla = rs.getString(1); // Primera columna siempre es el nombre de la tabla
               System.out.println(tabla);
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error" + e.toString());
        } 
    }
}
