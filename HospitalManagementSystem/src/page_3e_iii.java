

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class page_3e_iii extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_3e_iii frame = new page_3e_iii();
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
	public page_3e_iii() {
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setTitle("Newlife hospital");
		setIconImage(Toolkit.getDefaultToolkit().getImage(page_3e_iii.class.getResource("/image/hospital-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 458);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(26, 14, 669, 398);
		contentPane.add(panel_2);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setLayout(null);
		
		JLabel lblAddPatient = new JLabel("View Patient");
		lblAddPatient.setBounds(169, 11, 331, 36);
		lblAddPatient.setIcon(new ImageIcon(page_3e_iii.class.getResource("/image/Actions-view-list-details-icon.png")));
		lblAddPatient.setBackground(Color.GRAY);
		lblAddPatient.setForeground(Color.LIGHT_GRAY);
		lblAddPatient.setFont(new Font("Rainbow Bridge Personal Use", Font.PLAIN, 25));
		lblAddPatient.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblAddPatient);
		
		table = new JTable();
		table.setBounds(20, 59, 637, 265);
		panel_2.add(table);
		
		JButton button = new JButton("Back");
		button.setBounds(542, 336, 115, 58);
		panel_2.add(button);
		button.setForeground(Color.WHITE);
		button.setBackground(Color.DARK_GRAY);
		button.setIcon(new ImageIcon(page_3e_i.class.getResource("/image/arrow-back-1-icon.png")));
		
		Panel panel = new Panel();
		panel.setBounds(0, 178, 721, 241);
		panel.setBackground(new Color(220, 20, 60));
		contentPane.add(panel);
		panel.setLayout(null);
	}
}
