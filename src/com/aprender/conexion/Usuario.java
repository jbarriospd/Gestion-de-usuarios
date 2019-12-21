package com.aprender.conexion;

public class Usuario {
    long Documento;
    String Primer_Nombre;
    String Segungo_Nombre;
    String Primer_Apellido;
    String Segundo_Apellido;
    String Usuario;
    String Password;


    public long getDocumento() {
        return Documento;
    }

    public void setDocumento(long documento) {
        Documento = documento;
    }

    public String getPrimer_Nombre() {
        return Primer_Nombre;
    }

    public void setPrimer_Nombre(String primer_Nombre) {
        Primer_Nombre = primer_Nombre;
    }

    public String getSegungo_Nombre() {
        return Segungo_Nombre;
    }

    public void setSegungo_Nombre(String segungo_Nombre) {
        Segungo_Nombre = segungo_Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String segundo_Apellido) {
        Segundo_Apellido = segundo_Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}
