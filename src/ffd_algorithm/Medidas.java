/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffd_algorithm;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author William
 */
public class Medidas extends javax.swing.JFrame {
    
    public static ArrayList<Integer> medidas = new ArrayList<>();
    public static String altostr = "";
    public static String anchostr = "";
    public static String cantidadstr = "";
    public static int llenado = 0;
    /**
     * Creates new form Medidas
     */
    public Medidas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLargo = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainFrame.setBackground(new java.awt.Color(51, 51, 51));
        mainFrame.setAlignmentX(0.0F);
        mainFrame.setAlignmentY(0.0F);
        mainFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainFrameMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Medidas");

        btnAgregar.setBackground(new java.awt.Color(0, 102, 153));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Agregar");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(33, 33, 33))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Largo:");

        try {
            txtLargo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLargoKeyPressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Cantidad:");

        txtCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        altostr = txtLargo.getText();
        cantidadstr = txtCantidad.getText();
        llenado = 1;
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Agregar mas registros?", "Aviso", JOptionPane.YES_NO_OPTION);

        if (opcion == 0) {
            txtLargo.setText("");
            txtCantidad.setText("");
            txtLargo.requestFocus();
            //EXTRACT
            DefaultTableModel modelo=(DefaultTableModel) MainJFrame.tabla.getModel();
            Object [] fila=new Object[3];

            fila[0] = altostr;
            fila[1] = cantidadstr;
            modelo.addRow(fila);
            //------------------------
            Double valor = Double.parseDouble(altostr)*1000;
            int val = (int) (valor*1);
            for (int i = 0; i < Integer.parseInt(cantidadstr); i++) {
                medidas.add(Integer.valueOf(val));
            }
            
            
        } else {
            //EXTRACT
            DefaultTableModel modelo=(DefaultTableModel) MainJFrame.tabla.getModel();
            Object [] fila=new Object[3];

            fila[0] = altostr;
            fila[1] = cantidadstr;
            modelo.addRow(fila);

            modelo.addRow(fila);
            //------------------------
            Double valor = Double.parseDouble(altostr)*1000;
            int val = (int) (valor*1);
            for (int i = 0; i < Integer.parseInt(cantidadstr); i++) {
                medidas.add(Integer.valueOf(val));
            }
            this.dispose();
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        this.btnAgregar.setBackground(new Color(0, 102, 240));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed

        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            altostr = txtLargo.getText();
            cantidadstr = txtCantidad.getText();
            llenado = 1;
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Agregar mas registros?", "Aviso", JOptionPane.YES_NO_OPTION);

            if (opcion == 0) {
                txtLargo.setText("");
                txtCantidad.setText("");
                txtLargo.requestFocus();
                //EXTRACT
                DefaultTableModel modelo=(DefaultTableModel) MainJFrame.tabla.getModel();
                
                Object [] fila=new Object[3];

                fila[0] = altostr;
                fila[1] = cantidadstr;
                modelo.addRow(fila);
                //------------------------
                Double valor = Double.parseDouble(altostr)*1000;
                int val = (int) (valor*1);
                for (int i = 0; i < Integer.parseInt(cantidadstr); i++) {
                medidas.add(Integer.valueOf(val));
                }
            } else {
                //EXTRACT
                DefaultTableModel modelo=(DefaultTableModel) MainJFrame.tabla.getModel();
                Object [] fila=new Object[6];

                fila[0] = altostr;
                fila[1] = cantidadstr;

                modelo.addRow(fila);
                //------------------------
                Double valor = Double.parseDouble(altostr)*1000;
                int val = (int) (valor*1);
                for (int i = 0; i < Integer.parseInt(cantidadstr); i++) {
                    medidas.add(Integer.valueOf(val));
                }
                this.dispose();
            }
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void mainFrameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainFrameMouseEntered
        this.btnAgregar.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_mainFrameMouseEntered

    private void txtLargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLargoKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            txtCantidad.requestFocus();
        }
        if (evt.getKeyCode()== KeyEvent.VK_DECIMAL) {
            if (txtLargo.getCaretPosition()==0){
                txtLargo.setText("0");
                txtLargo.setCaretPosition(2);
            }else{
                txtLargo.setCaretPosition(2);
            }
        }
    }//GEN-LAST:event_txtLargoKeyPressed

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
            java.util.logging.Logger.getLogger(Medidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JFormattedTextField txtCantidad;
    private javax.swing.JFormattedTextField txtLargo;
    // End of variables declaration//GEN-END:variables
}
