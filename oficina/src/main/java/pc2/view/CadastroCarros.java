
package pc2.view;

import java.util.List;

import javax.swing.JOptionPane;

import pc2.entidades.Carro;
import pc2.entidades.Cliente;
import pc2.persistencia.CarroDAO;
import pc2.persistencia.ClienteDAO;

public class CadastroCarros extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    private ListaCarros telaLista;
    private Carro carro;
    private String cpfCliente;

    public CadastroCarros(ListaCarros telaLista) {
        initComponents();
        this.carro = new Carro();
        this.telaLista = telaLista;

        cpfCliente = "";

        ComboClientes.removeAllItems();

        List<Cliente> clientes = ClienteDAO.listarTodos();

        for (Cliente c : clientes) {
            ComboClientes.addItem(c.getCpf());
        }
    }

    public void setCliente(Carro carro) {
        this.carro = carro;
        txtMarca.setText(carro.getMarca());
        txtModelo.setText(carro.getModelo());
        txtPlaca.setText(carro.getPlaca());
        ComboClientes.setSelectedItem(carro.getCpfCliente());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAnoModelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAnoFabricacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ComboClientes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel1.setText("marca");

        jLabel6.setText("Modelo");

        jLabel7.setText("Ano Modelo");

        jLabel8.setText("Placa");

        jLabel9.setText("Ano fabricação");

        ComboClientes.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboClientesActionPerformed(evt);
            }
        });

        jLabel10.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(btnSalvar)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9).addComponent(txtAnoFabricacao,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1).addComponent(txtMarca,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6).addComponent(txtModelo,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtAnoModelo,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(ComboClientes,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup().addComponent(jLabel7)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        100, Short.MAX_VALUE)
                                                                .addComponent(jLabel10))))
                                        .addGroup(layout.createSequentialGroup().addGap(23, 23, 23)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8).addComponent(txtPlaca,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(21, 21, 21)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addGap(15, 15, 15).addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup().addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(
                                        txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup().addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7).addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(txtPlaca,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnSalvar).addContainerGap()));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed

        // Cliente cliente = new Cliente();
        carro.setMarca(txtMarca.getText());
        carro.setModelo(txtModelo.getText());
        carro.setAnoModelo(Integer.parseInt(txtAnoModelo.getText()));
        carro.setAnoFabricacao(Integer.parseInt(txtAnoFabricacao.getText()));
        carro.setPlaca(txtPlaca.getText());
        carro.setCpfCliente((String) ComboClientes.getSelectedItem());

        String mensagem;
        boolean deuCerto;

        deuCerto = CarroDAO.inserir(carro); // Insere no banco de dados
        mensagem = "Carro inserido com sucesso!";
        if (!deuCerto) {
            // Altera os dados no banco de dados
            deuCerto = CarroDAO.alterar(carro);
            mensagem = "carro alterado com sucesso!";
        }

        if (deuCerto) {
            JOptionPane.showMessageDialog(null, mensagem);
            // atualiza a lista de clientes
            telaLista.carregarCarro();
            // fecha a tela de cadastro
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao gravar cliente!");
        }
    }// GEN-LAST:event_btnSalvarActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtMarcaActionPerformed

    private void ComboClientesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ComboClientesActionPerformed
        cpfCliente = (String) ComboClientes.getSelectedItem();
    }// GEN-LAST:event_ComboClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboClientes;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAnoFabricacao;
    private javax.swing.JTextField txtAnoModelo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
