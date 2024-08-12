package ap2.pkg18;

import javax.swing.JOptionPane;

public class IGU extends javax.swing.JFrame {

    public IGU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        txtSol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtOperacion.setEditable(false);
        txtOperacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOperacion.setFocusable(false);

        jLabel1.setText("Numero 1 :");

        jLabel2.setText("Numero 2 :");

        txtNum1.setEditable(false);
        txtNum1.setFocusable(false);

        txtNum2.setEditable(false);
        txtNum2.setFocusable(false);

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnVerificar.setText("VERIFICAR");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        txtSol.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNum1)
                    .addComponent(txtNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(txtSol, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSol, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        operacion();

    }//GEN-LAST:event_formWindowOpened

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        operacion();

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed

        int solucion = Integer.parseInt(this.txtSol.getText());
        int num1 = Integer.parseInt(this.txtNum1.getText());
        int num2 = Integer.parseInt(this.txtNum2.getText());

        String ope = this.txtOperacion.getText();

        switch (ope) {

            case "SUMA":

                if (solucion == (num1 + num2)) {
                    JOptionPane.showMessageDialog(this, "Solucion Correcta");
                    operacion();
                    this.txtSol.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Solucion Incorrecta , la solucion es : " + (num1 + num2));
                    operacion();
                    this.txtSol.setText("");
                }

                break;

            case "RESTA":
                if (solucion == (num1 - num2)) {
                    JOptionPane.showMessageDialog(this, "Solucion Correcta");
                    operacion();
                    this.txtSol.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Solucion Incorrecta , la solucion es : " + (num1 - num2));
                    operacion();
                    this.txtSol.setText("");
                }

                break;

            case "MULTIPLICACION":
                if (solucion == (num1 * num2)) {
                    JOptionPane.showMessageDialog(this, "Solucion Correcta");
                    operacion();
                    this.txtSol.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Solucion Incorrecta , la solucion es : " + (num1 * num2));
                    operacion();
                    this.txtSol.setText("");
                }

                break;

            case "DIVISION":
                if (solucion == (num1 / num2)) {
                    JOptionPane.showMessageDialog(this, "Solucion Correcta");
                    operacion();
                    this.txtSol.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Solucion Incorrecta , la solucion es : " + (num1 / num2));
                    operacion();
                    this.txtSol.setText("");
                }

                break;

        }


    }//GEN-LAST:event_btnVerificarActionPerformed

    public void operacion() {

        int operacion = (int) (Math.random() * 4 + 1);

        switch (operacion) {

            case 1:
                this.txtOperacion.setText("SUMA");
                generar();

                break;

            case 2:

                this.txtOperacion.setText("RESTA");
                generar();

                break;

            case 3:

                this.txtOperacion.setText("MULTIPLICACION");
                generar();

                break;

            case 4:
                this.txtOperacion.setText("DIVISION");
                generar();

                break;

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextField txtSol;
    // End of variables declaration//GEN-END:variables

    private void generar() {

        int num1 = (int) (Math.random() * 99 + 1);
        int num2 = (int) (Math.random() * 99 + 1);
        
      

        this.txtNum1.setText("" + num1);
        this.txtNum2.setText("" + num2);
    }
}
