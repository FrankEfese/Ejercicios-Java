package ap2.pkg12;

import javax.swing.JOptionPane;

public class IGU extends javax.swing.JFrame {

    public IGU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        txtSol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Introduce tu DNI sin Letra : ");

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        txtSol.setEditable(false);
        txtSol.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txtSol, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(txtSol, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        int dni = Integer.parseInt(this.txtDni.getText());

        if (dni < 10000000 || dni > 99999999) {
            this.txtSol.setText("Te has equivocado con el DNI");
        } else {

            int letra = dni % 23;

            switch (letra) {

                case 0 ->
                    this.txtSol.setText("Tu letra del DNI es : T");
                case 1 ->
                    this.txtSol.setText("Tu letra del DNI es : R");
                case 2 ->
                    this.txtSol.setText("Tu letra del DNI es : W");
                case 3 ->
                    this.txtSol.setText("Tu letra del DNI es : A");
                case 4 ->
                    this.txtSol.setText("Tu letra del DNI es : G");
                case 5 ->
                    this.txtSol.setText("Tu letra del DNI es : M");
                case 6 ->
                    this.txtSol.setText("Tu letra del DNI es : Y");
                case 7 ->
                    this.txtSol.setText("Tu letra del DNI es : F");
                case 8 ->
                    this.txtSol.setText("Tu letra del DNI es : P");
                case 9 ->
                    this.txtSol.setText("Tu letra del DNI es : D");
                case 10 ->
                    this.txtSol.setText("Tu letra del DNI es : X");
                case 11 ->
                    this.txtSol.setText("Tu letra del DNI es : B");
                case 12 ->
                    this.txtSol.setText("Tu letra del DNI es : N");
                case 13 ->
                    this.txtSol.setText("Tu letra del DNI es : J");
                case 14 ->
                    this.txtSol.setText("Tu letra del DNI es : Z");
                case 15 ->
                    this.txtSol.setText("Tu letra del DNI es : S");
                case 16 ->
                    this.txtSol.setText("Tu letra del DNI es : Q");
                case 17 ->
                    this.txtSol.setText("Tu letra del DNI es : V");
                case 18 ->
                    this.txtSol.setText("Tu letra del DNI es : H");
                case 19 ->
                    this.txtSol.setText("Tu letra del DNI es : L");
                case 20 ->
                    this.txtSol.setText("Tu letra del DNI es : C");
                case 21 ->
                    this.txtSol.setText("Tu letra del DNI es : K");
                case 22 ->
                    this.txtSol.setText("Tu letra del DNI es : E");

            }

        }

    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtSol;
    // End of variables declaration//GEN-END:variables
}
