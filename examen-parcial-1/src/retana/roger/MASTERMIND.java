package retana.roger;

import java.util.Random;

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

        jLabel1 = new javax.swing.JLabel();
        intento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        iniciar = new javax.swing.JButton();
        comparar = new javax.swing.JButton();

        jLabel1.setText("Intentos");

        intento.setEditable(false);
        intento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite su código");

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
        comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(comparar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intento)
                    .addComponent(codigo)
                    .addComponent(jLabel3)
                    .addComponent(resultado))
                .addContainerGap(71, Short.MAX_VALUE))
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
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void intentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intentoActionPerformed

    }//GEN-LAST:event_intentoActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed

    }//GEN-LAST:event_codigoActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed

    }//GEN-LAST:event_resultadoActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        Random numero = new Random();

        intento.setText(String.valueOf(intentos));

        for (int i = 0; i < codColores.length; i++) {
            codColores[i] = colores[numero.nextInt(colores.length - 1)];
        }
    }//GEN-LAST:event_iniciarActionPerformed

    private void compararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compararActionPerformed
        int aciertosParciales = 0;
        int aciertosTotales = 0;

        for (int i = 0; i < codIngresado.length; i++) {
            codIngresado[i] = String.valueOf(codigo.getText().toUpperCase().charAt(i));
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
            System.out.println("GANÓ");
            for (int m = 0; m < codColores.length; m++) {
                codColores[m] = "";
            }
        }
        else if (intentos == 0) {
            System.out.println("PERDIÓ");
            for (int m = 0; m < codColores.length; m++) {
                codColores[m] = "";
            }
        }
        
        intento.setText(String.valueOf(intentos--));
       
    }//GEN-LAST:event_compararActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JButton comparar;
    private javax.swing.JButton iniciar;
    private javax.swing.JTextField intento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
