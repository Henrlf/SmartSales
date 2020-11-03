package telas;

import DAO.GenericoDAO;
import entidades.Funcionario;

public class Tela_Funcionarios extends javax.swing.JFrame {

    public Tela_Funcionarios() {
        initComponents();
        GenericoDAO.pesquisa(tabFuncionarios, campoPesquisa.getText(), "Funcionario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabFuncionarios = new javax.swing.JTable();
        btCancelar = new javax.swing.JButton();
        btMetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesquisa:");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        campoPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });

        tabFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "CPF", "Email", "Login", "Cargo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabFuncionarios);
        if (tabFuncionarios.getColumnModel().getColumnCount() > 0) {
            tabFuncionarios.getColumnModel().getColumn(0).setMinWidth(40);
            tabFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabFuncionarios.getColumnModel().getColumn(0).setMaxWidth(40);
            tabFuncionarios.getColumnModel().getColumn(2).setMinWidth(140);
            tabFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(140);
            tabFuncionarios.getColumnModel().getColumn(2).setMaxWidth(140);
            tabFuncionarios.getColumnModel().getColumn(4).setMinWidth(150);
            tabFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabFuncionarios.getColumnModel().getColumn(4).setMaxWidth(150);
            tabFuncionarios.getColumnModel().getColumn(5).setMinWidth(150);
            tabFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabFuncionarios.getColumnModel().getColumn(5).setMaxWidth(150);
            tabFuncionarios.getColumnModel().getColumn(6).setMinWidth(50);
            tabFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(50);
            tabFuncionarios.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        btCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btMetas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btMetas.setText("Metas");
        btMetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPesquisa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btMetas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMetas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        GenericoDAO.pesquisa(tabFuncionarios, campoPesquisa.getText().toUpperCase(), "Funcionario");
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void btMetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMetasActionPerformed
        String idString = String.valueOf(tabFuncionarios.getValueAt(tabFuncionarios.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);
        Funcionario funcionario = (Funcionario)GenericoDAO.getObjectBanco(id, Funcionario.class);
        Tela_GerenciamentoMetas tgm = new Tela_GerenciamentoMetas(funcionario);
        tgm.setLocationRelativeTo(this);
        tgm.setVisible(true);
    }//GEN-LAST:event_btMetasActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Tela_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btMetas;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabFuncionarios;
    // End of variables declaration//GEN-END:variables
}
