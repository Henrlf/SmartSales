package telas;

import DAO.GenericoDAO;
import apoio.Mascaras;
import entidades.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela_Venda extends javax.swing.JFrame {

    Cliente cliente;
    Produto produto;
    double total;

    public Tela_Venda() {
        initComponents();
        campoNomeFuncionario.setText(Tela_Principal.funcionarioLogado.getNome());
        campoCargoFuncionario.setText(Tela_Principal.funcionarioLogado.getCargo());
        Mascaras.formatarDecimal(campoPrecoTotal);
        DefaultTableModel modelo = (DefaultTableModel) tabProdPed.getModel();
        modelo.setNumRows(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        scrollbar1 = new java.awt.Scrollbar();
        jLabel8 = new javax.swing.JLabel();
        btFinalizar = new javax.swing.JButton();
        cancelar = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        campoCliente = new javax.swing.JTextField();
        btPesqCli = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btSelecionarProd = new javax.swing.JButton();
        campoProdudo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoQuantProd = new javax.swing.JTextField();
        btAddProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProdPed = new javax.swing.JTable();
        campoPrecoTotal = new javax.swing.JFormattedTextField();
        btRemoverProduto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ComboPagamento = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNomeFuncionario = new javax.swing.JTextField();
        campoCargoFuncionario = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Obrigatório \" * \"");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btFinalizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btFinalizar.setText("Finalizar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cliente*", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24))); // NOI18N

        campoCliente.setEditable(false);
        campoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btPesqCli.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btPesqCli.setText("Pesquisar");
        btPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesqCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoCliente)
                    .addComponent(btPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informações do Pedido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24))); // NOI18N

        btSelecionarProd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSelecionarProd.setText("Selecionar");
        btSelecionarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarProdActionPerformed(evt);
            }
        });

        campoProdudo.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Produtos*:");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quantidade*:");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btAddProd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAddProd.setText("Adicionar");
        btAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProdActionPerformed(evt);
            }
        });

        tabProdPed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabProdPed);
        if (tabProdPed.getColumnModel().getColumnCount() > 0) {
            tabProdPed.getColumnModel().getColumn(0).setMinWidth(40);
            tabProdPed.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabProdPed.getColumnModel().getColumn(0).setMaxWidth(40);
            tabProdPed.getColumnModel().getColumn(2).setMinWidth(100);
            tabProdPed.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabProdPed.getColumnModel().getColumn(2).setMaxWidth(100);
            tabProdPed.getColumnModel().getColumn(3).setMinWidth(75);
            tabProdPed.getColumnModel().getColumn(3).setPreferredWidth(75);
            tabProdPed.getColumnModel().getColumn(3).setMaxWidth(75);
        }

        campoPrecoTotal.setEditable(false);
        campoPrecoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btRemoverProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btRemoverProduto.setText("Remover Produto");
        btRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverProdutoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total:");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btRemoverProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoQuantProd, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(campoProdudo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSelecionarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSelecionarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoProdudo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoQuantProd)
                    .addComponent(btAddProd, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(campoPrecoTotal)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Pagamento*", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24))); // NOI18N

        ComboPagamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComboPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Dinheiro", "Cartão de Crédito", "Boleto" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Responsável", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome:");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cargo:");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        campoNomeFuncionario.setEditable(false);
        campoNomeFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campoNomeFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoCargoFuncionario.setEditable(false);
        campoCargoFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campoCargoFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeFuncionario)
                    .addComponent(campoCargoFuncionario))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCargoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesqCliActionPerformed
        Dlg_SelecionaCliente sf = new Dlg_SelecionaCliente(null, true, this);
        sf.setLocationRelativeTo(this);
        sf.setVisible(true);
    }//GEN-LAST:event_btPesqCliActionPerformed

    private void btAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProdActionPerformed
        if (campoQuantProd.getText().isEmpty() || campoProdudo.getText().isEmpty() || campoQuantProd.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.");
        } else {
            if (verificaPresenca(produto)) {
                int quant = 0;
                int lin = 0;
                for (int i = 0; i < tabProdPed.getRowCount(); i++) {
                    int id = Integer.parseInt(String.valueOf(tabProdPed.getValueAt(i, 0)));
                    if (produto.getId() == id) {
                        quant = Integer.parseInt(String.valueOf(tabProdPed.getValueAt(i, 3)));
                        lin = i;
                    }
                }
                Object[] obj = {produto.getId(), produto.getNome(), "R$ " + produto.getPreco(), (Integer.parseInt(campoQuantProd.getText()) + quant)};
                DefaultTableModel modelo = (DefaultTableModel) tabProdPed.getModel();
                modelo.removeRow(lin);
                modelo.addRow(obj);

                this.total += Double.parseDouble(campoQuantProd.getText()) * produto.getPreco();
                campoPrecoTotal.setText(String.valueOf(total));
                campoProdudo.setText("");
                campoQuantProd.setText("");

            } else {
                Object[] obj = {produto.getId(), produto.getNome(), "R$ " + produto.getPreco(), Integer.parseInt(campoQuantProd.getText())};
                DefaultTableModel modelo = (DefaultTableModel) tabProdPed.getModel();
                modelo.addRow(obj);
                this.total += Double.parseDouble(campoQuantProd.getText()) * produto.getPreco();
                campoPrecoTotal.setText(String.valueOf(total));
                campoProdudo.setText("");
                campoQuantProd.setText("");

            }
        }
    }//GEN-LAST:event_btAddProdActionPerformed

    private void btSelecionarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarProdActionPerformed
        Dlg_SelecionaProduto sp = new Dlg_SelecionaProduto(null, true, this);
        sp.setLocationRelativeTo(this);
        sp.setVisible(true);
    }//GEN-LAST:event_btSelecionarProdActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        if (campoCliente.getText().isEmpty() || ComboPagamento.getSelectedIndex() == 0 || tabProdPed.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios em branco!", "Aviso!", JOptionPane.WARNING_MESSAGE);
        } else {
            Pedido pedido = new Pedido();
            pedido.setCliente(cliente);
            pedido.setFuncionario(Tela_Principal.funcionarioLogado);
            pedido.setStaus("A");
            pedido.setTipo_pagamento(String.valueOf(ComboPagamento.getItemAt(ComboPagamento.getSelectedIndex())));
            pedido.setValor(total);
            if (GenericoDAO.cadastrar(pedido)) {
                Produtos_Pedido pp = new Produtos_Pedido();
                for (int i = 0; i < tabProdPed.getRowCount(); i++) {
                    Produto prod = (Produto) GenericoDAO.getObjectBanco(Integer.parseInt(String.valueOf(tabProdPed.getValueAt(i, 0))), Produto.class);
                    pedido = (Pedido) GenericoDAO.getObjectBanco(GenericoDAO.getLastId("Pedido"), Pedido.class);
                    pp.setPedido(pedido);
                    pp.setProduto(prod);
                    pp.setQuantidade(Integer.parseInt(String.valueOf(tabProdPed.getValueAt(i, 3))));
                    if (GenericoDAO.cadastrar(pp)) {
                        JOptionPane.showMessageDialog(null, "Pedido realizado com sucesso!");
                        this.dispose();
                    }
                }
            }
        }
        //  calculaTotal();
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void btRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverProdutoActionPerformed
        if (tabProdPed.getSelectedRowCount() != 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabProdPed.getModel();
            double v = Double.parseDouble(tabProdPed.getValueAt(tabProdPed.getSelectedRow(), 3).toString().replace("R$ ", ""));
            double b = Double.parseDouble(tabProdPed.getValueAt(tabProdPed.getSelectedRow(), 2).toString().replace("R$ ", ""));
            this.total -= v * b;
            campoPrecoTotal.setText(String.valueOf(total));
            modelo.removeRow(tabProdPed.getSelectedRow());
        }
    }//GEN-LAST:event_btRemoverProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Venda().setVisible(true);
            }
        });
    }

    public void DefinirCliente(Cliente c) {
        campoCliente.setText(c.getNome());
        this.cliente = c;
    }

    public void DefinirProduto(Produto p) {
        campoProdudo.setText(p.getNome());
        this.produto = p;
    }

    public void addProd() {

    }

    public boolean verificaPresenca(Produto prod) {
        boolean pas = false;
        for (int i = 0; i < tabProdPed.getRowCount(); i++) {
            int id = Integer.parseInt(String.valueOf(tabProdPed.getValueAt(i, 0)));
            if (produto.getId() == id) {
                pas = true;

            }
        }
        return pas;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPagamento;
    private javax.swing.JButton btAddProd;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btPesqCli;
    private javax.swing.JButton btRemoverProduto;
    private javax.swing.JButton btSelecionarProd;
    private javax.swing.JTextField campoCargoFuncionario;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextField campoNomeFuncionario;
    private javax.swing.JFormattedTextField campoPrecoTotal;
    private javax.swing.JTextField campoProdudo;
    private javax.swing.JTextField campoQuantProd;
    private javax.swing.JToggleButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JTable tabProdPed;
    // End of variables declaration//GEN-END:variables
}
