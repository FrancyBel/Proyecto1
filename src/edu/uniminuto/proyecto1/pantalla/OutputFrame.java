package edu.uniminuto.proyecto1.pantalla;

import edu.uniminuto.proyecto1.texto.ValidarTexto;
import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

/**
 * La clase OutputFrame.java extiende de la clase javax.swing.JFrame. Contiene
 * el diseño y configuración para mostrar el resultado de la búsqueda de un
 * texto dentro de otro. Muestra el texto buscado, el texto en que se busca, el
 * número de ocurrencias encontradas.
 *
 * @author fbeltra6uniminuto.edu.co
 * @version 1.0
 * @since 16-11-2016
 */
public class OutputFrame extends JFrame {
    
    private String texto = "";

    /**
     * Constructor de la clase crea un nuevo form OutputFrame
     *
     */
    public OutputFrame() {
        initComponents();
    }

    /**
     * El método setResultado. Recibe parámeros necesarios mostrar el resultado
     * de la búsqueda de un texto dentro de otro.
     *
     * @param textoBuscado es el texto buscado
     * @param encontrado true si el texto fue encontrado, false si el texto no
     * fue encontrado
     * @param numeroOcurrencias es el número de ocurrencias del texto buscado
     * @param textoCargado es el texto cargado por el usuario
     * @param posiciones son las posiciones de las ocurrencias del texto buscado
     */
    public void setResultado(
            String textoBuscado,
            boolean encontrado,
            String numeroOcurrencias,
            String textoCargado,
            List<Integer> posiciones) {
        try {
            //Setea el el texto buscado en la caja de texto palabraBuscadaTF
            palabraBuscadaTF.setText(textoBuscado);
            //Valida sí el texto fue encotnrado
            if (encontrado) {
                //Setea el texto cargado por el usuario en la caja de texto textArea
                textArea.setText(textoCargado);
                //Crea un nuevo Highlighter a partir del la caja de texto textArea
                Highlighter highlighter = textArea.getHighlighter();
                //Crea un nuevo HighlightPainter para ell subrayado de color naranja
                HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.ORANGE);
                //Variable index para la posicion inicial de una ocurrencia
                int index = 0;
                //Variable endIndex para la posicion final de una ocurrencia
                int endIndex = 0;
                //Loop para recorrer el vector con las posiciones de las ocurrencias
                for (int i = 0; i < posiciones.size(); i++) {
                    //Asigna la posicion inicial de la ocurrencia a la variable index
                    index = posiciones.get(i);
                    //Asigna la posicion final de la ocurrencia a la variable endIndex
                    endIndex = index + textoBuscado.length();
                    //Subraya el texto buscado con las posiciones obtenidas
                    highlighter.addHighlight(index, endIndex, painter);
                }
                //Bloquea la opcion de editar la caja de texto textArea
                textArea.setEditable(false);
                //Setea la caja de texto palabraEncontradaTF con el texto SI
                palabraEncontradaTF.setText("SI");
                //Setea la caja de texto numOcurrenciasTF con las ocurrencias encontradas
                numOcurrenciasTF.setText(numeroOcurrencias);
                invertirTextoB.setEnabled(true);
                
            } else {
                //Setea la caja de texto palabraEncontradaTF con el texto NO
                palabraEncontradaTF.setText("NO");
                //Setea la caja de texto numOcurrenciasTF con el valor cero 0
                numOcurrenciasTF.setText("0");
                textArea.setText("No se encontraron ocurrencias");
                //Bloquea la opcion de editar la caja de texto textArea
                textArea.setEditable(false);
                invertirTextoB.setEnabled(false);
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(OutputFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Este método es llamado desde dentro del constructor para inicializar el
     * formulario. ADVERTENCIA : NO modifique el código . El contenido de este
     * método es siempre Regenerados por el editor de formularios de Netbeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        LABEL1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        LABEL4 = new javax.swing.JLabel();
        LABEL5 = new javax.swing.JLabel();
        LABEL6 = new javax.swing.JLabel();
        palabraBuscadaTF = new javax.swing.JTextField();
        palabraEncontradaTF = new javax.swing.JTextField();
        numOcurrenciasTF = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        regresarB = new javax.swing.JButton();
        invertirTextoB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscador de Textos");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(837, 496));
        setMinimumSize(new java.awt.Dimension(616, 490));
        setResizable(false);

        LABEL1.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        LABEL1.setText("Resultados");

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        LABEL4.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        LABEL4.setText("Palabra encontrada:");

        LABEL5.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        LABEL5.setText("Palabra buscada:");

        LABEL6.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        LABEL6.setText("Número de ocurrencias:");

        palabraBuscadaTF.setEditable(false);
        palabraBuscadaTF.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N

        palabraEncontradaTF.setEditable(false);
        palabraEncontradaTF.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N

        numOcurrenciasTF.setEditable(false);
        numOcurrenciasTF.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N

        regresarB.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        regresarB.setText("<< Regresar a Búsqueda");
        regresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBActionPerformed(evt);
            }
        });

        invertirTextoB.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        invertirTextoB.setText("Invertir Texto");
        invertirTextoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertirTextoBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresarB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invertirTextoB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LABEL5)
                                    .addComponent(LABEL4))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(palabraEncontradaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)
                                        .addComponent(LABEL6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numOcurrenciasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(palabraBuscadaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(LABEL1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LABEL1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LABEL5))
                    .addComponent(palabraBuscadaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL4)
                            .addComponent(palabraEncontradaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL6)
                            .addComponent(numOcurrenciasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarB)
                    .addComponent(invertirTextoB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Captura los eventos del componente JButton regresarB
     *
     * @param evt
     */
    private void regresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBActionPerformed
        //Esconde el frame actual
        this.setVisible(false);
        //Muestra el frame InputFrame
        new InputFrame().setVisible(true);
    }//GEN-LAST:event_regresarBActionPerformed

    private void invertirTextoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertirTextoBActionPerformed
        texto = textArea.getText();
        ValidarTexto validarTexto = new ValidarTexto();
        this.setVisible(false);
        validarTexto.buscarOcurrencias(validarTexto.separarCadena(texto), palabraBuscadaTF.getText());

    }//GEN-LAST:event_invertirTextoBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABEL1;
    private javax.swing.JLabel LABEL4;
    private javax.swing.JLabel LABEL5;
    private javax.swing.JLabel LABEL6;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton invertirTextoB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField numOcurrenciasTF;
    private javax.swing.JTextField palabraBuscadaTF;
    private javax.swing.JTextField palabraEncontradaTF;
    private javax.swing.JButton regresarB;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

}
