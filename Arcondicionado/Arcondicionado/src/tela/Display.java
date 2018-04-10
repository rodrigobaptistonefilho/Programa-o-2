//Alunos:Rodrigo Baptistone Filho e José Eduardo de Oliveira Vieira.
//RA: 120187 e 120178.
package tela;

import cond.Ar;
import javax.swing.JOptionPane;
public class Display extends javax.swing.JFrame {

   Ar arcon;
    public Display() {
        arcon = new Ar();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        botaoLigar = new javax.swing.JButton();
        campoLigado = new javax.swing.JTextField();
        botaoDesligar = new javax.swing.JButton();
        campoAumentar = new javax.swing.JTextField();
        botaoAumentar = new javax.swing.JToggleButton();
        botaoDiminuir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoQuente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ar Condicionado");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        botaoLigar.setText("Ligar");
        botaoLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLigarActionPerformed(evt);
            }
        });

        botaoDesligar.setText("Desligar");
        botaoDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesligarActionPerformed(evt);
            }
        });

        campoAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAumentarActionPerformed(evt);
            }
        });

        botaoAumentar.setText("+");
        botaoAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAumentarActionPerformed(evt);
            }
        });

        botaoDiminuir.setText("-");
        botaoDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDiminuirActionPerformed(evt);
            }
        });

        jLabel2.setText("ºC");

        jLabel3.setText(" Developed by Rodrigo and José");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ar Condicionado ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoQuente, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(campoLigado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(campoAumentar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2)
                                            .addGap(69, 69, 69)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(botaoLigar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                        .addComponent(botaoAumentar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botaoDesligar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(botaoDiminuir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel3))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLigado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLigar)
                    .addComponent(botaoDesligar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDiminuir)
                    .addComponent(botaoAumentar)
                    .addComponent(campoAumentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(campoQuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLigarActionPerformed
           arcon.ligar();
           this.atualizar();     
    }//GEN-LAST:event_botaoLigarActionPerformed

    private void botaoDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesligarActionPerformed
        arcon.desligado();
        this.atualizar();
    }//GEN-LAST:event_botaoDesligarActionPerformed

    private void botaoAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAumentarActionPerformed
       if (!arcon.isLigada()){
            JOptionPane.showMessageDialog(null, "Ligue o Ar Condicionado");
        }
        arcon.aumentarIntensidade();
        atualizar();
    }//GEN-LAST:event_botaoAumentarActionPerformed

    private void botaoDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDiminuirActionPerformed
         arcon.diminuirIntensidade();
        this.atualizar();
    }//GEN-LAST:event_botaoDiminuirActionPerformed

    private void campoAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAumentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAumentarActionPerformed
    public void atualizar(){
        if (arcon.isLigada()){
            campoLigado.setText("Ligado");
        }
        else{
            campoLigado.setText("Desligado");
        }        
        this.campoAumentar.setText(""+arcon.getIntensidade());
        
        if(arcon.getIntensidade()<16)
       {
           campoQuente.setText("Frio");
       }else
       {
           campoQuente.setText("Quente");
       }
        
        
    }
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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoAumentar;
    private javax.swing.JButton botaoDesligar;
    private javax.swing.JButton botaoDiminuir;
    private javax.swing.JButton botaoLigar;
    private javax.swing.JTextField campoAumentar;
    private javax.swing.JTextField campoLigado;
    private javax.swing.JTextField campoQuente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
