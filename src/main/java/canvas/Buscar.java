package canvas;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;

public class Buscar {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the application.
	 */
	public Buscar() {
		initialize();
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulte el Producto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 11, 424, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(10, 62, 175, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre producto");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(10, 44, 169, 14);
		frame.getContentPane().add(lblNombre);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(237, 62, 127, 20);
		frame.getContentPane().add(btnBuscar);
		
		table = new JTable();
		table.setBounds(10, 107, 414, 143);
		frame.getContentPane().add(table);
	}
	
	public void run() {
		this.frame.setVisible(true);
		this.initialize();
		
	}
	
	public int anterior() {
		this.frame.setVisible(false);
		Principal principal = new Principal();
		principal.setVisible();
		return 0;
	}
}
