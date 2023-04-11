package src;

import javax.swing.JOptionPane;

public class ObtenerValor {
	
	static double numero = 0;
	
	public static double obtenerNumero() {
		
		
	    boolean flag = false;
	   
	        String respuesta = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
	        do {
	        	 try {
	            numero = Double.parseDouble(respuesta);
	            flag = true;
	            
	        } catch (NumberFormatException e) {
	           JOptionPane.showMessageDialog(null, "La respuesta no es un número válido.");
	            numero = -1;
	           
	        }
	        break;
	        }while(flag != true);
	    return numero;
	}
	
	}

