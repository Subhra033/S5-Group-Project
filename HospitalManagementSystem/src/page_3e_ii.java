

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
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class page_3e_ii extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_3e_ii frame = new page_3e_ii();
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
	public page_3e_ii() {
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
		lblRegistrationNumber.setBounds(20, 53, 126, 14);
		lblRegistrationNumber.setFont(new Font("Dialog", Font.BOLD, 11));
		lblRegistrationNumber.setForeground(Color.WHITE);
		panel_2.add(lblRegistrationNumber);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 70, 173, 22);
		panel_2.add(textArea);
		
		JLabel lblAddPatient = new JLabel("Update Patient");
		lblAddPatient.setBounds(10, 11, 331, 36);
		lblAddPatient.setIcon(new ImageIcon(page_3e_ii.class.getResource("/image/pencil-icon.png")));
		lblAddPatient.setBackground(Color.GRAY);
		lblAddPatient.setForeground(Color.LIGHT_GRAY);
		lblAddPatient.setFont(new Font("Rainbow Bridge Personal Use", Font.PLAIN, 25));
		lblAddPatient.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblAddPatient);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(20, 96, 116, 14);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblName);
		
		JLabel lblAddressLine = new JLabel("Address Line1:");
		lblAddressLine.setBounds(20, 143, 116, 14);
		lblAddressLine.setForeground(Color.WHITE);
		lblAddressLine.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblAddressLine);
		
		JLabel lblAddressLine_1 = new JLabel("Address Line2:");
		lblAddressLine_1.setBounds(20, 198, 116, 14);
		lblAddressLine_1.setForeground(Color.WHITE);
		lblAddressLine_1.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblAddressLine_1);
		
		JLabel lblSex = new JLabel("Age:");
		lblSex.setBounds(20, 298, 116, 14);
		lblSex.setForeground(Color.WHITE);
		lblSex.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblSex);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setBounds(20, 248, 116, 14);
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblDateOfBirth);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(20, 115, 321, 22);
		panel_2.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(20, 165, 321, 22);
		panel_2.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(20, 220, 321, 22);
		panel_2.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(20, 272, 321, 22);
		panel_2.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(20, 320, 321, 22);
		panel_2.add(textArea_5);
		
		JButton btnSubmit = new JButton("Update");
		btnSubmit.setBounds(63, 360, 223, 27);
		btnSubmit.setBackground(new Color(220, 20, 60));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		panel_2.add(btnSubmit);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setIcon(new ImageIcon(page_3e_ii.class.getResource("/image/search-red-icon.png")));
		btnNewButton.setBounds(205, 65, 136, 27);
		panel_2.add(btnNewButton);
		
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
