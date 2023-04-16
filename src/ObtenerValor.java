package src;

import javax.swing.JOptionPane;

public class ObtenerValor {
	
	static double numero = 0;
	
	public static double obtenerNumero() {
		
		
	    boolean flag = false;
	   
	        String respuesta = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
	        if(respuesta == null ) {
	        	
	        	return 0;
	        } 
	        
	        
	        do {
	        	 try {
	        		 
	        		 if (respuesta.trim().isEmpty()) {
	                     JOptionPane.showMessageDialog(null, "Debe ingresar un valor","Error",JOptionPane.WARNING_MESSAGE);
	                   //  numero = -1;
	                     break;
	                 }else {
	                	 double temp = Double.parseDouble(respuesta);
	                     if (temp <= 0) {
	                         JOptionPane.showMessageDialog(null, "El valor debe ser mayor a cero", "Error", JOptionPane.WARNING_MESSAGE);
	                         numero = 0;
	                         break;
	                     }
	                 
	                     numero = temp;
	                     flag = true;
	                 }
	        } catch (NumberFormatException e) {
	           JOptionPane.showMessageDialog(null, "No se permiten letras o caracteres especiales","Error",JOptionPane.WARNING_MESSAGE);
	           numero = 0;
	            break;
	           
	        }
	         
	        	 
	        break;
	        }while(!flag);
	    return numero;
	
	
	}
}

