package src;

import javax.swing.JOptionPane;

public class Temp {

	public static double temperatura(){

	        String[] optionsToChoose = {"Convertir de ºC a ºF", "Convertir de ºF a ºC", "Convertir de K a ºC", "Convertir de ºC a K",
	                "Convertir de ºF a K", "Convertir de K a ºF"};

	        String conversion = (String) JOptionPane.showInputDialog(null, "Conversion de Temperatura", "TEMPERATURA",
	                JOptionPane.QUESTION_MESSAGE, null,
	                optionsToChoose,
	                optionsToChoose[0]);

	        double temp = ObtenerValor.numero;

	        double result = 0;
	        String message = "";

	        switch (conversion) {
	        case "Convertir de ºC a ºF":
	            result = (temp * 1.8) + 32;
	            message = temp + " ºC equivale a " + result + " ºF";
	            break;
	        case "Convertir de ºF a ºC":
	            result = (temp - 32) / 1.8;
	            message = temp + " ºF equivale a " + result + " ºC";
	            break;
	        case "Convertir de K a ºC":
	            result = temp - 273.15;
	            message = temp + " K equivale a " + result + " ºC";
	            break;
	        case "Convertir de ºC a K":
	            result = temp + 273.15;
	            message = temp + " ºC equivale a " + result + " K";
	            break;
	        case "Convertir de ºF a K":
	            result = (temp + 459.67) * 5 / 9;
	            message = temp + " ºF equivale a " + result + " K";
	            break;
	        case "Convertir de K a ºF":
	            result = temp * 9 / 5 - 459.67;
	            message = temp + " K equivale a " + result + " ºF";
	            break;
	        default:
	            message = "Selección inválida";
	    }
	        JOptionPane.showMessageDialog(null, message, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	        ContinuarPrograma.Continuar();
			return result;

	    }	
		
}
