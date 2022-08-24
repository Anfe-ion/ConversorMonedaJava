package cl.monedas;

public class Conversion {
    
   Monedas moneda = new Monedas();   

   public double PesosColombianosADolar(double pesos) {
       return (pesos / moneda.CoversionDolar);
   }
   
   public double DolarAPesosColombianos(double dolar) {
       
       return (dolar * moneda.CoversionDolar);
   }
   
   

   public double PesosColombianosAEuro(double pesos) {
       return (pesos / moneda.ConversionEuro);
   }
   
   public double EuroAPesosColombianos(double euro) {
       return (euro * moneda.ConversionEuro);
   }
   
   

   public double PesosColombianosALibras(double pesos) {
       return (pesos / moneda.ConversionLibras);
   }
   
   public double LibrasAPesosColombianos(double libras) {
       
       return (libras * moneda.ConversionLibras);
   }   
   

   public double PesosColombianosAYen(double pesos) {
       return (pesos / moneda.ConversionYen);
   }
   
   public double YenAPesosColombianos(double yen) {
       
       return (yen * moneda.ConversionYen);
   }
   

   public double PesosColombianosAWon(double pesos) {
       return (pesos / moneda.ConversionWon);
   }
   
   public double WonAPesosColombianos(double won) {
       
       return (won * moneda.ConversionWon);
   }
   
}