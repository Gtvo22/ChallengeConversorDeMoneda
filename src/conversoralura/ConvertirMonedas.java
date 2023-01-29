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
public class ConvertirMonedas {
    public void ConvertirPesoColombianoADolar(double valorRecibido){
        double monedaDolar = valorRecibido / 4685.25;
        monedaDolar =(double) Math.round(monedaDolar*100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " +monedaDolar+ " Dolares Estadounidenses");
    }
     public void ConvertirPesoColombianoAEuro(double valorRecibido){
        double monedaEuro = valorRecibido / 5073.82;
        monedaEuro =(double) Math.round(monedaEuro*100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " +monedaEuro+ " Euros");
    }
      public void ConvertirPesoColombianoAWon(double valorRecibido){
        double monedaWon = valorRecibido / 3.78;
        monedaWon =(double) Math.round(monedaWon*100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " +monedaWon+ " Won Coreanos");
    }
       public void ConvertirPesoColombianoADolarCanadiense(double valorRecibido){
        double monedaDolarCanadiense = valorRecibido / 3497.81;
        monedaDolarCanadiense =(double) Math.round(monedaDolarCanadiense*100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " +monedaDolarCanadiense+ " Dolares Canadiense");
    }
        public void ConvertirPesoColombianoAPesoMexicano(double valorRecibido){
        double monedaMexicana = valorRecibido / 250.13;
        monedaMexicana =(double) Math.round(monedaMexicana*100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " +monedaMexicana+ " Pesos Mexicanos");
    }
    
}
