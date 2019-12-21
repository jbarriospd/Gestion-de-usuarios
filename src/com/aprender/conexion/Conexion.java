package com.aprender.conexion;

import java.sql.*;

public class Conexion {
 //variables
    private String usuario = "root";
    private String clave = "";
    private String baseDatos = "prueba666";
    private String server = "localhost";

    private Connection con;
    private Statement stm;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.con = DriverManager.getConnection("jdbc:mysql://" + this.server + ":3306/" + this.baseDatos, this.usuario, this.clave);
            this.stm = this.con.createStatement();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void cerrarConexion() {

        try

        {
            this.getCon().close();
            this.getStm().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet consultas (String query){
        ResultSet r=null;
        try {
            r=this.getStm().executeQuery(query);
            //Captura error
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }
    public boolean CUD(String query){
        boolean b=false;
        try {
            b=this.getStm().execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
            b=true;
        }
        return b;
    }
}
