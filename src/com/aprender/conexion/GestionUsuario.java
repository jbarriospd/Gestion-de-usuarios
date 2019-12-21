package com.aprender.conexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class GestionUsuario extends JFrame{
        static JDesktopPane escritorio=new JDesktopPane();
        public GestionUsuario(){
            setBounds(0,0,800,600);
            setLayout(new BorderLayout());
            setJMenuBar(menuBarra());
            add(escritorio);
            add(escritorio,BorderLayout.CENTER);
            setVisible(true);
        }
        private JMenuBar menuBarra(){
            JMenuItem itemSave=new JMenuItem("save");
            JMenuItem itemOPen=new JMenuItem("open");
            JMenuItem itemExit=new JMenuItem("exit");
            JMenuItem itemCreateUser=new JMenuItem("create user");
            JMenuItem itemCrearVariosUsuario=new JMenuItem("create users");
            JMenuItem itemUpdateUser=new JMenuItem("update user");
            JMenuItem itemDeleteUser=new JMenuItem("delete user");
            JMenuItem itemSearchUser=new JMenuItem("search user");
            itemSave.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            itemOPen.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            itemExit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);

                }
            });
            itemCreateUser.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    escritorio.add(new RegistroUsuario());
                }
            });
            itemUpdateUser.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            itemDeleteUser.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            itemSearchUser.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
             escritorio.add(new SearchUser());
                }
            });
            itemCrearVariosUsuario.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                 escritorio.add(new CrearVariosUsuario());
                }
            });
            JMenu menuFile=new JMenu("fila");
            JMenu menuMUser=new JMenu("Manager User");
            menuFile.add(itemSave);
            menuFile.add(itemOPen);
            menuFile.add(itemExit);
            menuMUser.add(itemCreateUser);
            menuMUser.add(itemDeleteUser);
            menuMUser.add(itemUpdateUser);
            menuMUser.add(itemSearchUser);
            menuMUser.add(itemCrearVariosUsuario);
            JMenuBar barra=new JMenuBar();
            barra.add(menuFile);
            barra.add(menuMUser);
            return barra;

        }

    }

