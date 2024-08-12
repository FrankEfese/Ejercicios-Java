package ap2.pkg14;

public class IGU extends javax.swing.JFrame {

    public IGU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spnNum = new javax.swing.JSpinner();
        btnGenerar = new javax.swing.JButton();
        txtSol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Selecciona un numero : ");

        spnNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        txtSol.setEditable(false);
        txtSol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSol.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSol, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(spnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtSol, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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

        int num = (Integer) this.spnNum.getValue();
        int decena = num / 10;
        int unidad = num % 10;

        if (num >= 0 && num < 16) {

            switch (num) {

                case 0 ->
                    this.txtSol.setText("CERO");
                case 1 ->
                    this.txtSol.setText("UNO");
                case 2 ->
                    this.txtSol.setText("DOS");
                case 3 ->
                    this.txtSol.setText("TRES");
                case 4 ->
                    this.txtSol.setText("CUATRO");
                case 5 ->
                    this.txtSol.setText("CINCO");
                case 6 ->
                    this.txtSol.setText("SEIS");
                case 7 ->
                    this.txtSol.setText("SIETE");
                case 8 ->
                    this.txtSol.setText("OCHO");
                case 9 ->
                    this.txtSol.setText("NUEVE");
                case 10 ->
                    this.txtSol.setText("DIEZ");
                case 11 ->
                    this.txtSol.setText("ONCE");
                case 12 ->
                    this.txtSol.setText("DOCE");
                case 13 ->
                    this.txtSol.setText("TRECE");
                case 14 ->
                    this.txtSol.setText("CATORCE");
                case 15 ->
                    this.txtSol.setText("QUINCE");

            }

        } else {

            if (unidad == 0) {

                switch (num) {

                    case 20 ->
                        this.txtSol.setText("VEINTE");
                    case 30 ->
                        this.txtSol.setText("TREINTA");
                    case 40 ->
                        this.txtSol.setText("CUARENTA");
                    case 50 ->
                        this.txtSol.setText("CINCUENTA");
                    case 60 ->
                        this.txtSol.setText("SESENTA");
                    case 70 ->
                        this.txtSol.setText("SETENTA");
                    case 80 ->
                        this.txtSol.setText("OCHENTA");
                    case 90 ->
                        this.txtSol.setText("NOVENTA");

                }

            } else {

                if ((decena == 1 || decena == 2) && unidad != 0 && num > 15) {

                    String txt = "";

                    switch (decena) {

                        case 1 ->
                            txt += "DIECI";
                        case 2 ->
                            txt += "VEINTI";
                    }

                    switch (unidad) {

                        case 1 ->
                            txt += "UNO";

                        case 2 ->
                            txt += "DOS";
                        case 3 ->
                            txt += "TRES";
                        case 4 ->
                            txt += "CUATRO";
                        case 5 ->
                            txt += "CINCO";
                        case 6 ->
                            txt += "SEIS";
                        case 7 ->
                            txt += "SIETE";
                        case 8 ->
                            txt += "OCHO";
                        case 9 ->
                            txt += "NUEVE";

                    }

                    this.txtSol.setText(txt);

                } else {

                    String texto = "";

                    switch (decena) {

                        case 1 ->
                            texto += "DIEZ";

                        case 2 ->
                            texto += "VEINTE";
                        case 3 ->
                            texto += "TREINTA";
                        case 4 ->
                            texto += "CUARENTA";
                        case 5 ->
                            texto += "CINCUENTA";
                        case 6 ->
                            texto += "SESENTA";
                        case 7 ->
                            texto += "SETENTA";
                        case 8 ->
                            texto += "OCHENTA";
                        case 9 ->
                            texto += "NOVENTA";

                    }

                    texto += " Y ";

                    switch (unidad) {

                        case 1 ->
                            texto += "UNO";

                        case 2 ->
                            texto += "DOS";
                        case 3 ->
                            texto += "TRES";
                        case 4 ->
                            texto += "CUATRO";
                        case 5 ->
                            texto += "CINCO";
                        case 6 ->
                            texto += "SEIS";
                        case 7 ->
                            texto += "SIETE";
                        case 8 ->
                            texto += "OCHO";
                        case 9 ->
                            texto += "NUEVE";

                    }

                    this.txtSol.setText(texto);

                }
            }

        }


    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnNum;
    private javax.swing.JTextField txtSol;
    // End of variables declaration//GEN-END:variables
}
