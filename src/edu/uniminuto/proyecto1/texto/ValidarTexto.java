package edu.uniminuto.proyecto1.texto;

import edu.uniminuto.proyecto1.pantalla.OutputFrame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * La clase ValidarTexto.java contiene los métodos necesarios para trabajar las
 * búsquedas u ocurrencias de un texto buscado.
 *
 * @author fbeltra6uniminuto.edu.co
 * @version 1.0
 * @since 16-11-2016
 */
public class ValidarTexto {

    //Delcaracion de la clase OutputFrame
    private OutputFrame outputFrame;

    /**
     * El método buscarOcurrencias recibe como parametros un texto y un texto a
     * buscar. Se encarga de verificar el contenido del texto y el numero de
     * ocurrencias del texto buscado.
     *
     * @param textoCargado
     * @param textoBuscado
     */
    public void buscarOcurrencias(String textoCargado, String textoBuscado) {
        //Nueva instancia de la clase OutputFrame();
        outputFrame = new OutputFrame();
        int index = 0;
        int count = 0;
        List<Integer> posiciones = new ArrayList<>();
        boolean existe = textoCargado.contains(textoBuscado);
        if (existe) {
            for (index = textoCargado.indexOf(textoBuscado); index >= 0; index = textoCargado.indexOf(textoBuscado, index + 1)) {
                //Agrega las posiciones de las ocurrencias a la lista de posiciones
                posiciones.add(index);
                count++;
            }
        }
        outputFrame = new OutputFrame();
        outputFrame.setResultado(textoBuscado, existe, Integer.toString(count), textoCargado, posiciones);
        outputFrame.setVisible(true);
    }

    public String separarCadena(String texto) {
        StringBuilder cadena = new StringBuilder();
        String[] auxText = texto.split("\\s+");
        for (int i = 0; i < auxText.length; i++) {
            auxText[i] = invertirTexto(auxText[i]);
            cadena = cadena.append(" ").append(auxText[i]);
        }
        return cadena.toString();
    }

    /**
     * Método invertirTexto recibe un String y reversa el texto usando
     * recursividad.
     *
     * @param texto es el texto a invertir
     * @return texto
     */
    public String invertirTexto(String texto) {

        int ultimo = texto.length() - 1;
        if (ultimo >= 0) {
            texto = texto.charAt(ultimo) + invertirTexto(texto.substring(0, ultimo));
            return texto;
        } else {
            return "";
        }
    }

}
