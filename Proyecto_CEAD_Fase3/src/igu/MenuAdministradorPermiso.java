package igu;

import igu.ListadoSolicitudesPermisosExistentes;
import igu.MenuFuncionario;

public class MenuAdministradorPermiso extends javax.swing.JFrame {

    public MenuAdministradorPermiso() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        VerListado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ReporteSemana = new javax.swing.JLabel();
        ReporteMes = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ReporteSemestre = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        Funcionario = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("MENÚ DE ADMINISTRADOR");

        VerListado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        VerListado.setText("1. Ver listado de solicitudes existentes");
        VerListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerListadoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        ReporteSemana.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ReporteSemana.setText("3. Reporte de solicitud por semana");

        ReporteMes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ReporteMes.setText("3. Reporte de solicitud por mes");

        jLabel8.setText("Seleccione una de las opciones:");

        ReporteSemestre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ReporteSemestre.setText("4. Reporte de solicitud semestral");

        Salir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Salir.setText("6. Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        Funcionario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Funcionario.setText("5. Funcionarios");
        Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FuncionarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Funcionario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ReporteMes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReporteSemana, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VerListado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReporteSemestre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Salir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 53, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(VerListado)
                .addGap(18, 18, 18)
                .addComponent(ReporteSemana)
                .addGap(18, 18, 18)
                .addComponent(ReporteMes)
                .addGap(18, 18, 18)
                .addComponent(ReporteSemestre)
                .addGap(18, 18, 18)
                .addComponent(Funcionario)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerListadoMouseClicked
        ListadoSolicitudesPermisosExistentes List = new ListadoSolicitudesPermisosExistentes();
        List.setVisible(true);
        List.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_VerListadoMouseClicked

    private void FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FuncionarioMouseClicked
        MenuFuncionario Funcionario = new MenuFuncionario();
        Funcionario.setVisible(true);
        Funcionario.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_FuncionarioMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        Login Bienvenido = new Login();
        Bienvenido.setVisible(true);
        Bienvenido.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_SalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Funcionario;
    private javax.swing.JLabel ReporteMes;
    private javax.swing.JLabel ReporteSemana;
    private javax.swing.JLabel ReporteSemestre;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel VerListado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
