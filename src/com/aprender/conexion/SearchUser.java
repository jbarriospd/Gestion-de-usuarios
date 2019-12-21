package com.aprender.conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchUser extends JInternalFrame {
    public SearchUser(){
        setBounds(0,0,800,600);
        setLayout(new BorderLayout());
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        JScrollPane s=new JScrollPane();
        add(panelUno(),BorderLayout.NORTH);
        s.setViewportView(tablauno());
        add(s,BorderLayout.CENTER);
        setVisible(true);

    }
 private JPanel panelUno(){
        JTextField txtdato=new JTextField(50);
        JButton btnBuscar=new JButton("Search");
        JPanel panel= new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(txtdato);
        panel.add(btnBuscar);
      btnBuscar.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              String sql="select* from usuario where documento like '%"+ txtdato.getText()+"%' or primer_nombre like '%"+ txtdato.getText()+"&' or segundo_nombre like '%"+ txtdato.getText()+"%' or primer_apellido like '%"+ txtdato.getText()+"%' or segundo_apellido like '%"+ txtdato.getText()+"%' or usuario '%"+ txtdato.getText()+"%' ";
              Conexion conexion= new Conexion();
              ResultSet r= conexion.consultas(sql);
              String[]filas =new String[6];
              try {
              while(r.next()) {
                  filas[0]=r.getString(1);
                  filas[1]=r.getString(2);
                  filas[2]=r.getString(3);
                  filas[3]=r.getString(4);
                  filas[4]=r.getString(5);
                  filas[5]=r.getString(6);
                  modelo.addRow(filas);
              }
              }catch (SQLException x) {
              }
              }

      });
        return panel;
 }
 DefaultTableModel modelo;
 private JTable tablauno(){
        String[]columnas={"Documento","Primer Nombre","Segundo Nombre","Primer Apellido","Segundo Apellido","Usuario"};
        modelo=new DefaultTableModel(null,columnas);
        JTable tabla=new JTable();
        tabla.setModel(modelo);
        return tabla;
 }
}
