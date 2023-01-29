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
public class Funciones {
    ConvertirMonedas monedas = new ConvertirMonedas();
    ConversorTemperatura vtemperatura = new ConversorTemperatura();
    
    public void ConvertirMonedas(double valorRecibido){
        String Opcion = (JOptionPane.showInputDialog(null, 
                "Elije moneda a convertir tu dinero", "Moneda Converse",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                {"De Pesos Colombiano a Dolar estadounidense", "De Pesos Colombianos a Euro","De Pesos Colombianos a Won Coreano","De Pesos Colombianos a Dolar canadiense","De Pesos Colombianos a Pesos Mexicanos"}, "Seleccion")).toString();
        switch(Opcion){
            case "De Pesos Colombiano a Dolar estadounidense":
                monedas.ConvertirPesoColombianoADolar(valorRecibido);
                break;
            case "De Pesos Colombianos a Euro":
                monedas.ConvertirPesoColombianoAEuro(valorRecibido);
                break;
            case "De Pesos Colombianos a Won Coreano":
                monedas.ConvertirPesoColombianoAWon(valorRecibido);
                break;
            case "De Pesos Colombianos a Dolar canadiense":
                monedas.ConvertirPesoColombianoADolarCanadiense(valorRecibido);
                break; 
            case "De Pesos Colombianos a Pesos Mexicanos":
                monedas.ConvertirPesoColombianoAPesoMexicano(valorRecibido);
                break;     
            default:
	        break;
        }
    }
    
    public void ConvertirTemperatura(double temperatura){
        String Opcion = (JOptionPane.showInputDialog(null, 
                "Elije Tipo de Temperatura a convertir ", "Conversor de Temperatura",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                {"De Fahrenhe A Celsius", "De Celsius A Fahrenhe","De Fahrenhe A Kelvin","De Kelvin A Fahrenhe","De Kelvin A Celsius","De Celsius A Kelvin"}, "Seleccion")).toString();
        switch(Opcion){
            case "De Fahrenhe A Celsius":
                vtemperatura.fahrenheAcelsius(temperatura);
                break;
            case "De Celsius A Fahrenhe":
               vtemperatura.celsiusAfahrenhe(temperatura);
                break;
            case "De Fahrenhe A Kelvin":
                vtemperatura.fahrenheAkelvin(temperatura);
                break;
            case "De Kelvin A Fahrenhe":
                vtemperatura.kelvinAfahrenhe(temperatura);
                break; 
            case "De Kelvin A Celsius":
                vtemperatura.kelvinAcelsius(temperatura);
                break;
            case "De Celsius A Kelvin":
                vtemperatura.celsiusAkelvin(temperatura);
                break;    
                
            default:
	        break;
        }
    }
    
}
