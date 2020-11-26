
package pc2.view;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import pc2.entidades.Cliente;
import pc2.persistencia.ClienteDAO;

public class ListaClientes extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private List<Cliente> listaClientes;

    /**
     * Creates new form ListaClientes
     */
    public ListaClientes() {
        initComponents();
        carregarClientes();
    }

    public void carregarClientes() {
        this.carregarClientes(false);
    }

    public void carregarClientes(boolean pesquisa) {
        // Pega o modelo da tabela de clientes
        DefaultTableModel modelo = (DefaultTableModel) tabClientes.getModel();
        // Limpar as linhas da tabela antes de preenchê-la
        modelo.setRowCount(0);
        // Desabilitar botões
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        // Verifica se fez uma pesquisa
        if (pesquisa == false) {
            // Carregar a lista de clientes
            listaClientes = ClienteDAO.listarTodos();
        }
        // Preenche a tabela de clientes
        for (Cliente c : listaClientes) {
            // Cria a linha da tabela
            Object[] linha = { c.getNome(), c.getCpf(), c.getTelefone(), c.getRg(), c.getIdade()

            };
            // adiciono a linha na tabela
            modelo.addRow(linha);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabClientes = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnPequisar = new javax.swing.JButton();
        btnNovo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabClientes.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

        }, new String[] { "Nome", "CPF", "Telefone", "RG", "Idade" }) {
            Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.Integer.class };
            boolean[] canEdit = new boolean[] { false, true, true, false, true };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tabClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClientesMouseClicked(evt);
            }
        });
        tabClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabClientesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabClientes);

        btnNovo.setText("Novo cliente");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir cliente");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar cliente");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        btnPequisar.setText("Pesquisar");
        btnPequisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPequisarActionPerformed(evt);
            }
        });

        btnNovo1.setText("Novo Carro");
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup().addComponent(btnNovo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesquisa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPequisar).addGap(18, 18, 18).addComponent(btnAlterar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluir)))
                        .addContainerGap())
                .addGroup(layout.createSequentialGroup().addGap(362, 362, 362).addComponent(btnNovo1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addComponent(btnNovo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNovo).addComponent(btnExcluir).addComponent(btnAlterar)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPequisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(126, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovoActionPerformed
        CadastroCliente tela = new CadastroCliente(this);
        tela.setTitle("Cadastrar novo cliente");
        tela.setVisible(true);
    }// GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
        // Pega o número da linha selecionada pelo usuário
        int linha = tabClientes.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir!");
        } else {
            // Pega o cliente que está na linha selecionada
            Cliente cliente = listaClientes.get(linha);

            int confirmacao = JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir o cliente " + cliente.getNome() + "?", "Confirmação",
                    JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

            if (confirmacao == JOptionPane.YES_OPTION) {
                if (ClienteDAO.excluir(cliente)) {
                    JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                    carregarClientes();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir cliente!");
                }
            }

        }

    }// GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tabClientes.getSelectedRow();
        if (linha > -1) {
            Cliente c = listaClientes.get(linha);

            CadastroCliente tela = new CadastroCliente(this);
            tela.setTitle("Alterar dados do cliente");
            tela.setCliente(c);
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para alterar!");
        }
    }// GEN-LAST:event_btnAlterarActionPerformed

    private void tabClientesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabClientesMouseClicked
        // Verifica se há uma linha selecionada
        if (tabClientes.getSelectedRow() > -1) {
            // Habilita os botões
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }// GEN-LAST:event_tabClientesMouseClicked

    private void btnPequisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPequisarActionPerformed
        listaClientes = ClienteDAO.pesquisar(txtPesquisa.getText());
        carregarClientes(true);
    }// GEN-LAST:event_btnPequisarActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtPesquisaKeyPressed
        // Verifica se pressionou a tecla ENTER
        if (evt.getKeyCode() == 10) {
            listaClientes = ClienteDAO.pesquisar(txtPesquisa.getText());
            carregarClientes(true);
        }

        // Verifica se pressionou a tecla ESC
        if (evt.getKeyCode() == 27) {
            txtPesquisa.setText("");
            carregarClientes();
        }
    }// GEN-LAST:event_txtPesquisaKeyPressed

    private void tabClientesKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tabClientesKeyPressed
        // Verifica se pressionou a tecla F4 do teclado
        if (evt.getKeyCode() == 115) {
            int linha = tabClientes.getSelectedRow();
            if (linha > -1) {
                Cliente cli = listaClientes.get(linha);
            }
        }

        if (evt.getKeyCode() == 113) {
            int linha = tabClientes.getSelectedRow();
            if (linha > -1) {
                Cliente cli = listaClientes.get(linha);
                JOptionPane.showMessageDialog(null, cli);
            }
        }
    }// GEN-LAST:event_tabClientesKeyPressed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovo1ActionPerformed
        ListaCarros lista = new ListaCarros();
        lista.setVisible(true);

    }// GEN-LAST:event_btnNovo1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnPequisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabClientes;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}