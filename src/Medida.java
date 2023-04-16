package src;

import javax.swing.JOptionPane;

public class Medida {

	 public static double convertirLongitud() {

		        String[] optionsToChoose = {"Convertir de metros a pies", "Convertir de pies a metros", 
		                                    "Convertir de pulgadas a centímetros", "Convertir de centímetros a pulgadas",
		                                    "Convertir de yardas a metros", "Convertir de metros a yardas"};

		        String conversion = (String) JOptionPane.showInputDialog(null, "Conversión de longitud", "LONGITUD",
		                JOptionPane.QUESTION_MESSAGE, null,
		                optionsToChoose,
		                optionsToChoose[0]);

		        double longitud = ObtenerValor.numero;

		        double resultado = 0;
		        String mensaje = "";

		        switch (conversion) {
		            case "Convertir de metros a pies":
		                resultado = longitud * 3.28084;
		                mensaje = longitud + " metros equivale a " + resultado + " pies";
		                break;
		            case "Convertir de pies a metros":
		                resultado = longitud / 3.28084;
		                mensaje = longitud + " pies equivale a " + resultado + " metros";
		                break;
		            case "Convertir de pulgadas a centímetros":
		                resultado = longitud * 2.54;
		                mensaje = longitud + " pulgadas equivale a " + resultado + " centímetros";
		                break;
		            case "Convertir de centímetros a pulgadas":
		                resultado = longitud / 2.54;
		                mensaje = longitud + " centímetros equivale a " + resultado + " pulgadas";
		                break;
		            case "Convertir de yardas a metros":
		                resultado = longitud * 0.9144;
		                mensaje = longitud + " yardas equivale a " + resultado + " metros";
		                break;
		            case "Convertir de metros a yardas":
		                resultado = longitud / 0.9144;
		                mensaje = longitud + " metros equivale a " + resultado + " yardas";
		                break;
		            default:
		                mensaje = "Selección inválida";
		        }

		        JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		        ContinuarPrograma.Continuar();
		        return resultado;
		        
		    }
}
