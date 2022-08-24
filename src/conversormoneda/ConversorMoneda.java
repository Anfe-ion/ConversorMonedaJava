package conversormoneda;

import cl.monedas.Conversion;
import javax.swing.JOptionPane;

import COP.funciones.Funciones;

public class ConversorMoneda {

    public static void main(String[] args) {

//        Variables Globales
        String opcionElejida;
        double pesos = 0;
        double dolar = 0, euro = 0, libra_esterlina = 0, yen_japones = 0, won_surcoreano = 0;
        int inicio = 0;
        double dineroConvertido = 0;
        String monedaConvertir;
        
//        Clases template's
        Funciones funcion = new Funciones();
        Conversion convertir = new Conversion();

//        Arrays de Objetos
        String[] opcionesDeMenu = {
            "Seleccione...",
            "Conversor de Moneda"
        };

        String[] tipoDeMonedas = {
            "De Pesos a Dolar",
            "De Pesos a Euro",
            "De Pesos a Libras",
            "De Pesos a Yen",
            "De Pesos a Won",
            
            "De Dolar a Pesos",
            "De Euro a Pesos",
            "De Libras a Pesos",
            "De Yen a Pesos",
            "De Won a Pesos"
        };

        while (inicio != 1) {
            opcionElejida = funcion.ComboBoxDialog("Seleccione una opción de conversión", -1, opcionesDeMenu);

            if (opcionElejida != null) {
                try {
                    switch (opcionElejida) {
                        case "Conversor de Moneda":
                            String dineroIngresado = funcion.InputBoxDialog("Ingresa la cantidad", 3);

                            if (!funcion.fieldEmpty(dineroIngresado)) 
                            {
                                dineroConvertido = Double.parseDouble(dineroIngresado);
                                monedaConvertir = funcion.ComboBoxDialog("¿A cuál moneda quieres convertir?", -1, tipoDeMonedas);

                                if (monedaConvertir.equalsIgnoreCase("de pesos a dolar")) {
                                    dolar = convertir.PesosColombianosADolar(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + String.format("%.2f", dolar) + " Dolares", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de dolar a pesos")) {
                                    pesos = convertir.DolarAPesosColombianos(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + pesos + " Pesos Colombianos", 1);
                                }   


                                

                                if (monedaConvertir.equalsIgnoreCase("de pesos a euro")) {
                                    euro = convertir.PesosColombianosAEuro(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + String.format("%.2f", euro) + " Euro", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de euro a pesos")) {
                                    pesos = convertir.EuroAPesosColombianos(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + pesos + " Pesos Colombianos", 1);
                                }   



                                
                                if (monedaConvertir.equalsIgnoreCase("de pesos a libras")) {
                                    libra_esterlina = convertir.PesosColombianosALibras(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + String.format("%.2f", libra_esterlina) + " Libras Esterlina", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de libras a pesos")) {
                                    pesos = convertir.LibrasAPesosColombianos(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + pesos + " Pesos Colombianos", 1);
                                }



                                
                                if (monedaConvertir.equalsIgnoreCase("de pesos a yen")) {
                                    yen_japones = convertir.PesosColombianosAYen(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + String.format("%.2f", yen_japones) + " Yen Japónes", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de yen a pesos")) {
                                    pesos = convertir.YenAPesosColombianos(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + pesos + " Pesos Colombianos", 1);
                                } 




                                if (monedaConvertir.equalsIgnoreCase("de pesos a won")) {
                                    won_surcoreano = convertir.PesosColombianosAWon(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + String.format("%.2f", won_surcoreano) + " Won SurCoreanos", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de won a pesos")) {
                                    pesos = convertir.WonAPesosColombianos(dineroConvertido);
                                    funcion.MessageBox("Tienes $" + pesos + " Pesos Colombianos", 1);
                                }
                            } else {
                                funcion.MessageBox("Debe ingresar un valor, para continuar", 2);
                            }
                            break;

                        default:
                            funcion.MessageBox("Opción no valida, intente nuevamente", 2);
                    }

                } catch (Exception e) {
                    funcion.MessageBox("Error, comuniquese con su administrador", 0);
                    System.err.println(e.getMessage());
                }
            }
            
            
            inicio = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Conversor de Monedas/Temperaturas", JOptionPane.YES_NO_CANCEL_OPTION);
            if (inicio == 1 || inicio == 2) {
                funcion.MessageBox("Programa terminado", 1);
                break;
            }
        }
    }
}
