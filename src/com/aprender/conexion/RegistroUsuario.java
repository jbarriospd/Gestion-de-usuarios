package com.aprender.conexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroUsuario extends JInternalFrame {
    public RegistroUsuario(){
        setBounds(0,0,300,400);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setLayout(new GridLayout(8,2));
        JLabel lDocumento=new JLabel("Documento");
        JLabel lPrimerNombre=new JLabel("Primer Nombre");
        JLabel lSegundoNombre=new JLabel("Segundo Nombre");
        JLabel lPrimerAprellido=new JLabel("Primer Apellido");
        JLabel lSegundoApellido=new JLabel("Segindo Apellido");
        JLabel lUsuario=new JLabel("Usuario");
        JLabel lClave=new JLabel("Clave");

        JTextField txtDocumento=new JTextField("Documento");
        JTextField txtPrimerNombre=new JTextField("Primer Nombre");
        JTextField txtSegundoNombre=new JTextField("Segundo Nombre");
        JTextField txtPrimerApellido=new JTextField("Primer Apellido");
        JTextField txtSegundoApellido=new JTextField("Segundo Apellido");
        JTextField txtUsuario=new JTextField("Usuario");
        JButton btnSave=new JButton("Save");
        JPasswordField txtPassword=new JPasswordField("Clave");

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conexion conexion=new Conexion();
                conexion.CUD("Insert into usuario values('"+txtDocumento.getText()+"','"+txtPrimerNombre.getText()+",'"+txtSegundoNombre.getText()+"'"+txtPrimerApellido.getText()+",'"+txtSegundoApellido.getText()+",'"+txtUsuario.getText()+",'"+txtPassword.getPassword());
                conexion.cerrarConexion();

            }
        });
        JButton btnCancel=new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        add(lDocumento);
        add(txtDocumento);
        add(lPrimerNombre);
        add(txtPrimerNombre);
        add(lSegundoNombre);
        add(txtSegundoNombre);
        add(lPrimerAprellido);
        add(txtPrimerApellido);
        add(lSegundoApellido);
        add(txtSegundoApellido);
        add(lUsuario);
        add(txtUsuario);
        add(lClave);
        add(txtPassword);
        add(btnSave);
        add(btnCancel);
        setVisible(true);
    }


}
