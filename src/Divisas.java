package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Divisas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisas frame = new Divisas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Divisas() {
		setType(Type.UTILITY);
		setTitle("MONEDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elige la Moneda que deseas convertir a RD$ o Viceversa");
		lblNewLabel.setBounds(24, 20, 401, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		String[] opciones = {"De peso RD$ a Dólar", "De peso RD$ a Euros","De peso RD$ a Yen Japonés",
		"De peso RD$ a Won sul-coreano","De peso RD$ a Libras Esterlinas","De Dolar a  Peso Dominicano RD$", "De Euro a  Peso Dominicano RD$",
		"De Yen Japonés a  Peso Dominicano RD$","De Won sul-coreano a  Peso Dominicano RD$","De Libras Esterlinas a  Peso Dominicano RD$"};
		
		JComboBox comboBoxSelecMoneda = new JComboBox();
		
		for (String select : opciones) {
			comboBoxSelecMoneda.addItem(select);
		}
		
		
		comboBoxSelecMoneda.setBounds(24, 59, 382, 27);
		contentPane.add(comboBoxSelecMoneda);
		
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = comboBoxSelecMoneda.getSelectedIndex();
				double divisa = 0;
				Monedas monedas = new Monedas();
				 switch(selectedIndex) {
				 
				 case 0:
				        // De peso RD$ a Dólar
					 	divisa =ObtenerValor.numero * monedas.PesoDolar ; 
					 
					 JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "USD$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
					 
				        break;
				    case 1:
				        // De peso RD$ a Euros
				    	divisa = ObtenerValor.numero * monedas.PesoEuro;
				    	 JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "EUR$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				    case 2:
				        // De peso RD$ a Yen Japonés
				    	 divisa = ObtenerValor.numero * monedas.PesoYen;
				    	 JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "JPY$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				    case 3:
				        // De peso RD$ a Won sul-coreano
				    	 divisa = ObtenerValor.numero * monedas.PesoWon;
				    	 JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "KRW$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				    case 4:
				        // De peso RD$ a Libras Esterlinas
				    	   divisa = ObtenerValor.numero * monedas.PesoLibraEst;
				    	   JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "GBP$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				    case 5:
				        // De Dolar a  Peso Dominicano RD$
				    	 divisa = ObtenerValor.numero * monedas.DolarPeso;
				    	JOptionPane.showMessageDialog(null, "su valor en Peso es: " + divisa+ "RD$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				    case 6:
				        // De Euro a  Peso Dominicano RD$
				    	 divisa = ObtenerValor.numero * monedas.EuroPeso;
				    	 JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "RD$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				    case 7:
				        // De Yen Japonés a  Peso Dominicano RD$
				    	 divisa = ObtenerValor.numero * monedas.YenPeso;
				    	 JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "RD$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				    case 8:
				        // De Won sul-coreano a  Peso Dominicano RD$
				    	 divisa = ObtenerValor.numero * monedas.WonPeso;
				    	 JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "RD$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				    case 9:
				        // De Libras Esterlinas a  Peso Dominicano RD$
				    	 divisa = ObtenerValor.numero * monedas.PesoLibraEst;
				    	 JOptionPane.showMessageDialog(null, "su valor en dolares es: " + divisa+ "RD$", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				        break;
				               
				 	}	
				 dispose();
				 ContinuarPrograma.Continuar();
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOK.setBounds(70, 122, 110, 37);
		contentPane.add(btnOK);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal pantalla1 = new PanelPrincipal();
				pantalla1.setVisible(true);
	                dispose();
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBounds(223, 122, 103, 37);
		contentPane.add(btnVolver);
		
		
	}

}
