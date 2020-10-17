package retana.roger;

import java.util.Random;
import javax.swing.JOptionPane;

public class MASTERMIND extends javax.swing.JPanel {

    String[] codColores = new String[4];
    String[] colores = {"A", "R", "B", "N", "V", "M"};
    String[] codIngresado = new String[4];
    int intentos = 8;

    public MASTERMIND() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        intento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        iniciar = new javax.swing.JButton();
        comparar = new javax.swing.JButton();
        gano = new javax.swing.JLabel();
        perdio = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Intentos");

        intento.setEditable(false);
        intento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite su código");

        codigo.setEditable(false);
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado");

        resultado.setEditable(false);
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        comparar.setText("comparar");
        comparar.setEnabled(false);
        comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compararActionPerformed(evt);
            }
        });

        gano.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        gano.setText("GANÓ");
        gano.setToolTipText("");
        gano.setEnabled(false);

        perdio.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        perdio.setText("PERDIÓ");
        perdio.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intento)
                    .addComponent(codigo)
                    .addComponent(jLabel3)
                    .addComponent(resultado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(gano)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perdio)
                            .addComponent(comparar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comparar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gano)
                    .addComponent(perdio))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void intentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intentoActionPerformed

    }//GEN-LAST:event_intentoActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed

    }//GEN-LAST:event_codigoActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed

    }//GEN-LAST:event_resultadoActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        codigo.setEditable(true);
        comparar.setEnabled(true);
        iniciar.setEnabled(false);
        gano.setEnabled(false);
        perdio.setEnabled(false);
        intentos = 8;

        Random numero = new Random();

        intento.setText(String.valueOf(intentos));

        for (int i = 0; i < codColores.length; i++) {
            codColores[i] = colores[numero.nextInt(colores.length - 1)];
        }

        for (int j = 0; j < codColores.length; j++) {
            System.out.print(codColores[j]);
        }
        System.out.println("\n");
    }//GEN-LAST:event_iniciarActionPerformed

    private void compararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compararActionPerformed

        if (codigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un código de 4 digitos primero");
        } else {

            int aciertosParciales = 0;
            int aciertosTotales = 0;

            try {

                for (int i = 0; i < codIngresado.length; i++) {
                    codIngresado[i] = String.valueOf(codigo.getText().toUpperCase().charAt(i));
                }

            } catch (StringIndexOutOfBoundsException error) {
                JOptionPane.showMessageDialog(null, "El código debe tener 4 digitos");
                
            }

            for (int j = 0; j < codColores.length; j++) {

                if (codIngresado[j].equals(codColores[j])) {
                    aciertosTotales++;
                } else {
                    for (int k = 0; k < codColores.length; k++) {
                        if (codIngresado[j].equals(codColores[k])) {
                            aciertosParciales++;
                            break;
                        }
                    }
                }
            }

            resultado.setText("Aciertos totales " + aciertosTotales + " " + "Aciertos parciales "
                    + aciertosParciales);

            if (aciertosTotales == 4) {
                gano.setEnabled(true);
                codigo.setEditable(false);
                codigo.setText("");
                resultado.setText("");
                comparar.setEnabled(false);
                iniciar.setEnabled(true);
                for (int m = 0; m < codColores.length; m++) {
                    codColores[m] = "";
                }
            } else if (intentos == 0) {
                perdio.setEnabled(true);
                codigo.setEditable(false);
                codigo.setText("");
                resultado.setText("");
                comparar.setEnabled(false);
                iniciar.setEnabled(true);
                for (int m = 0; m < codColores.length; m++) {
                    codColores[m] = "";
                }
            }

            intento.setText(String.valueOf(intentos--));

        }


    }//GEN-LAST:event_compararActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JButton comparar;
    private javax.swing.JLabel gano;
    private javax.swing.JButton iniciar;
    private javax.swing.JTextField intento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel perdio;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
