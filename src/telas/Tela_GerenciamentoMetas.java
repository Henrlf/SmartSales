package telas;

import DAO.GenericoDAO;
import apoio.ComboItem;
import apoio.FormatacaoCombos;
import apoio.Mascaras;
import entidades.Ano;
import entidades.Funcionario;
import entidades.Metas;
import javax.swing.JOptionPane;

public class Tela_GerenciamentoMetas extends javax.swing.JFrame {

    private Funcionario funcionario;
    private Metas metas = new Metas();
    private Ano ano;

    public Tela_GerenciamentoMetas(Funcionario fun) {
        initComponents();
        Mascaras.formatarDecimal(campoJan);
        Mascaras.formatarDecimal(campoFev);
        Mascaras.formatarDecimal(campoMar);
        Mascaras.formatarDecimal(campoAbr);
        Mascaras.formatarDecimal(campoMai);
        Mascaras.formatarDecimal(campoJun);
        Mascaras.formatarDecimal(campoJul);
        Mascaras.formatarDecimal(campoAgo);
        Mascaras.formatarDecimal(campoSet);
        Mascaras.formatarDecimal(campoOut);
        Mascaras.formatarDecimal(campoNov);
        Mascaras.formatarDecimal(campoDez);
        FormatacaoCombos.popularComboAno(comboAno);
        funcionario = fun;
        campoCargo.setText(funcionario.getCargo());
        campoNome.setText(funcionario.getNome());
    }

    private Tela_GerenciamentoMetas() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoCargo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboAno = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoJan = new javax.swing.JFormattedTextField();
        campoAbr = new javax.swing.JFormattedTextField();
        campoJul = new javax.swing.JFormattedTextField();
        campoOut = new javax.swing.JFormattedTextField();
        campoFev = new javax.swing.JFormattedTextField();
        campoMai = new javax.swing.JFormattedTextField();
        campoAgo = new javax.swing.JFormattedTextField();
        campoNov = new javax.swing.JFormattedTextField();
        campoMar = new javax.swing.JFormattedTextField();
        campoJun = new javax.swing.JFormattedTextField();
        campoSet = new javax.swing.JFormattedTextField();
        campoDez = new javax.swing.JFormattedTextField();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAdAno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Funcionario:");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        campoNome.setEditable(false);
        campoNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cargo:");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        campoCargo.setEditable(false);
        campoCargo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoCargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ano:");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        comboAno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        comboAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Janeiro:");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Abril:");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Maio:");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Agosto:");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Março:");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Outubro:");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Junho:");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Novembro:");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Julho:");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Fevereiro:");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Setembro:");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Dezembro:");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        campoJan.setText("0,00");
        campoJan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoAbr.setText("0,00");
        campoAbr.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoJul.setText("0,00");
        campoJul.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoOut.setText("0,00");
        campoOut.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoFev.setText("0,00");
        campoFev.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoMai.setText("0,00");
        campoMai.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoAgo.setText("0,00");
        campoAgo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoNov.setText("0,00");
        campoNov.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoMar.setText("0,00");
        campoMar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoJun.setText("0,00");
        campoJun.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoSet.setText("0,00");
        campoSet.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoDez.setText("0,00");
        campoDez.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoOut, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoAbr)
                            .addComponent(campoJul)
                            .addComponent(campoJan, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoFev, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(campoMai)
                            .addComponent(campoAgo))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNov, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoMar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoJun))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDez, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoJan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoFev, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoMar, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoAbr)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoMai)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoJun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoJul)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoSet)
                        .addComponent(campoAgo)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNov, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoDez, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAdAno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAdAno.setText("Adicionar Ano Meta");
        btAdAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btAdAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboAno, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCargo)
                    .addComponent(btAdAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdAnoActionPerformed
        int lastId = GenericoDAO.getLastId("Ano");
        Ano ano = (Ano) GenericoDAO.getObjectBanco(lastId, Ano.class);
        int newAno = ano.getAno_numerico() + 1;
        ano = new Ano();
        ano.setAno_numerico(newAno);
        GenericoDAO.cadastrar(ano);
    }//GEN-LAST:event_btAdAnoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void comboAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnoActionPerformed
        if (comboAno.getSelectedIndex() >= 1) {
            ComboItem ci = (ComboItem) comboAno.getSelectedItem();
            ano = (Ano) GenericoDAO.getObjectBanco(ci.getCodigo(), Ano.class);
            if (GenericoDAO.getValidaMetas(ano, funcionario)) {
                int id = GenericoDAO.getMetas(ano, funcionario);
                metas = (Metas) GenericoDAO.getObjectBanco(id, Metas.class);
                if (metas.getJaneiro() != 0) {
                    campoJan.setText(String.valueOf(metas.getJaneiro()));
                }else{
                    campoJan.setText("0.00");
                }
                if (metas.getFevereiro() != 0) {
                    campoFev.setText(String.valueOf(metas.getFevereiro()));
                }else{
                    campoFev.setText("0.00");
                }
                if (metas.getMarco() != 0) {
                    campoMar.setText(String.valueOf(metas.getMarco()));
                }else{
                    campoMar.setText("0.00");
                }
                if (metas.getAbril() != 0) {
                    campoAbr.setText(String.valueOf(metas.getAbril()));
                }else{
                    campoAbr.setText("0.00");
                }
                if (metas.getMaio() != 0) {
                    campoMai.setText(String.valueOf(metas.getMaio()));
                }else{
                    campoMai.setText("0.00");
                }
                if (metas.getJunho() != 0) {
                    campoJun.setText(String.valueOf(metas.getJunho()));
                }else{
                    campoJun.setText("0.00");
                }
                if (metas.getJulho() != 0) {
                    campoJul.setText(String.valueOf(metas.getJulho()));
                }else{
                    campoJul.setText("0.00");
                }
                if (metas.getAgosto() != 0) {
                    campoAgo.setText(String.valueOf(metas.getAgosto()));
                }else{
                    campoAgo.setText("0.00");
                }
                if (metas.getSetembro() != 0) {
                    campoSet.setText(String.valueOf(metas.getSetembro()));
                }else{
                    campoSet.setText("0.00");
                }
                if (metas.getOutubro() != 0) {
                    campoOut.setText(String.valueOf(metas.getOutubro()));
                }else{
                    campoOut.setText("0.00");
                }
                if (metas.getNovembro() != 0) {
                    campoNov.setText(String.valueOf(metas.getNovembro()));
                }else{
                    campoNov.setText("0.00");
                }
                if (metas.getDezembro() != 0) {
                    campoDez.setText(String.valueOf(metas.getDezembro()));
                }else{
                    campoDez.setText("0.00");
                }
            }
        }
    }//GEN-LAST:event_comboAnoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (comboAno.getSelectedIndex() != 0) {
            if (GenericoDAO.getValidaMetas(ano, funcionario)) {
                this.setValores(metas);
                if (GenericoDAO.salvarEdicao(metas)) {
                    JOptionPane.showMessageDialog(null, "Metas editado com sucesso!");
                    this.dispose();
                }
            } else {
                Metas m = new Metas();
                m.setFuncionario(funcionario);
                m.setAno(ano);
                this.setValores(m);
                if (GenericoDAO.cadastrar(m)) {
                    JOptionPane.showMessageDialog(null, "Metas cadastradas com sucesso!");
                    this.dispose();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um ano!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_GerenciamentoMetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GerenciamentoMetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GerenciamentoMetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GerenciamentoMetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GerenciamentoMetas().setVisible(true);
            }
        });
    }

    public void setValores(Metas met) {
        if (!campoJan.getText().isEmpty()) {
            met.setJaneiro(Mascaras.formatarDoubleBanco(campoJan));
        }
        if (!campoFev.getText().isEmpty()) {
            met.setFevereiro(Mascaras.formatarDoubleBanco(campoFev));
        }
        if (!campoMar.getText().isEmpty()) {
            met.setMarco(Mascaras.formatarDoubleBanco(campoMar));
        }
        if (!campoAbr.getText().isEmpty()) {
            met.setAbril(Mascaras.formatarDoubleBanco(campoAbr));
        }
        if (!campoMai.getText().isEmpty()) {
            met.setMaio(Mascaras.formatarDoubleBanco(campoMai));
        }
        if (!campoJun.getText().isEmpty()) {
            met.setJunho(Mascaras.formatarDoubleBanco(campoJun));
        }
        if (!campoJul.getText().isEmpty()) {
            met.setJulho(Mascaras.formatarDoubleBanco(campoJul));
        }
        if (!campoAgo.getText().isEmpty()) {
            met.setAgosto(Mascaras.formatarDoubleBanco(campoAgo));
        }
        if (!campoSet.getText().isEmpty()) {
            met.setSetembro(Mascaras.formatarDoubleBanco(campoSet));
        }
        if (!campoOut.getText().isEmpty()) {
            met.setOutubro(Mascaras.formatarDoubleBanco(campoOut));
        }
        if (!campoNov.getText().isEmpty()) {
            met.setNovembro(Mascaras.formatarDoubleBanco(campoNov));
        }
        if (!campoDez.getText().isEmpty()) {
            met.setDezembro(Mascaras.formatarDoubleBanco(campoDez));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdAno;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField campoAbr;
    private javax.swing.JFormattedTextField campoAgo;
    private javax.swing.JTextField campoCargo;
    private javax.swing.JFormattedTextField campoDez;
    private javax.swing.JFormattedTextField campoFev;
    private javax.swing.JFormattedTextField campoJan;
    private javax.swing.JFormattedTextField campoJul;
    private javax.swing.JFormattedTextField campoJun;
    private javax.swing.JFormattedTextField campoMai;
    private javax.swing.JFormattedTextField campoMar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoNov;
    private javax.swing.JFormattedTextField campoOut;
    private javax.swing.JFormattedTextField campoSet;
    private javax.swing.JComboBox<String> comboAno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
