package canvas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 262, 218);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 11, 255, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblqueDeseaHacer = new JLabel("¿Que desea hacer?");
		lblqueDeseaHacer.setBounds(70, 76, 135, 14);
		frame.getContentPane().add(lblqueDeseaHacer);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Buscar buscar = new Buscar();
				buscar.run();
				
			
				
				
			}
			
		});
		btnNewButton.setBounds(10, 133, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ingresar");
		btnNewButton_1.setBounds(147, 133, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
	
	public void setVisible() {
		this.frame.setVisible(true);
		this.initialize();
		
	}
}
