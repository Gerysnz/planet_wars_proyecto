package pw;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class oraclejava {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establecer conexión
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sys as sysdba", "P@ssw0rd");
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos Oracle!");

                // Crear una tabla
                stmt = conn.createStatement();
                String createTableSQL = "CREATE TABLE ejemplo (id INT PRIMARY KEY, nombre VARCHAR(50))";
                stmt.executeUpdate(createTableSQL);
                System.out.println("Tabla creada correctamente.");

                // Insertar datos de ejemplo
                stmt.executeUpdate("INSERT INTO ejemplo VALUES (1, 'Ejemplo 1')");
                stmt.executeUpdate("INSERT INTO ejemplo VALUES (2, 'Ejemplo 2')");
                System.out.println("Datos insertados correctamente.");

                // Consulta sencilla para verificar los datos insertados
                rs = stmt.executeQuery("SELECT * FROM ejemplo");
                System.out.println("ID\tNombre");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    System.out.println(id + "\t" + nombre);
                }
            } else {
                System.out.println("Fallo al conectar a la base de datos!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }}

