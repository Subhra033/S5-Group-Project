import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.TextField;
import javax.swing.border.BevelBorder;
import javax.swing.JEditorPane;

public class Page3_E extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page3_E frame = new Page3_E();
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
	public Page3_E() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 12));
		setType(Type.POPUP);
		setTitle("Newlife hospital");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Page3_E.class.getResource("/image/hospital-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(102, 0, 0), new Color(255, 255, 255), new Color(51, 51, 51), new Color(255, 255, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 358, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Patient");
		btnNewButton.setIcon(new ImageIcon(Page3_E.class.getResource("/image/user-add-icon.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 52, 358, 46);
		panel.add(btnNewButton);
		
		JButton btnUpdatePatient = new JButton("Update Patient");
		btnUpdatePatient.setIcon(new ImageIcon(Page3_E.class.getResource("/image/pencil-icon.png")));
		btnUpdatePatient.setBounds(0, 123, 358, 46);
		panel.add(btnUpdatePatient);
		
		JButton btnViewPatient = new JButton("View Patient");
		btnViewPatient.setIcon(new ImageIcon(Page3_E.class.getResource("/image/Actions-view-list-details-icon.png")));
		btnViewPatient.setBounds(0, 198, 358, 46);
		panel.add(btnViewPatient);
		
		JButton btnDischargePatient = new JButton("Discharge Patient");
		btnDischargePatient.setIcon(new ImageIcon(Page3_E.class.getResource("/image/user-remove-icon.png")));
		btnDischargePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDischargePatient.setBounds(0, 271, 358, 46);
		panel.add(btnDischargePatient);
		
		JButton btnDoctorDetails = new JButton("Doctor Details");
		btnDoctorDetails.setIcon(new ImageIcon(Page3_E.class.getResource("/image/People-Doctor-Male-icon.png")));
		btnDoctorDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDoctorDetails.setBounds(0, 343, 358, 46);
		panel.add(btnDoctorDetails);
		
		JLabel lblWelcomeReceptionist = new JLabel("Welcome Receptionist !!");
		lblWelcomeReceptionist.setFont(new Font("Rainbow Bridge Personal Use", Font.PLAIN, 23));
		lblWelcomeReceptionist.setForeground(new Color(204, 204, 204));
		lblWelcomeReceptionist.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeReceptionist.setBounds(12, 8, 334, 39);
		panel.add(lblWelcomeReceptionist);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Page3_E.class.getResource("/image/receptionist-icon.png")));
		lblNewLabel.setBounds(460, 73, 244, 282);
		contentPane.add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.setIcon(new ImageIcon(Page3_E.class.getResource("/image/back-icon.png")));
		btnBack.setBounds(606, 383, 98, 26);
		contentPane.add(btnBack);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(358, 0, 358, 53);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewlifeHospital = new JLabel("Newlife Hospital");
		lblNewlifeHospital.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewlifeHospital.setForeground(new Color(51, 153, 51));
		lblNewlifeHospital.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewlifeHospital.setBounds(60, 2, 284, 43);
		panel_1.add(lblNewlifeHospital);
	}
}
