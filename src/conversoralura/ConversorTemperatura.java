/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversoralura;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Adolfo
 */
public class ConversorTemperatura {
    
    public  static void fahrenheAcelsius(double temperatura){
        double result = (double) (temperatura-32)*5/9;
        double f = (double) Math.round(result*100)/100;
        JOptionPane.showMessageDialog(null, f +" °C");
    }
    //(°C * 9/5) + 32 = °F 
    public  static void celsiusAfahrenhe(double temperatura){
        double result = (double) temperatura*9/5+32;
	double c = (double) Math.round(result*100)/100;
        JOptionPane.showMessageDialog(null, c +" °F");
    }
    public  static void fahrenheAkelvin(double temperatura){
        double result = (double) (temperatura-32)*5/9+273.15;
        double k = (double) Math.round(result*100)/100;
        JOptionPane.showMessageDialog(null, k +" ºK");
    }
     public  static void kelvinAfahrenhe(double temperatura){
        double result = (double) (temperatura-273.15)*5/9+32;
	double f = (double) Math.round(result*100)/100;
        JOptionPane.showMessageDialog(null, f +" ºF");
    }
     public  static void kelvinAcelsius(double temperatura){
        double result = (double) (temperatura-273.15);
	double c = (double) Math.round(result*100)/100;
        JOptionPane.showMessageDialog(null, c +" ºC");
    }
     public  static void celsiusAkelvin(double temperatura){
        double result = (double) (temperatura+273.15);
	double k = (double) Math.round(result*100)/100;
        JOptionPane.showMessageDialog(null, k +" ºK");
    }


}
