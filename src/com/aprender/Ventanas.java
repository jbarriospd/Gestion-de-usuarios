package com.aprender;

import com.aprender.conexion.GestionUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanas {
    public Ventanas(){
        try { for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName()); //repositorios de swing
                break;
            }
        }
        } catch (ClassNotFoundException ex) { java.util.logging.Logger.getLogger(Ventanas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) { java.util.logging.Logger.getLogger(Ventanas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) { java.util.logging.Logger.getLogger(Ventanas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) { java.util.logging.Logger.getLogger(Ventanas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        JFrame menu=new JFrame("menu");
        menu.setBounds(0,0,200,400);
        menu.setDefaultCloseOperation(menu.DISPOSE_ON_CLOSE);
        menu.setLayout(new GridLayout(3,1));
        JButton btnGestionUsuario=new JButton("Gestion Usuario");
        JButton btnGestionContactos=new JButton("Gestion Contactos");
        JButton btnGestionRoles=new JButton("Gestion Roles");
        btnGestionUsuario.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent E){
                new GestionUsuario();
            }

        });
                menu.add(btnGestionContactos);
                menu.add(btnGestionUsuario);
                menu.add(btnGestionRoles);


        menu.setVisible(true);
    }
}

