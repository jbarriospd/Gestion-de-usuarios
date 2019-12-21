package com.aprender.conexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CrearVariosUsuario extends JInternalFrame {
    public CrearVariosUsuario(){
        setSize(300,400);
        setLayout(new GridLayout(9,2));
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        JLabel conteoUsario= new JLabel("La cantidad de usuarios es");
        JLabel cuentaUsuario=new JLabel("0");
        JLabel lbdocumento=new JLabel("Documento");
        JLabel lbprimer_nombre=new JLabel("Primer Nombre");
        JLabel lbsegundo_nombre=new JLabel("Segundo Nombre");
        JLabel lbprimer_apellido=new JLabel("Primer_Apellido");
        JLabel lbSeguno_Apellido=new JLabel("Segundo_apellido");
        JLabel lbUsuario=new JLabel("Usuario");
        JLabel lbpassword=new JLabel("Password");
        JTextField txtDocumento=new JTextField();
        JTextField txtPrimerNombre=new JTextField();
        JTextField txtSegundoNombre=new JTextField();
        JTextField txtPrimerApellido=new JTextField();
        JTextField txtSegundoApellido=new JTextField();
        JTextField txtUsuario=new JTextField();
        JPasswordField txtpassword=new JPasswordField();
        JButton btnGuardon=new JButton("Guardar");
        JButton btnGuardartodo= new JButton("Guardar Todo");
         add(conteoUsario);
         add(cuentaUsuario);
         add(lbdocumento);
        add(txtDocumento);
         add(lbprimer_nombre);
        add(txtPrimerNombre);
         add(lbsegundo_nombre);
        add(txtSegundoNombre);
         add(lbprimer_apellido);
        add(txtPrimerApellido);
         add(lbSeguno_Apellido);
        add(txtSegundoApellido);
         add(lbUsuario);
        add(txtUsuario);
         add(lbpassword);
        add(txtpassword);
         add(btnGuardon);
         add(btnGuardartodo);

        setVisible(true);
        ArrayList<Usuario> listaUsuario= new ArrayList<Usuario>();
        btnGuardon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  Usuario u= new Usuario();
                  Long d=Long.parseLong(txtDocumento.getText());
                  u.setDocumento(d);
                  u.setPrimer_Nombre(txtPrimerNombre.getText());
                  u.setSegungo_Nombre(txtSegundoNombre.getText());
                  u.setPrimer_Apellido(txtPrimerApellido.getText());
                  u.setSegundo_Apellido(txtSegundoApellido.getText());
                  u.setUsuario(txtUsuario.getText());
                  u.setPassword(txtpassword.getText());

                  listaUsuario.add(u);

                  txtDocumento.setText(null);
                  txtPrimerNombre.setText(null);
                  txtSegundoNombre.setText(null);
                  txtPrimerApellido.setText(null);
                  txtSegundoApellido.setText(null);
                  txtUsuario.setText(null);
                  txtpassword.setText(null);

                  conteoUsario.setText(listaUsuario.size()+"");
            }
        });
        btnGuardartodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<listaUsuario.size();i++){
                    Conexion conexion=new Conexion();
                    String sql="INSERT INTO usuario VALUES ('"+listaUsuario.get(i).getDocumento()+"','"+listaUsuario.get(i).getPrimer_Nombre()+"','"+listaUsuario.get(i).getSegungo_Nombre()+"','"+listaUsuario.get(i).getPrimer_Apellido()+"','"+listaUsuario.get(i).getSegundo_Apellido()+"','"+listaUsuario.get(i).getUsuario()+"','"+listaUsuario.get(i).getPassword()+"')";
                    conexion.CUD(sql);
                    conexion.cerrarConexion();
                }
            }
        });

    }

}
