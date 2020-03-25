package pk_SuperBuscaMinas;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SuperBuscaMinas {


	private static final int WINDOW_HORIZONTAL_SIZE = 500;
	private static final int WINDOW_VERTICAL_SIZE = 500;
	private JFrame frmBuscaMinas;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperBuscaMinas window = new SuperBuscaMinas();
					window.frmBuscaMinas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SuperBuscaMinas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuscaMinas = new JFrame();
		frmBuscaMinas.setTitle("Busca Minas");
		frmBuscaMinas.setBounds(0, 0, WINDOW_HORIZONTAL_SIZE, WINDOW_VERTICAL_SIZE);
		frmBuscaMinas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmBuscaMinas.getContentPane().setLayout(null);	
		Tablero tablero = new Tablero();
		frmBuscaMinas.getContentPane().add(tablero.crearPanelBuscaMinas());		
	}
}
