package calculadora;

import controller.CalculadoraController;

/**
 *
 * @author scorn
 */
public class CalculadoraFrame extends javax.swing.JFrame {

    // Variable para almacenar la exprecion aritmetica
    protected String exprecion;
    protected CalculadoraController controller;
    
    
    public CalculadoraFrame() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.exprecion = "";
        controller = new CalculadoraController();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        screen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        buttonPt = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        buttonSum = new javax.swing.JButton();
        buttonRes = new javax.swing.JButton();
        buttonDiv = new javax.swing.JButton();
        buttonPor = new javax.swing.JButton();
        button18 = new javax.swing.JButton();
        buttonPot = new javax.swing.JButton();
        buttonMod = new javax.swing.JButton();
        buttonIgua = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Basíca");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        screen.setEditable(false);
        screen.setBackground(new java.awt.Color(204, 204, 204));
        screen.setColumns(8);
        screen.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screen.setText("0");
        screen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(screen)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(4, 3, 5, 5));

        button7.setBackground(new java.awt.Color(51, 153, 255));
        button7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("7");
        button7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel2.add(button7);

        button8.setBackground(new java.awt.Color(51, 153, 255));
        button8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("8");
        button8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel2.add(button8);

        button9.setBackground(new java.awt.Color(51, 153, 255));
        button9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("9");
        button9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel2.add(button9);

        button4.setBackground(new java.awt.Color(51, 153, 255));
        button4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("4");
        button4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button4);

        button5.setBackground(new java.awt.Color(51, 153, 255));
        button5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("5");
        button5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel2.add(button5);

        button6.setBackground(new java.awt.Color(51, 153, 255));
        button6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("6");
        button6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel2.add(button6);

        button1.setBackground(new java.awt.Color(51, 153, 255));
        button1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("1");
        button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel2.add(button1);

        button2.setBackground(new java.awt.Color(51, 153, 255));
        button2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("2");
        button2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel2.add(button2);

        button3.setBackground(new java.awt.Color(51, 153, 255));
        button3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("3");
        button3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel2.add(button3);

        button0.setBackground(new java.awt.Color(51, 153, 255));
        button0.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button0.setForeground(new java.awt.Color(255, 255, 255));
        button0.setText("0");
        button0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        jPanel2.add(button0);

        buttonPt.setBackground(new java.awt.Color(51, 153, 255));
        buttonPt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonPt.setForeground(new java.awt.Color(255, 255, 255));
        buttonPt.setText(".");
        buttonPt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPtActionPerformed(evt);
            }
        });
        jPanel2.add(buttonPt);

        buttonClear.setBackground(new java.awt.Color(51, 153, 255));
        buttonClear.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(255, 255, 255));
        buttonClear.setText("CE");
        buttonClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel2.add(buttonClear);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(4, 2, 5, 5));

        buttonSum.setBackground(new java.awt.Color(51, 153, 255));
        buttonSum.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonSum.setForeground(new java.awt.Color(255, 255, 255));
        buttonSum.setText("+");
        buttonSum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumActionPerformed(evt);
            }
        });
        jPanel3.add(buttonSum);

        buttonRes.setBackground(new java.awt.Color(51, 153, 255));
        buttonRes.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonRes.setForeground(new java.awt.Color(255, 255, 255));
        buttonRes.setText("-");
        buttonRes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResActionPerformed(evt);
            }
        });
        jPanel3.add(buttonRes);

        buttonDiv.setBackground(new java.awt.Color(51, 153, 255));
        buttonDiv.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonDiv.setForeground(new java.awt.Color(255, 255, 255));
        buttonDiv.setText("/");
        buttonDiv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivActionPerformed(evt);
            }
        });
        jPanel3.add(buttonDiv);

        buttonPor.setBackground(new java.awt.Color(51, 153, 255));
        buttonPor.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonPor.setForeground(new java.awt.Color(255, 255, 255));
        buttonPor.setText("*");
        buttonPor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPorActionPerformed(evt);
            }
        });
        jPanel3.add(buttonPor);

        button18.setBackground(new java.awt.Color(51, 153, 255));
        button18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button18.setForeground(new java.awt.Color(255, 255, 255));
        button18.setText("√");
        button18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });
        jPanel3.add(button18);

        buttonPot.setBackground(new java.awt.Color(51, 153, 255));
        buttonPot.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonPot.setForeground(new java.awt.Color(255, 255, 255));
        buttonPot.setText("x^y");
        buttonPot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPotActionPerformed(evt);
            }
        });
        jPanel3.add(buttonPot);

        buttonMod.setBackground(new java.awt.Color(51, 153, 255));
        buttonMod.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonMod.setForeground(new java.awt.Color(255, 255, 255));
        buttonMod.setText("%");
        buttonMod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModActionPerformed(evt);
            }
        });
        jPanel3.add(buttonMod);

        buttonIgua.setBackground(new java.awt.Color(51, 153, 255));
        buttonIgua.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonIgua.setForeground(new java.awt.Color(255, 255, 255));
        buttonIgua.setText("=");
        buttonIgua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonIgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIguaActionPerformed(evt);
            }
        });
        jPanel3.add(buttonIgua);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"wrw4", "wr4rw4", "wr4w4r", "w4rw4", "w4rw4r"},
                {null, "w4rw4rw4r", "w4rw4r", "w4rw4rw4r", "wrw4r"},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Val1", "Op", "Val2", "Resultado"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(0, 153, 153));
        jTable2.setShowGrid(true);
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 585, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        showText("3");
    }//GEN-LAST:event_button3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        this.exprecion += button1.getText();
        this.screen.setText(exprecion);
//        showText("1");
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        this.exprecion += button2.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_button2ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        this.exprecion += button4.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        this.exprecion += button5.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        this.exprecion += button6.getText();
        this.screen.setText(exprecion);

    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        this.exprecion += button7.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        this.exprecion += button8.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        showText("9");
    }//GEN-LAST:event_button9ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        this.exprecion += button0.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_button0ActionPerformed

    private void buttonPtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPtActionPerformed
        this.exprecion += buttonPt.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_buttonPtActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
        this.exprecion += button18.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_button18ActionPerformed

    private void buttonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSumActionPerformed
        this.exprecion += buttonSum.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_buttonSumActionPerformed

    private void buttonResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResActionPerformed
        this.exprecion += buttonRes.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_buttonResActionPerformed

    private void buttonPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPorActionPerformed
        this.exprecion += buttonPor.getText();
        this.screen.setText(exprecion);
    }//GEN-LAST:event_buttonPorActionPerformed

    private void buttonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivActionPerformed
        // TODO add your handling code here:
        showText("/");
    }//GEN-LAST:event_buttonDivActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        screen.setText("");
        exprecion = "";
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonIguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIguaActionPerformed
        // Llamar a el controlador
        controller.getToken(exprecion);
    }//GEN-LAST:event_buttonIguaActionPerformed

    private void buttonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModActionPerformed
        showText("%");
    }//GEN-LAST:event_buttonModActionPerformed

    private void buttonPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPotActionPerformed
        showText("^");
    }//GEN-LAST:event_buttonPotActionPerformed

    private void showText(String cad) {
        String num = screen.getText();
        if (num.equals("0")) {
            screen.setText(cad);
        } else {
            screen.setText(num + cad);
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
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button18;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDiv;
    private javax.swing.JButton buttonIgua;
    private javax.swing.JButton buttonMod;
    private javax.swing.JButton buttonPor;
    private javax.swing.JButton buttonPot;
    private javax.swing.JButton buttonPt;
    private javax.swing.JButton buttonRes;
    private javax.swing.JButton buttonSum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField screen;
    // End of variables declaration//GEN-END:variables
}
