package src;

import javax.swing.JOptionPane;

public class ContinuarPrograma {

	public static double Continuar() {
		

		int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
		if (confirmacion == JOptionPane.YES_OPTION) {
		    PanelPrincipal pantalla1 = new PanelPrincipal();
		    pantalla1.setVisible(true);
		} else {
		    JOptionPane.showMessageDialog(null, "Fin del programa", "Adiós", JOptionPane.INFORMATION_MESSAGE);
		}
		return confirmacion;

    }

}
