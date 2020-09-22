/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author yNot
 */
public class Tela_PrincipalFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form Tela_PrincipalFuncionario
     */
    public Tela_PrincipalFuncionario() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Criacao_metas = new javax.swing.JMenu();
        Gerenciamento_metas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Venda_produtos = new javax.swing.JMenuItem();
        Vizualiza_Vendas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Relatorio_Vendas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Pesquisa_Generico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Criacao_metas.setText("Metas");
        Criacao_metas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Gerenciamento_metas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Gerenciamento_metas.setText("Gereciamento de Metas");
        Criacao_metas.add(Gerenciamento_metas);

        jMenuBar1.add(Criacao_metas);

        jMenu1.setText("Venda");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Venda_produtos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Venda_produtos.setText("Venda");
        Venda_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Venda_produtosActionPerformed(evt);
            }
        });
        jMenu1.add(Venda_produtos);

        Vizualiza_Vendas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Vizualiza_Vendas.setText("Vizualizar Vendas");
        jMenu1.add(Vizualiza_Vendas);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Relatório");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Relatorio_Vendas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Relatorio_Vendas.setText("Vendas");
        jMenu3.add(Relatorio_Vendas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Pesquisar");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Pesquisa_Generico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pesquisa_Generico.setText("Generico");
        jMenu4.add(Pesquisa_Generico);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Venda_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Venda_produtosActionPerformed
        Tela_Venda tv = new Tela_Venda();
        tv.setVisible(true);
        tv.setLocationRelativeTo(null);
    }//GEN-LAST:event_Venda_produtosActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_PrincipalFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_PrincipalFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_PrincipalFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_PrincipalFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_PrincipalFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Criacao_metas;
    private javax.swing.JMenuItem Gerenciamento_metas;
    private javax.swing.JMenuItem Pesquisa_Generico;
    private javax.swing.JMenuItem Relatorio_Vendas;
    private javax.swing.JMenuItem Venda_produtos;
    private javax.swing.JMenuItem Vizualiza_Vendas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
