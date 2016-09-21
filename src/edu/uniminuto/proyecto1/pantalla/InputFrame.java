package edu.uniminuto.proyecto1.pantalla;

import edu.uniminuto.proyecto1.texto.ValidarTexto;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.io.FilenameUtils;

/**
 * La clase InputFrame.java extiende de la clase javax.swing.JFrame. Contiene el
 * diseño y configuración para realizar la búsqueda de un texto dentro de otro,
 * permite las opciones de cargar un texto por medio de un JTextArea o elegir un
 * archivo local por medio de un JFileChooser.
 *
 * @author fbeltra6uniminuto.edu.co
 * @version 1.0
 * @since 16-11-2016
 */
public class InputFrame extends JFrame {

    private boolean opcion = false;
    private File selectedFile;
    private OutputFrame resultadoFrame;
    private ValidarTexto validarTexto;
    private String textoCargado = "";
    private String textoBuscado = "";

    /**
     * Constructor de la clase crea un nuevo form PantallaFrame
     */
    public InputFrame() {
        initComponents();
    }

    /**
     *
     * Este método es llamado desde dentro del constructor para inicializar el
     * formulario. ADVERTENCIA : NO modifique el código . El contenido de este
     * método es siempre Regenerados por el editor de formularios de Netbeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        digitarTextoRB = new javax.swing.JRadioButton();
        cargarArchivoRB = new javax.swing.JRadioButton();
        LABEL1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        LABEL2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        LABEL3 = new javax.swing.JLabel();
        pathTF = new javax.swing.JTextField();
        cargarArchivoB = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        textoBuscadoTF = new javax.swing.JTextField();
        LABEL4 = new javax.swing.JLabel();
        buscarB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscador de Textos");
        setLocationByPlatform(true);
        setResizable(false);

        buttonGroup.add(digitarTextoRB);
        digitarTextoRB.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N
        digitarTextoRB.setText("Digitar Texto");
        digitarTextoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitarTextoRBActionPerformed(evt);
            }
        });

        buttonGroup.add(cargarArchivoRB);
        cargarArchivoRB.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N
        cargarArchivoRB.setText("Cargar archivo");
        cargarArchivoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoRBActionPerformed(evt);
            }
        });

        LABEL1.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        LABEL1.setText("Marque una opcion");

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setEnabled(false);
        jScrollPane1.setViewportView(textArea);

        LABEL2.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        LABEL2.setText("Texto a evaluar:");
        LABEL2.setEnabled(false);

        LABEL3.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        LABEL3.setText("Cargar un archivo");
        LABEL3.setEnabled(false);

        pathTF.setEditable(false);
        pathTF.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N
        pathTF.setEnabled(false);

        cargarArchivoB.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N
        cargarArchivoB.setText("Cargar Archivo");
        cargarArchivoB.setEnabled(false);
        cargarArchivoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoBActionPerformed(evt);
            }
        });

        textoBuscadoTF.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N

        LABEL4.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 1, 14)); // NOI18N
        LABEL4.setText("Texto a buscar:");

        buscarB.setFont(new java.awt.Font("RotisSansSerifW01-Bold", 0, 14)); // NOI18N
        buscarB.setText("Buscar");
        buscarB.setEnabled(false);
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textoBuscadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LABEL3)
                                .addComponent(LABEL2))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pathTF)
                            .addGap(18, 18, 18)
                            .addComponent(cargarArchivoB))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(digitarTextoRB)
                        .addGap(60, 60, 60)
                        .addComponent(cargarArchivoRB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LABEL1)
                        .addGap(63, 63, 63)))
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LABEL1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitarTextoRB)
                    .addComponent(cargarArchivoRB))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LABEL2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LABEL3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargarArchivoB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pathTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(LABEL4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoBuscadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarB))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Captura los eventos del componente JRadioButton digitarTextoRB.
     *
     * @param evt
     */
    private void digitarTextoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitarTextoRBActionPerformed
        //Valida si el radioButton digitarTexto fue seleccionado
        if (digitarTextoRB.isSelected()) {
            opcion = true;

            //Habilitar componentes
            LABEL2.setEnabled(opcion);
            textArea.setText("");
            textArea.setEnabled(opcion);
            textArea.setEditable(opcion);
            buscarB.setEnabled(opcion);

            //Deshabilitar componentes
            LABEL3.setEnabled(!opcion);
            pathTF.setEnabled(!opcion);
            pathTF.setText("");
            cargarArchivoB.setEnabled(!opcion);

        }
    }//GEN-LAST:event_digitarTextoRBActionPerformed

    /**
     * Captura los eventos del componente JRadioButton cargarArchivoRB
     *
     * @param evt
     */
    private void cargarArchivoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoRBActionPerformed
        //Valida si el radioButton cargarArchivo fue seleccionado
        if (cargarArchivoRB.isSelected()) {
            opcion = true;

            //Habilitar componentes
            LABEL3.setEnabled(opcion);
            pathTF.setEnabled(opcion);
            cargarArchivoB.setEnabled(opcion);
            textArea.setText("");
            buscarB.setEnabled(opcion);

            //Deshabilitar componentes
            LABEL2.setEnabled(!opcion);
            textArea.setEnabled(!opcion);
        }
    }//GEN-LAST:event_cargarArchivoRBActionPerformed

    /**
     * Captura los eventos del componente JButton cargarArchivoB
     *
     * @param evt
     */
    private void cargarArchivoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoBActionPerformed
        //Deja en blanco el componente textArea
        textArea.setText("");
        //Deja en null la variable String textoCargado
        textoCargado = null;
        //Crea un nuevo componente JFileChooser para buscar un archivo local
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            //Asigna el archivo seleccionado a la variable File selectedFile
            selectedFile = fileChooser.getSelectedFile();
            if (selectedFile.canRead()) {
                //Asigna la ruta completa del archivo seleccionado a la variable absolutePath
                String absolutePath = selectedFile.getAbsolutePath();
                /*Obtiene la extension del archivo seleccionado 
            por medio del metodo getExtension de la clase
            FilenameUtil de la libreria Commons-io*/
                String extension = FilenameUtils.getExtension(absolutePath);
                //Valida que la extension corresponda a un archivo de texto
                if (extension.equals("txt")) {
                    //Setea el valor de la ruta completa del archivo seleccionado a la caja de texto pathTF
                    pathTF.setText(absolutePath);
                    try {
                        try (Scanner scanner = new Scanner(selectedFile)) {
                            StringBuilder builder = new StringBuilder();
                            while (scanner.hasNext()) {
                                builder.append("").append(scanner.nextLine().trim());
                            }
                            textoCargado = builder.toString();
                        }
                        //Valida si el textoCargado está vació
                        if (textoCargado != null) {
                            //Sí no está vacío carga habilita el componente textArea y le setea el texto cargado del archivo
                            LABEL2.setEnabled(true);
                            textArea.setText(textoCargado);
                            textArea.setEnabled(true);
                            textArea.setEditable(false);
                        } else {
                            pathTF.setText("");
                            //Sí está vació muestra un mensaje de error
                            JOptionPane.showMessageDialog(
                                    null,
                                    "El archivo está vacío",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (IOException e) {
                        //Captura la excepción y la muestra
                        JOptionPane.showMessageDialog(null, e, "Error del sistema", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    //Sí la extension no corresponde a un archivo de texto muestra un mensaje de advertencia
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor seleccione un archivo de texto con extensión: .txt",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    //Asigna null a la variable File selectedFile
                    selectedFile = null;
                    //Setea en blanco las variables y cajas de texto usadas
                    absolutePath = "";
                    extension = "";
                    pathTF.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "No tiene permisos para leer el archivo",
                        "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_cargarArchivoBActionPerformed

    /**
     * Captura los eventos del componente JButton buscarB
     *
     * @param evt
     */
    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        //Asigna el valor de la caja de texto textoBuscadoTF a la variable textoBuscado
        textoBuscado = textoBuscadoTF.getText().trim();
        //Se crea una nueva instancia de la clase ValidarTexto
        validarTexto = new ValidarTexto();
        //Valida el contenido y longitud del texto buscado
        if (textoBuscado.equals("") || textoBuscado.length() <= 0) {
            //Sí el texto está vacío muestra un mensaje de advertencia
            JOptionPane.showMessageDialog(
                    null,
                    "Por favor digite la palabra a buscar en intente nuevamente",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (textArea.getText().equals("") || textArea.getText().length() <= 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "No se ha cargado ningún texto",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } //Valida si el componente JRadioButton digitarTextoRB fue seleccionado
        else if (digitarTextoRB.isSelected()) {
            //Asigna el valor del componente textArea a la variable textoCargado
            textoCargado = textArea.getText().trim();
            //Valida si el texto cargado está vacío
            if (textoCargado.equals("") || textoCargado.length() <= 0) {
                //Sí el texto cargado está vacío muestra un mensaje de advertencia
                JOptionPane.showMessageDialog(
                        null,
                        "Por favor digite un texto a evaluar",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                //Sí el texto cargado no está vacío oculta el Frame actual y llama al método buscarOcurrencias con los valores capturados
                this.setVisible(false);
                validarTexto.buscarOcurrencias(textoCargado, textoBuscado);
            }
        } else if (cargarArchivoRB.isSelected()) {
            //Sí fue seleccionado el componente JRadioButton cargarArchivoRB
            //Esconde el frame actual y llama al método buscarOcurrencias con los valores capturados
            this.setVisible(false);
            validarTexto.buscarOcurrencias(textoCargado, textoBuscado);
        }
    }//GEN-LAST:event_buscarBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABEL1;
    private javax.swing.JLabel LABEL2;
    private javax.swing.JLabel LABEL3;
    private javax.swing.JLabel LABEL4;
    private javax.swing.JButton buscarB;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cargarArchivoB;
    private javax.swing.JRadioButton cargarArchivoRB;
    private javax.swing.JRadioButton digitarTextoRB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField pathTF;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textoBuscadoTF;
    // End of variables declaration//GEN-END:variables

}
