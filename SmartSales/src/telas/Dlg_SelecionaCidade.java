package telas;

import DAO.CidadeDAO;
import apoio.HibernateUtil;
import apoio.Pesquisas;
import entidades.Cidade;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Dlg_SelecionaCidade extends javax.swing.JDialog {

    Tela_CadastroCliente CadCli;

    public Dlg_SelecionaCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Dlg_SelecionaCidade(java.awt.Frame parent, boolean modal, Tela_CadastroCliente x) {
        super(parent, modal);
        initComponents();
        CidadeDAO.pesquisar(tabelaCidade, campoPesquisa.getText().toUpperCase());
        this.setTitle("Seleciona Cidade");
        this.CadCli = x;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selecionar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCidade = new javax.swing.JTable();
        campoPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Selecionar1 = new javax.swing.JButton();
        sair1 = new javax.swing.JButton();

        Selecionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Selecionar.setText("Selecionar");

        sair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sair.setText("Sair");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCidade);

        campoPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesquisa:");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Selecionar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Selecionar1.setText("Selecionar");
        Selecionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selecionar1ActionPerformed(evt);
            }
        });

        sair1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sair1.setText("Sair");
        sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Selecionar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selecionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        CidadeDAO.pesquisar(tabelaCidade, campoPesquisa.getText().toUpperCase());
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_sair1ActionPerformed

    private void Selecionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selecionar1ActionPerformed
        String codigos = String.valueOf(tabelaCidade.getValueAt(tabelaCidade.getSelectedRow(), 0));
        Session sessao = null;
        sessao = HibernateUtil.getSessionFactory().openSession();

        Transaction transacao = sessao.beginTransaction();
        Cidade x = (Cidade) sessao.get(Cidade.class, Integer.parseInt(codigos));

        CadCli.DefinirValorCidade(x);
        this.dispose();
    }//GEN-LAST:event_Selecionar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dlg_SelecionaCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dlg_SelecionaCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dlg_SelecionaCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dlg_SelecionaCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dlg_SelecionaCidade dialog = new Dlg_SelecionaCidade(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Selecionar;
    private javax.swing.JButton Selecionar1;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sair;
    private javax.swing.JButton sair1;
    private javax.swing.JTable tabelaCidade;
    // End of variables declaration//GEN-END:variables
}
