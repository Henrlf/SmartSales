/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.ConexaoBD;
import apoio.Formatacao;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author yNot
 */
public class Dlg_RelatorioCadastro extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_RelatorioCadastro
     */
    public Dlg_RelatorioCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboCadastro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Cadastros");

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Gerar Relatório");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Selecione o tipo de Cadastro:");

        comboCadastro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Cliente", "Funcionário", "Cidade", "Produto" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (!comboCadastro.getSelectedItem().toString().equals("Selecione")) {

            if (comboCadastro.getSelectedItem().toString().equals("Cliente")) {

                try {
                    // Compila o relatorio
                    JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/Relatorios/Cliente.jrxml"));
                    // Mapeia campos de parametros para o relatorio, mesmo que nao existam
                    Map parametros = new HashMap();

                    // Executa relatoio
                    JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

                    // Exibe resultado em video
                    JasperViewer.viewReport(impressao, false);

                    //dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
                }

            }
            if (comboCadastro.getSelectedItem().toString().equals("Funcionário")) {
                try {
                    // Compila o relatorio
                    JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/Relatorios/Funcionario.jrxml"));

                    // Mapeia campos de parametros para o relatorio, mesmo que nao existam
                    Map parametros = new HashMap();

                    // Executa relatoio
                    JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

                    // Exibe resultado em video
                    JasperViewer.viewReport(impressao, false);

                    //dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
                }
            }
            if (comboCadastro.getSelectedItem().toString().equals("Cidade")) {
                try {
                    // Compila o relatorio
                    JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/Relatorios/Cidade.jrxml"));

                    // Mapeia campos de parametros para o relatorio, mesmo que nao existam
                    Map parametros = new HashMap();

                    // Executa relatoio
                    JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

                    // Exibe resultado em video
                    JasperViewer.viewReport(impressao, false);

                    //dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
                }

            }
            if (comboCadastro.getSelectedItem().toString().equals("Produto")) {
                try {
                    // Compila o relatorio
                    JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/Relatorios/Produto.jrxml"));

                    // Mapeia campos de parametros para o relatorio, mesmo que nao existam
                    Map parametros = new HashMap();

                    // Executa relatoio
                    JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

                    // Exibe resultado em video
                    JasperViewer.viewReport(impressao, false);

                    //dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro Valido");
        }
        
          this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dlg_RelatorioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dlg_RelatorioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dlg_RelatorioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dlg_RelatorioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dlg_RelatorioCadastro dialog = new Dlg_RelatorioCadastro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
