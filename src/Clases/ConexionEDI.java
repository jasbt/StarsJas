package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionEDI{
    public static Connection GetConnection() {
    Connection conexion =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://SERVIDOR_6;databaseName=STRACK_EDI;user=sa;password=$uPer-t4ack#;";
            String url = "jdbc:sqlserver://LAPTOP-RJSEMK28\\YAZMIN;databaseName=STRACK_EDI;user=sa;password=jbtusa27;";
            conexion= DriverManager.getConnection(url);
        } catch (ClassNotFoundException ex) {
            System.out.println( "Error en la conexión con la BD "+ex.getMessage());
            //JOptionPane.showMessageDialog(null, ex, "Error en la conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        } catch(SQLException ex){
            //JOptionPane.showMessageDialog(null, ex, "Error en la conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            System.out.println( "Error en la conexión con la BD "+ex.getMessage());
            conexion=null;
        } catch(Exception ex) {
            //JOptionPane.showMessageDialog(null, ex, "Error en la conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            System.out.println( "Error en la conexión con la BD "+ex.getMessage());
            conexion=null;
        } finally{
            return conexion;
        }
    }
}