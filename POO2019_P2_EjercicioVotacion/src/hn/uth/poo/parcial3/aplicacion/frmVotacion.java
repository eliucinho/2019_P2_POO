/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial3.aplicacion;

import hn.uth.poo.parcial3.aplicacion.objetos.Candidato;

/**
 *
 * @author uth
 */
public class frmVotacion extends javax.swing.JFrame {
Candidato goku;
Candidato picoro;
Candidato Vegueta;
    /**
     * Creates new form frmVotacion
     */
    public frmVotacion() {
        initComponents();
        inicializarVotacion();
    }

    public void inicializarVotacion(){
        goku=new Candidato("Goku");
        picoro=new Candidato("Picoro");
        Vegueta=new Candidato("Vegueta");
    }
    
    public void actualizarResultados(){
        lblResultado1.setText
        (""+goku.getTotalVotos());
        lblResultado2.setText
        (""+picoro.getTotalVotos());
        lblResultado3.setText
        (""+Vegueta.getTotalVotos());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        btnVotar1 = new javax.swing.JButton();
        btnVotar2 = new javax.swing.JButton();
        btnVotar3 = new javax.swing.JButton();
        lblResultado1 = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();
        lblResultado3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("jLabel1");

        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hn/uth/poo/parcial3/aplicacion/imagenes/g.jpg"))); // NOI18N

        lblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hn/uth/poo/parcial3/aplicacion/imagenes/p.png"))); // NOI18N

        lblImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hn/uth/poo/parcial3/aplicacion/imagenes/v.jpg"))); // NOI18N

        btnVotar1.setText("Votar++");
        btnVotar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotar1ActionPerformed(evt);
            }
        });

        btnVotar2.setText("Votar++");
        btnVotar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotar2ActionPerformed(evt);
            }
        });

        btnVotar3.setText("Votar++");
        btnVotar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblImagen1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnVotar1)
                        .addGap(157, 157, 157)
                        .addComponent(btnVotar2)
                        .addGap(233, 233, 233)
                        .addComponent(btnVotar3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblResultado1)
                        .addGap(198, 198, 198)
                        .addComponent(lblResultado2)
                        .addGap(348, 348, 348)
                        .addComponent(lblResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(430, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(53, 53, 53)
                        .addComponent(lblImagen1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVotar1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVotar2)
                        .addComponent(btnVotar3)))
                .addGap(36, 36, 36)
                .addComponent(lblResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultado1)
                    .addComponent(lblResultado2))
                .addContainerGap(316, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotar1ActionPerformed
        // TODO add your handling code here:
        lblResultado1.setText("Voto por goku");
        goku.votar();
        actualizarResultados();
    }//GEN-LAST:event_btnVotar1ActionPerformed

    private void btnVotar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotar2ActionPerformed
        // TODO add your handling code here:
        lblResultado2.setText("Voto por picoro");
        picoro.votar();
        actualizarResultados();
    }//GEN-LAST:event_btnVotar2ActionPerformed

    private void btnVotar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotar3ActionPerformed
        // TODO add your handling code here:
        lblResultado3.setText("Voto por vegueta");
        Vegueta.votar();
        actualizarResultados();
    }//GEN-LAST:event_btnVotar3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVotacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVotar1;
    private javax.swing.JButton btnVotar2;
    private javax.swing.JButton btnVotar3;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JLabel lblResultado3;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
