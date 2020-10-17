package telas;

import entidades.Funcionario;

public class Tela_Principal extends javax.swing.JFrame {

    public Tela_Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadatro = new javax.swing.JMenu();
        Cadastro_clientes = new javax.swing.JMenuItem();
        Cadastro_funcionario = new javax.swing.JMenuItem();
        Cadastro_Produtos = new javax.swing.JMenuItem();
        Cadastro_Cidades = new javax.swing.JMenuItem();
        Criacao_metas = new javax.swing.JMenu();
        Gerenciamento_metas = new javax.swing.JMenuItem();
        Criacao_Metas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Venda_produtos = new javax.swing.JMenuItem();
        Vizualiza_Vendas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Compra_Produtos = new javax.swing.JMenuItem();
        Vizualiza_Compras = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Relatorio_Vendas = new javax.swing.JMenuItem();
        Relatorio_Compras = new javax.swing.JMenuItem();
        Relatorio_Cadastros = new javax.swing.JMenuItem();
        Relatorio_Auditoria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Pesquisa_Generico = new javax.swing.JMenuItem();
        btLogs = new javax.swing.JMenuItem();
        btAuditorias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadatro.setText("Cadastros");
        Cadatro.setFocusable(false);
        Cadatro.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Cadastro_clientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cadastro_clientes.setText("Clientes");
        Cadastro_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_clientesActionPerformed(evt);
            }
        });
        Cadatro.add(Cadastro_clientes);

        Cadastro_funcionario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cadastro_funcionario.setText("Funcionário");
        Cadastro_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_funcionarioActionPerformed(evt);
            }
        });
        Cadatro.add(Cadastro_funcionario);

        Cadastro_Produtos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cadastro_Produtos.setText("Produtos");
        Cadastro_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_ProdutosActionPerformed(evt);
            }
        });
        Cadatro.add(Cadastro_Produtos);

        Cadastro_Cidades.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cadastro_Cidades.setText("Cidade");
        Cadastro_Cidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_CidadesActionPerformed(evt);
            }
        });
        Cadatro.add(Cadastro_Cidades);

        jMenuBar1.add(Cadatro);

        Criacao_metas.setText("Metas");
        Criacao_metas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Gerenciamento_metas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Gerenciamento_metas.setText("Gereciamento de Metas");
        Criacao_metas.add(Gerenciamento_metas);

        Criacao_Metas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Criacao_Metas.setText("Criaçao de metas");
        Criacao_Metas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Criacao_MetasActionPerformed(evt);
            }
        });
        Criacao_metas.add(Criacao_Metas);

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

        jMenu2.setText("Compra");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Compra_Produtos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Compra_Produtos.setText("Compra");
        Compra_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Compra_ProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(Compra_Produtos);

        Vizualiza_Compras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Vizualiza_Compras.setText("Vizualizar Compras");
        Vizualiza_Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vizualiza_ComprasActionPerformed(evt);
            }
        });
        jMenu2.add(Vizualiza_Compras);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Relatorio_Vendas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Relatorio_Vendas.setText("Vendas");
        Relatorio_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatorio_VendasActionPerformed(evt);
            }
        });
        jMenu3.add(Relatorio_Vendas);

        Relatorio_Compras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Relatorio_Compras.setText("Compras");
        Relatorio_Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatorio_ComprasActionPerformed(evt);
            }
        });
        jMenu3.add(Relatorio_Compras);

        Relatorio_Cadastros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Relatorio_Cadastros.setText("Cadastros");
        Relatorio_Cadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatorio_CadastrosActionPerformed(evt);
            }
        });
        jMenu3.add(Relatorio_Cadastros);

        Relatorio_Auditoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Relatorio_Auditoria.setText("Auditoria");
        Relatorio_Auditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatorio_AuditoriaActionPerformed(evt);
            }
        });
        jMenu3.add(Relatorio_Auditoria);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Pesquisar");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        Pesquisa_Generico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pesquisa_Generico.setText("Generico");
        jMenu4.add(Pesquisa_Generico);

        btLogs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btLogs.setText("Log's");
        btLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogsActionPerformed(evt);
            }
        });
        jMenu4.add(btLogs);

        btAuditorias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btAuditorias.setText("Auditorias");
        btAuditorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAuditoriasActionPerformed(evt);
            }
        });
        jMenu4.add(btAuditorias);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cadastro_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_funcionarioActionPerformed
        Tela_CadastroFuncionario cf = new Tela_CadastroFuncionario();
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
    }//GEN-LAST:event_Cadastro_funcionarioActionPerformed

    private void Cadastro_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_ProdutosActionPerformed
        Tela_CadastroProdutos cp = new Tela_CadastroProdutos();
        cp.setVisible(true);
        cp.setLocationRelativeTo(null);
    }//GEN-LAST:event_Cadastro_ProdutosActionPerformed

    private void Cadastro_CidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_CidadesActionPerformed
        Tela_CadastroCidade tcc = new Tela_CadastroCidade();
        tcc.setVisible(true);
        tcc.setLocationRelativeTo(null);
    }//GEN-LAST:event_Cadastro_CidadesActionPerformed

    private void Cadastro_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_clientesActionPerformed
        Tela_CadastroCliente cadcli = new Tela_CadastroCliente();
        cadcli.setVisible(true);
        cadcli.setLocationRelativeTo(null);
    }//GEN-LAST:event_Cadastro_clientesActionPerformed

    private void Venda_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Venda_produtosActionPerformed
        Tela_Venda tv = new Tela_Venda();
        tv.setVisible(true);
        tv.setLocationRelativeTo(null);
    }//GEN-LAST:event_Venda_produtosActionPerformed

    private void btAuditoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAuditoriasActionPerformed
        Tela_Auditoria ta = new Tela_Auditoria();
        ta.setVisible(true);
        ta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btAuditoriasActionPerformed

    private void btLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogsActionPerformed
        Tela_Logs tl = new Tela_Logs();
        tl.setVisible(true);
        tl.setLocationRelativeTo(null);
    }//GEN-LAST:event_btLogsActionPerformed

    private void Relatorio_ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatorio_ComprasActionPerformed
        Dlg_RelatorioCompra rc = new Dlg_RelatorioCompra(null, true);
        rc.setLocationRelativeTo(this);
        rc.setVisible(true);
    }//GEN-LAST:event_Relatorio_ComprasActionPerformed

    private void Vizualiza_ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vizualiza_ComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Vizualiza_ComprasActionPerformed

    private void Criacao_MetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Criacao_MetasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Criacao_MetasActionPerformed

    private void Compra_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Compra_ProdutosActionPerformed
        Tela_Compra tc = new Tela_Compra();
        tc.setVisible(true);
        tc.setLocationRelativeTo(null);
    }//GEN-LAST:event_Compra_ProdutosActionPerformed

    private void Relatorio_AuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatorio_AuditoriaActionPerformed
        Dlg_RelatorioAuditoria ra = new Dlg_RelatorioAuditoria(null, true);
        ra.setLocationRelativeTo(this);
        ra.setVisible(true);
    }//GEN-LAST:event_Relatorio_AuditoriaActionPerformed

    private void Relatorio_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatorio_VendasActionPerformed
        Dlg_RelatorioVenda rv = new Dlg_RelatorioVenda(null, true);
        rv.setLocationRelativeTo(this);
        rv.setVisible(true);
    }//GEN-LAST:event_Relatorio_VendasActionPerformed

    private void Relatorio_CadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatorio_CadastrosActionPerformed
        Dlg_RelatorioCadastro rc = new Dlg_RelatorioCadastro(null, true);
        rc.setLocationRelativeTo(this);
        rc.setVisible(true);
    }//GEN-LAST:event_Relatorio_CadastrosActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cadastro_Cidades;
    private javax.swing.JMenuItem Cadastro_Produtos;
    private javax.swing.JMenuItem Cadastro_clientes;
    private javax.swing.JMenuItem Cadastro_funcionario;
    private javax.swing.JMenu Cadatro;
    private javax.swing.JMenuItem Compra_Produtos;
    private javax.swing.JMenuItem Criacao_Metas;
    private javax.swing.JMenu Criacao_metas;
    private javax.swing.JMenuItem Gerenciamento_metas;
    private javax.swing.JMenuItem Pesquisa_Generico;
    private javax.swing.JMenuItem Relatorio_Auditoria;
    private javax.swing.JMenuItem Relatorio_Cadastros;
    private javax.swing.JMenuItem Relatorio_Compras;
    private javax.swing.JMenuItem Relatorio_Vendas;
    private javax.swing.JMenuItem Venda_produtos;
    private javax.swing.JMenuItem Vizualiza_Compras;
    private javax.swing.JMenuItem Vizualiza_Vendas;
    private javax.swing.JMenuItem btAuditorias;
    private javax.swing.JMenuItem btLogs;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
