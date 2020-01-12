/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablet;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Pratos extends javax.swing.JFrame {

    /**
     * Creates new form Pratos
     */
    public Pratos() {
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

        prato4 = new javax.swing.JLabel();
        prato3 = new javax.swing.JLabel();
        prato1 = new javax.swing.JLabel();
        prato2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        qtdBatata = new javax.swing.JSpinner();
        qtdLabel = new javax.swing.JLabel();
        precoBatata = new javax.swing.JLabel();
        qtdJapones = new javax.swing.JSpinner();
        qtdLabel1 = new javax.swing.JLabel();
        precoJapones = new javax.swing.JLabel();
        qtdPizza = new javax.swing.JSpinner();
        qtdLabel2 = new javax.swing.JLabel();
        precoPizza = new javax.swing.JLabel();
        qtdHamburguer = new javax.swing.JSpinner();
        qtdLabel3 = new javax.swing.JLabel();
        precoHamburger = new javax.swing.JLabel();
        quemVaiPagar = new javax.swing.JLabel();
        nomeIntegrante = new javax.swing.JComboBox<>();
        botaoConfirmarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESCOLHA SEU PRATO");
        setPreferredSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        prato4.setBackground(new java.awt.Color(255, 0, 0));
        prato4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/hamburguerMenu.jpg"))); // NOI18N
        prato4.setToolTipText("<html>MESTRE DOS MAGOS - HAMBÚRGUER DA CASA: Não saia sem experimentar a receita especial da casa.<br> Saborei o FANTÁSTICO Mestre dos Magos, com nosso molho especial secreto.</html>");
        prato4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prato4.setOpaque(true);
        getContentPane().add(prato4);
        prato4.setBounds(560, 360, 325, 190);

        prato3.setBackground(new java.awt.Color(0, 204, 255));
        prato3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Pizza.jpg"))); // NOI18N
        prato3.setToolTipText("<html>PIZZA DO CHEFE: Pizzas de diversos sabores, com opções de bordas recheadas<br>\ne de tamanhos diversos. Monte sua própria pizza ou experimente a especial do chefe!</html>");
        prato3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prato3.setOpaque(true);
        getContentPane().add(prato3);
        prato3.setBounds(170, 360, 325, 190);

        prato1.setBackground(new java.awt.Color(0, 204, 255));
        prato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Batata-Frita.jpg"))); // NOI18N
        prato1.setToolTipText("<html>BATATA FRITA DA CASA:\n\nBatata frita com opções de queijo, bacon, orégano, linguiça, <br>\nentre outros acompanhamentos.\n</html>");
        prato1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prato1.setOpaque(true);
        prato1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prato1MouseClicked(evt);
            }
        });
        getContentPane().add(prato1);
        prato1.setBounds(170, 80, 325, 200);

        prato2.setBackground(new java.awt.Color(255, 0, 0));
        prato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/ComidaJaponesa.jpg"))); // NOI18N
        prato2.setToolTipText("<html>COMIDA JAPONESA: Sushis, sashimis, rolinho primavera, uramakis, <br>\nmakimonos, arroz doce, curry, yakisoba entre outros.</html>");
        prato2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prato2.setOpaque(true);
        getContentPane().add(prato2);
        prato2.setBounds(560, 80, 325, 200);

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 220, 60, 270);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESCOLHA SEU PRATO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 10, 330, 40);

        qtdBatata.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(qtdBatata);
        qtdBatata.setBounds(430, 300, 50, 40);

        qtdLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        qtdLabel.setText("QTD:");
        getContentPane().add(qtdLabel);
        qtdLabel.setBounds(370, 300, 80, 40);

        precoBatata.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        precoBatata.setText("Preço: R$ 9,00");
        getContentPane().add(precoBatata);
        precoBatata.setBounds(190, 300, 170, 40);

        qtdJapones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(qtdJapones);
        qtdJapones.setBounds(820, 300, 50, 40);

        qtdLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        qtdLabel1.setText("QTD:");
        getContentPane().add(qtdLabel1);
        qtdLabel1.setBounds(760, 300, 80, 40);

        precoJapones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        precoJapones.setText("Preço: R$ 27,00");
        getContentPane().add(precoJapones);
        precoJapones.setBounds(570, 300, 170, 40);

        qtdPizza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(qtdPizza);
        qtdPizza.setBounds(430, 560, 50, 40);

        qtdLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        qtdLabel2.setText("QTD:");
        getContentPane().add(qtdLabel2);
        qtdLabel2.setBounds(370, 560, 80, 40);

        precoPizza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        precoPizza.setText("Preço: R$ 35,00");
        getContentPane().add(precoPizza);
        precoPizza.setBounds(190, 560, 170, 40);

        qtdHamburguer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(qtdHamburguer);
        qtdHamburguer.setBounds(820, 560, 50, 40);

        qtdLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        qtdLabel3.setText("QTD:");
        getContentPane().add(qtdLabel3);
        qtdLabel3.setBounds(760, 560, 80, 40);

        precoHamburger.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        precoHamburger.setText("Preço: R$ 13,50");
        getContentPane().add(precoHamburger);
        precoHamburger.setBounds(570, 560, 170, 40);

        quemVaiPagar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quemVaiPagar.setText("Quem vai pagar?");
        getContentPane().add(quemVaiPagar);
        quemVaiPagar.setBounds(250, 620, 200, 40);

        nomeIntegrante.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nomeIntegrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        nomeIntegrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeIntegranteActionPerformed(evt);
            }
        });
        getContentPane().add(nomeIntegrante);
        nomeIntegrante.setBounds(450, 620, 60, 40);

        botaoConfirmarPedido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botaoConfirmarPedido.setText("Confirmar Pedido");
        botaoConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConfirmarPedido);
        botaoConfirmarPedido.setBounds(550, 620, 270, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void prato1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prato1MouseClicked
        // TODO add your handling code here:
        //INSERIR DESCRIÇÃO DETALHADA DOS PRATOS
    }//GEN-LAST:event_prato1MouseClicked

    private void nomeIntegranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeIntegranteActionPerformed
        // TODO add your handling code here:
        //MUDAR PARA O NOME DOS INTEGRANTES
    }//GEN-LAST:event_nomeIntegranteActionPerformed

    private void botaoConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarPedidoActionPerformed
        // TODO add your handling code here:
        String nomeIntegranteStr = nomeIntegrante.getSelectedItem().toString();
        System.out.println(nomeIntegranteStr);
        int idIntegrante = Integer.parseInt(nomeIntegranteStr);
        if ((Integer) qtdBatata.getValue() > 0){
            Conta.incluirPedido(idIntegrante, 1, (Integer) qtdBatata.getValue());
        }
        if ((Integer) qtdJapones.getValue() > 0){
            Conta.incluirPedido(idIntegrante, 2, (Integer) qtdJapones.getValue());
        }
        if ((Integer) qtdPizza.getValue() > 0){
            Conta.incluirPedido(idIntegrante, 3, (Integer) qtdPizza.getValue());
        }
        if ((Integer) qtdHamburguer.getValue() > 0){
            Conta.incluirPedido(idIntegrante, 4, (Integer) qtdHamburguer.getValue());
        }
        JOptionPane.showMessageDialog(null, "Pedido confirmado!");
    }//GEN-LAST:event_botaoConfirmarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Pratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmarPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> nomeIntegrante;
    private javax.swing.JLabel prato1;
    private javax.swing.JLabel prato2;
    private javax.swing.JLabel prato3;
    private javax.swing.JLabel prato4;
    private javax.swing.JLabel precoBatata;
    private javax.swing.JLabel precoHamburger;
    private javax.swing.JLabel precoJapones;
    private javax.swing.JLabel precoPizza;
    private javax.swing.JSpinner qtdBatata;
    private javax.swing.JSpinner qtdHamburguer;
    private javax.swing.JSpinner qtdJapones;
    private javax.swing.JLabel qtdLabel;
    private javax.swing.JLabel qtdLabel1;
    private javax.swing.JLabel qtdLabel2;
    private javax.swing.JLabel qtdLabel3;
    private javax.swing.JSpinner qtdPizza;
    private javax.swing.JLabel quemVaiPagar;
    // End of variables declaration//GEN-END:variables
}
