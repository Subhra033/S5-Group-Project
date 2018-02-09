

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;

public class page_3e_vii extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_3e_i frame = new page_3e_i();
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
	public page_3e_vii() {
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setTitle("Newlife hospital");
		setIconImage(Toolkit.getDefaultToolkit().getImage(page_3e_i.class.getResource("/image/hospital-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 458);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(177, 14, 349, 398);
		contentPane.add(panel_2);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setLayout(null);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number:");
		lblRegistrationNumber.setBounds(10, 51, 126, 14);
		lblRegistrationNumber.setFont(new Font("Dialog", Font.BOLD, 11));
		lblRegistrationNumber.setForeground(Color.WHITE);
		panel_2.add(lblRegistrationNumber);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 69, 331, 22);
		panel_2.add(textArea);
		
		JLabel lblAddPatient = new JLabel("Discharge");
		lblAddPatient.setBounds(10, 11, 331, 36);
		lblAddPatient.setIcon(new ImageIcon(page_3e_vii.class.getResource("/image/user-remove-icon.png")));
		lblAddPatient.setBackground(Color.GRAY);
		lblAddPatient.setForeground(Color.LIGHT_GRAY);
		lblAddPatient.setFont(new Font("Rainbow Bridge Personal Use", Font.PLAIN, 25));
		lblAddPatient.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblAddPatient);
		
		JButton btnSubmit = new JButton("Release Patient");
		btnSubmit.setBackground(new Color(220, 20, 60));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnSubmit.setBounds(63, 360, 223, 27);
		panel_2.add(btnSubmit);
		
		table = new JTable();
		table.setBounds(10, 118, 331, 230);
		panel_2.add(table);
		
		JLabel lblDischargePatient = new JLabel(" Patient Details");
		lblDischargePatient.setForeground(Color.WHITE);
		lblDischargePatient.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDischargePatient.setBounds(10, 99, 126, 14);
		panel_2.add(lblDischargePatient);
		
		Panel panel = new Panel();
		panel.setBounds(0, 178, 721, 241);
		panel.setBackground(new Color(220, 20, 60));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Back");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(220, 20, 60));
		button.setIcon(new ImageIcon(page_3e_i.class.getResource("/image/arrow-back-1-icon.png")));
		button.setBounds(584, 171, 125, 58);
		panel.add(button);
	}
}
