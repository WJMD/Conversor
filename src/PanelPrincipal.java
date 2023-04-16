package src;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelPrincipal frame = new PanelPrincipal();
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
	public PanelPrincipal() {
		setForeground(Color.BLACK);
		setFont(new Font("Georgia", Font.BOLD, 17));
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblTitulo = new JLabel("Seleccione el tipo de Conversion");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		String[] opciones = {"Moneda", "Temperatura", "Medidas"};
		
		JComboBox comboBoxSelecCovercion = new JComboBox();
		comboBoxSelecCovercion.setFont(new Font("Tahoma", Font.BOLD, 14));
		for (String select : opciones) {
			comboBoxSelecCovercion.addItem(select);
		}

		
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int selectedIndex = comboBoxSelecCovercion.getSelectedIndex();
				 double valor = ObtenerValor.obtenerNumero();
				 
				 
				 
				 if (valor <= 0) {
					// JOptionPane.showMessageDialog(null, "Valor inválido.","Error",JOptionPane.WARNING_MESSAGE);
					 dispose();
					 PanelPrincipal pantalla1 = new PanelPrincipal();
						pantalla1.setVisible(true);
			               
					} else {
				 switch(selectedIndex) {
				 case 0:
					 
					
						    dispose(); // Cierra el JFrame actual
						    Divisas divisa = new Divisas();
						    divisa.setVisible(true);
						
				        break;
	                    
	                case 1:
	                	
		                dispose(); // Cierra el JFrame actual
		                Temp.temperatura();
			                
	                    break;
	                case 2:
	                	
		                dispose(); // Cierra el JFrame actual
	                	Medida.convertirLongitud();
			               
	                    break;	              
				 	}
				}
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnOK, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBoxSelecCovercion, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE))
					.addGap(179))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(9)
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBoxSelecCovercion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOK, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
