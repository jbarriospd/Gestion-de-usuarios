package com.aprender;

import com.aprender.conexion.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] xxx) {
        new Inicio();
    }

    public Inicio() {
        System.out.println("Bienvenido  mi sistema");
        menu();
    }
    String D;
    String PN;
    String SN;
    String PA;
    String SA;
    String C;
    String U;
    String DR;
    String UR;
    String CR;
    String R;
    String ID;
    String E;
    String DI;
    String T;
    String ND;
    String NPN;
    String NSN;
    String NPA;
    String NSA;
    String NC;
    String NU;
    String DN;
    String ED;
    String EDC;
    String EPN;
    String ESN;
    String EPA;
    String ESA;
    String ECL;
    String EUS;
    String EID;
    String ELE;
    String ELD;
    String ETL;
    String ELDC;
    String EMU;
    String EMCL;
    String EMR;

    public void menu() {
        Scanner s = new Scanner(System.in);
        System.out.println("1. para gestion de usuarios ");
        System.out.println("2. para contactos ");
        System.out.println("3. roles ");
        System.out.println("4. ventanas ");
        System.out.println("0. para salir");
        int op = s.nextInt();
        switch (op) {
            case 0:
                System.exit(0);
                break;
            case 1:
                gestionUsuario();
                break;
            case 2:
                contactos();
                break;
            case 3:
                rol();
                break;
            case 4:
                new Ventanas();
                break;

            default:
                System.out.println("El valor digitado no corresponde a ninguno del menu");
                menu();
                gestionUsuario();
                contactos();
                rol();
        }

    }

    public void gestionUsuario() {
        Scanner s = new Scanner(System.in);
        System.out.println("Gestion Usuarios");
        System.out.println("1. para crear usuarios ");
        System.out.println("2. para actualizar ");
        System.out.println("3. consultar ");
        System.out.println("4. para eliminar ");
        System.out.println("5. para volver ");
        System.out.println("0. para salir ");
        int og = s.nextInt();
        switch (og) {
            case 0:
                System.exit(0);
                break;
            case 1:
                registroUsuario();
                break;
            case 2:
                ActualizarUsuario();
                break;
            case 3:
                Conexion conexion = new Conexion();
                ResultSet r = conexion.consultas("select*from usuario");
               try { while (r.next()) {
                   System.out.println("el usuario"+""+ r.getString(1)+""+r.getString(2)+""+r.getString(3)+""+r.getString(4)+""+r.getString(5)+""+r.getString(6)+"");
                   System.out.println("");
                }
        }catch (SQLException ex) {
        }
                conexion.cerrarConexion();
                break;
            case 4:
                eliminarUsuario();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("El valor digitado no corresponde a ninguno del menu");
        }
        gestionUsuario();
    }

    private void eliminarUsuario() {
            Scanner s = new Scanner(System.in);
            System.out.println("eliminar documento");
            EDC=s.nextLine();
            System.out.println("eliminar primer nombre");
            EPN=s.nextLine();
            System.out.println("eliminar segundo nombre");
            ESN=s.nextLine();
            System.out.println("eliminar primer apellido");
            EPA=s.nextLine();
            System.out.println("eliminar segundo apellido");
            ESA=s.nextLine();
            System.out.println("eliminar su clave");
            ECL=s.nextLine();
            System.out.println("eliminar usuario");
            EUS=s.nextLine();
            Conexion conexion=new Conexion();
            conexion.CUD("delete from usuario where documento='"+EDC+"'");
            conexion.cerrarConexion();
    }

    private void ActualizarUsuario() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite anterior documento");
        ED=s.nextLine();
        System.out.println("Digite nuevo documento");
        ND=s.nextLine();
        System.out.println("Digite primer nombre");
        NPN=s.nextLine();
        System.out.println("Digite segundo nombre");
        NSN=s.nextLine();
        System.out.println("Digite primer apellido");
        NPA=s.nextLine();
        System.out.println("Digite segundo apellido");
        NSA=s.nextLine();
        System.out.println("Digite su clave");
        NC=s.nextLine();
        System.out.println("Digite usuario");
        NU=s.nextLine();
        Conexion conexion=new Conexion();
        conexion.CUD("update usuario set documento='"+ ND +"', primer_nombre='"+ NPN +"', segundo_nombre='"+ NSN + "', primer_apellido='"+ NPA +"', segundo_apellido='"+ NSA +"', clave='"+ NC +"', usuario='"+ NU +"' where documento='"+ DN +"'");
        conexion.cerrarConexion();

    }

    private void registroUsuario() {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite documento");
        D=s.nextLine();
        System.out.println("Digite primer nombre");
        PN=s.nextLine();
        System.out.println("Digite segundo nombre");
        SN=s.nextLine();
        System.out.println("Digite primer apellido");
        PA=s.nextLine();
        System.out.println("Digite segundo apellido");
        SA=s.nextLine();
        System.out.println("Digite su clave");
        C=s.nextLine();
        System.out.println("Digite usuario");
        U=s.nextLine();
        Conexion conexion=new Conexion();
        conexion.CUD("insert into usuario values ('"+ D +"', '"+ PN +"', '"+ SN + "', '"+ PA +"', '"+ SA +"', '"+ C +"', '"+ U +"')");
        conexion.cerrarConexion();

    }

    public void contactos() {
        Scanner s = new Scanner(System.in);
        System.out.println("1. para crear contacto");
        System.out.println("2. para actualizar");
        System.out.println("3. para consultar ");
        System.out.println("4.  para eliminar ");
        System.out.println("5.  para volver ");
        System.out.println("0. para salir ");
        int co = s.nextInt();
        switch (co) {
            case 0:
                System.exit(0);
                break;
            case 1:
                registroContacto();

                break;
            case 2:
                break;
            case 3:
                Conexion conexion = new Conexion();
                ResultSet r = conexion.consultas("select*from usuario");
                try { while (r.next()) {
                    System.out.println("el usuario"+""+ r.getString(1)+""+r.getString(2)+""+r.getString(3)+""+r.getString(4)+"");
                    System.out.println("");
                }
                }catch (SQLException ex) {
                }
                conexion.cerrarConexion();
                break;
            case 4:
                eliminarcontacto();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("El valor digitado no corresponde a ninguno del menu");


        }
        contactos();
    }

    private void eliminarcontacto() {
        Scanner s = new Scanner(System.in);
        System.out.println("eliminar id");
        EID=s.nextLine();
        System.out.println("eliminar email");
        ELE=s.nextLine();
        System.out.println("eliminar direccion");
        ELD=s.nextLine();
        System.out.println("elimiar telefono");
        ETL=s.nextLine();
        Conexion conexion=new Conexion();
        conexion.CUD("delete from contacto where id='"+EID+"'");
        conexion.cerrarConexion();

    }

    private void registroContacto() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite id");
        ID=s.nextLine();
        System.out.println("Digite email");
        E=s.nextLine();
        System.out.println("Digite direccion");
        DI=s.nextLine();
        System.out.println("Digite telefono");
        T=s.nextLine();
        Conexion conexion=new Conexion();
        conexion.CUD("insert into contactos values ('"+ ID +"', '"+ E +"', '"+ DI + "', '"+ T +"')");
        conexion.cerrarConexion();


    }

    public void rol() {
        Scanner s = new Scanner(System.in);

        System.out.println("1. para crear rol ");
        System.out.println("2. para actualizar ");
        System.out.println("3. para consultar ");
        System.out.println("4. para eliminar");
        System.out.println("5.2 para volver ");
        System.out.println("0. para salir ");
        int ro = s.nextInt();
        switch (ro) {
            case 0:
                System.exit(0);
                break;
            case 1:
                registroRol();
                break;
            case 2:
                break;
            case 3:
                Conexion conexion = new Conexion();
                ResultSet r = conexion.consultas("select*from usuario");
                try { while (r.next()) {
                    System.out.println("el usuario"+""+ r.getString(1)+""+r.getString(2)+""+r.getString(3)+""+r.getString(4)+"");
                    System.out.println("");
                }
                }catch (SQLException ex) {
                }
                conexion.cerrarConexion();
                break;
            case 4:
                eliminarrol();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("El valor digitado no corresponde a ninguno del menu");

        }
        rol();
    }

    private void eliminarrol() {
        Scanner s = new Scanner(System.in);
        System.out.println("eliminar documento");
        ELDC=s.nextLine();
        System.out.println("eliminar usuario");
        EMU=s.nextLine();
        System.out.println("eliminar clave");
        EMCL=s.nextLine();
        System.out.println("eliminar rol");
        EMR=s.nextLine();
        Conexion conexion=new Conexion();
        conexion.CUD("delete from rol where documento='"+ELDC+"'");
        conexion.cerrarConexion();
    }

    private void registroRol() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite documentO");
        DR=s.nextLine();
        System.out.println("Digite usuario");
        UR=s.nextLine();
        System.out.println("Digite clave");
        CR=s.nextLine();
        System.out.println("Digite rol");
        R=s.nextLine();
        Conexion conexion=new Conexion();
        conexion.CUD("insert into rol values ('"+ DR +"', '"+ UR +"', '"+ CR + "', '"+ R +"')");
        conexion.cerrarConexion();


    }
}

