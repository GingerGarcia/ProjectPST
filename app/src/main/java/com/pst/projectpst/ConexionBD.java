package com.pst.projectpst;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionBD {
    private static final String  username = "343015";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String PASSWORD = "k-5EWpeTHzke-hr";
    private static final String nombreBD = "343015";
    private static final String conn_str = "jdbc:mysql://localhost/"+nombreBD;

    Connection conn;

    public ConexionBD(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(conn_str,username,PASSWORD);
            if(conn  != null)
                System.out.println("La conexion a la base de datos ha sido exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar: "+e.getMessage());
        }
    }

    public Connection getConexion(){
        return conn;
    }

    public void desconectar(){
        conn = null;
        if (conn == null){
            System.out.println("Conexion terminada");
        }
    }
}
