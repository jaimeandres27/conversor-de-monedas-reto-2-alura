package Principal;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaime
 */
//import javax.swing.*;
public class temperatura extends javax.swing.JFrame {
    double valor2;
    /**
     * Creates new form divisas
     */
    public temperatura() {
        initComponents();
//        divisa1.setUI(Propiedades.createUI(rootPane));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        temperatura2 = new javax.swing.JComboBox<>();
        temperatura1 = new javax.swing.JComboBox<>();
        texto_temperatura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        confirmar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/termometro (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 247, 243));
        jLabel3.setText("CONVERSOR DE TEMPERATURA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, -1));

        temperatura2.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        temperatura2.setForeground(new java.awt.Color(44, 110, 73));
        temperatura2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Rankine" }));
        temperatura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatura2ActionPerformed(evt);
            }
        });
        jPanel1.add(temperatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 90, -1));

        temperatura1.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        temperatura1.setForeground(new java.awt.Color(44, 110, 73));
        temperatura1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Rankine" }));
        temperatura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatura1ActionPerformed(evt);
            }
        });
        jPanel1.add(temperatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 90, -1));

        texto_temperatura.setBackground(new java.awt.Color(242, 68, 68));
        texto_temperatura.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        texto_temperatura.setForeground(new java.awt.Color(240, 247, 243));
        texto_temperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texto_temperatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 247, 243)));
        texto_temperatura.setCaretColor(new java.awt.Color(240, 247, 243));
        texto_temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_temperaturaActionPerformed(evt);
            }
        });
        jPanel1.add(texto_temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 60));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        resultado2.setBackground(new java.awt.Color(240, 247, 243));
        resultado2.setColumns(20);
        resultado2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        resultado2.setForeground(new java.awt.Color(255, 102, 102));
        resultado2.setRows(5);
        resultado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 68, 68)));
        jScrollPane1.setViewportView(resultado2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 280, 60));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 68, 68));
        jLabel8.setText("Reto 2 Alura");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelota (5).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 40, 40));

        confirmar2.setBackground(new java.awt.Color(254, 254, 227));
        confirmar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garrapata (2).png"))); // NOI18N
        confirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar2ActionPerformed(evt);
            }
        });
        jPanel1.add(confirmar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 60, 60));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 68, 68));
        jLabel5.setText("Moneda a convertir:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 247, 243));
        jLabel6.setText("Temperatura en:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casa (2).png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 323, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box 1 - moeda 1 (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box 2 - moeda 2 (2).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void temperatura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatura2ActionPerformed

                // TODO add your handling code here:
    }//GEN-LAST:event_temperatura2ActionPerformed

    private void temperatura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatura1ActionPerformed
        
    // TODO add your handling code here:
    }//GEN-LAST:event_temperatura1ActionPerformed

    private void texto_temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_temperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_temperaturaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Menu_principal menu=new Menu_principal(); //Evento para regresar al menu principal
        menu.setVisible(true);  
        this.dispose();       
    }//GEN-LAST:event_jButton1MouseClicked

    private void confirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar2ActionPerformed
        double valor2 = Double.parseDouble(texto_temperatura.getText());
        int temperatura = temperatura1.getSelectedIndex();
        int temperaturafinal = temperatura2.getSelectedIndex();
        
       Operaciones puente = new Operaciones();
       //Enviamos los valores que capturamos
       puente.setValor2(valor2);
       puente.setTemperatura(temperatura);
       puente.setTemperaturafinal(temperaturafinal);
       
       //Ejecutar metodo
       double resultado_t = puente.convertir2();
       
       resultado2.setText(""); //Limpia el Textarea
       resultado2.append("" + resultado_t);
    }//GEN-LAST:event_confirmar2ActionPerformed

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
            java.util.logging.Logger.getLogger(temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new temperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado2;
    private javax.swing.JComboBox<String> temperatura1;
    private javax.swing.JComboBox<String> temperatura2;
    private javax.swing.JTextField texto_temperatura;
    // End of variables declaration//GEN-END:variables

    
    }

