package View;

import Controller.ContainerController;
import Model.Container;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;

public class view extends javax.swing.JFrame {

    private ContainerController con = new ContainerController();

    public view() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_MerContainer = new javax.swing.JTable();
        btn_sacar = new javax.swing.JButton();
        btn_inspeccionFisica = new javax.swing.JButton();
        btn_RevisionLicencia = new javax.swing.JButton();
        btn_Importacion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_MerNacionalizadas = new javax.swing.JTable();
        btn_RegistoMercancia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_MerContainer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Peso", "Altura", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_MerContainer.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_MerContainer);
        if (tbl_MerContainer.getColumnModel().getColumnCount() > 0) {
            tbl_MerContainer.getColumnModel().getColumn(0).setResizable(false);
            tbl_MerContainer.getColumnModel().getColumn(1).setResizable(false);
            tbl_MerContainer.getColumnModel().getColumn(2).setResizable(false);
            tbl_MerContainer.getColumnModel().getColumn(3).setResizable(false);
            tbl_MerContainer.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_sacar.setText("Sacar");
        btn_sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sacarActionPerformed(evt);
            }
        });

        btn_inspeccionFisica.setText("Inspeccion Fisica");
        btn_inspeccionFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inspeccionFisicaActionPerformed(evt);
            }
        });

        btn_RevisionLicencia.setText("Revision Licencia");
        btn_RevisionLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RevisionLicenciaActionPerformed(evt);
            }
        });

        btn_Importacion.setText("Importacion");
        btn_Importacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImportacionActionPerformed(evt);
            }
        });

        tbl_MerNacionalizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "FSalidaCont", "FInspeccFisica", "FRevisionLic", "FImportacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_MerNacionalizadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_MerNacionalizadas);
        if (tbl_MerNacionalizadas.getColumnModel().getColumnCount() > 0) {
            tbl_MerNacionalizadas.getColumnModel().getColumn(0).setResizable(false);
            tbl_MerNacionalizadas.getColumnModel().getColumn(2).setResizable(false);
            tbl_MerNacionalizadas.getColumnModel().getColumn(3).setResizable(false);
            tbl_MerNacionalizadas.getColumnModel().getColumn(4).setResizable(false);
            tbl_MerNacionalizadas.getColumnModel().getColumn(5).setResizable(false);
        }

        btn_RegistoMercancia.setText("Registro Mercancia");
        btn_RegistoMercancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistoMercanciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(btn_sacar))
                            .addComponent(btn_RegistoMercancia))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_inspeccionFisica)
                        .addGap(18, 18, 18)
                        .addComponent(btn_RevisionLicencia)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Importacion)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_inspeccionFisica)
                        .addComponent(btn_RevisionLicencia)
                        .addComponent(btn_Importacion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_sacar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_RegistoMercancia)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sacarActionPerformed
        try {
            con.Salida();
            ListarT();
        } catch (Exception e) {
            
        }

    }//GEN-LAST:event_btn_sacarActionPerformed

    private void btn_RegistoMercanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistoMercanciaActionPerformed
        con.create(new Container("A1", "Carro", "500kg", "3M", "Azul", "", "", "", ""));
        con.create(new Container("A2", "Carro", "700kg", "3M", "Verde", "", "", "", ""));
        con.create(new Container("A3", "Carro", "800kg", "3M", "Rojo", "", "", "", ""));
        con.create(new Container("A4", "Carro", "900kg", "3M", "Marron", "", "", "", ""));
        con.create(new Container("A5", "Carro", "500kg", "3M", "Plateado", "", "", "", ""));
        con.create(new Container("A6", "Carro", "200kg", "3M", "Amarillo", "", "", "", ""));
        con.create(new Container("A7", "Carro", "456kg", "3M", "Naranja", "", "", "", ""));
        con.create(new Container("A8", "Carro", "5418kg", "3M", "Verde", "", "", "", ""));
        con.create(new Container("A9", "Carro", "792kg", "3M", "Azul", "", "", "", ""));
        ListarT();
        btn_RegistoMercancia.setEnabled(false);
    }//GEN-LAST:event_btn_RegistoMercanciaActionPerformed

    private void btn_inspeccionFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inspeccionFisicaActionPerformed
        try {
            con.inspeccion();
            ListarT();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_inspeccionFisicaActionPerformed

    private void btn_RevisionLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RevisionLicenciaActionPerformed
        try {
            con.RevisionLicencia();
            ListarT();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_RevisionLicenciaActionPerformed

    private void btn_ImportacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImportacionActionPerformed
        try {
            con.Nacionalizada();
            ListarT();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_ImportacionActionPerformed

    public void ListarT() {
        listarStack((DefaultTableModel) tbl_MerContainer.getModel(), con.ReadMercancia());
        listarQueue((DefaultTableModel) tbl_MerNacionalizadas.getModel(), con.ReadInspeccion());
    }

    public void listarStack(DefaultTableModel tabla, Stack<String[]> lista) {
        tabla.setNumRows(0);
        lista.forEach(tabla::addRow);
    }

    public void listarQueue(DefaultTableModel tabla, ArrayList<String[]> lista) {
        tabla.setNumRows(0);
        lista.forEach(tabla::addRow);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Importacion;
    private javax.swing.JButton btn_RegistoMercancia;
    private javax.swing.JButton btn_RevisionLicencia;
    private javax.swing.JButton btn_inspeccionFisica;
    private javax.swing.JButton btn_sacar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_MerContainer;
    private javax.swing.JTable tbl_MerNacionalizadas;
    // End of variables declaration//GEN-END:variables
}
