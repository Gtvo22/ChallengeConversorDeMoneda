/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversoralura;

import javax.swing.*;

/**
 *
 * @author Gustavo Adolfo
 */
public class ConversorAlura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Funciones monedas = new Funciones();
        Funciones temperatura = new Funciones();
        do { 
            String inputOpciones = (JOptionPane.showInputDialog(null, "Seleccione una Opcion de Conversion", "Menu Principal", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
            
            if(inputOpciones!=null)
                switch(inputOpciones){
                    case"Conversor de Moneda": {
                      String input = JOptionPane.showInputDialog("Ingrese un Valor a Convertir a Moneda");
                      double valorRecibido = Double.parseDouble(input);
                      monedas.ConvertirMonedas(valorRecibido);
                      break;
                    }
                    case"Conversor de Temperatura": {
                      String input = JOptionPane.showInputDialog("Ingrese un Valor a Convertir a Temperatura");
                      double valorRecibido = Double.parseDouble(input);
                      temperatura.ConvertirTemperatura(valorRecibido);
                      break;
                    }
                    default:
                       break;

            }else{
                 
                 break;
            }       
            opcion = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?", "Pregunta", 
					JOptionPane.YES_NO_OPTION);
        } while (opcion == 0);
        JOptionPane.showMessageDialog(null, "Programa Finalizado");
    }
}
