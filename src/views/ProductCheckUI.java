/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalindu.pos;

/**
 *
 * @author Kalindu
 */
public class ProductCheckUI extends javax.swing.JFrame {

    /**
     * Creates new form CheckUpdate
     */
    public ProductCheckUI() {
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

        jPanel1 = new javax.swing.JPanel();
        txtPCode = new javax.swing.JTextField();
        txtPName = new javax.swing.JTextField();
        CombOne = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jReRemove = new javax.swing.JButton();
        jReSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jReCheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txtPCode.setBackground(new java.awt.Color(204, 204, 204));
        txtPCode.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPCodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtPCode);
        txtPCode.setBounds(261, 36, 300, 30);

        txtPName.setBackground(new java.awt.Color(204, 204, 204));
        txtPName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtPName);
        txtPName.setBounds(261, 84, 300, 30);

        CombOne.setBackground(new java.awt.Color(204, 204, 204));
        CombOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Retail Items", "Spare Parts", " " }));
        CombOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CombOneMouseClicked(evt);
            }
        });
        CombOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombOneActionPerformed(evt);
            }
        });
        jPanel1.add(CombOne);
        CombOne.setBounds(261, 142, 300, 22);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Re enter Item Type ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(61, 145, 143, 19);

        jReRemove.setBackground(new java.awt.Color(204, 204, 204));
        jReRemove.setText("Remove");
        jReRemove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jReRemove);
        jReRemove.setBounds(446, 266, 115, 50);

        jReSave.setBackground(new java.awt.Color(204, 204, 204));
        jReSave.setText("Save");
        jReSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jReSave);
        jReSave.setBounds(261, 266, 115, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Re enter the Product Code");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(61, 43, 190, 19);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Re enter the Product Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(61, 91, 200, 19);

        jReCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jReCheck.setText("  Checked Details");
        jReCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReCheckActionPerformed(evt);
            }
        });
        jPanel1.add(jReCheck);
        jReCheck.setBounds(261, 192, 206, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPCodeActionPerformed

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNameActionPerformed

    private void CombOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CombOneMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_CombOneMouseClicked

    private void CombOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombOneActionPerformed

    private void jReCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jReCheckActionPerformed

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
            java.util.logging.Logger.getLogger(ProductCheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductCheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductCheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductCheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductCheckUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CombOne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jReCheck;
    private javax.swing.JButton jReRemove;
    private javax.swing.JButton jReSave;
    private javax.swing.JTextField txtPCode;
    private javax.swing.JTextField txtPName;
    // End of variables declaration//GEN-END:variables
}
