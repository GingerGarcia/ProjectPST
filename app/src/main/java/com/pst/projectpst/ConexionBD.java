package com.pst.projectpst;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionBD {

    //private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String NOMBRE_BD = "343015";
    private static final String USERNAME = "343015";
    private static final String PASSWORD = "k-5EWpeTHzke-hr";
    private static final String CONN_STR = "jdbc:mariadb://localhost:3306/"+ NOMBRE_BD;

    Connection conn;

    public ConexionBD(){
        conn = null;
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(CONN_STR,USERNAME,PASSWORD);
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

