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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 358, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Patient");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 12, 358, 46);
		panel.add(btnNewButton);
		
		JButton btnUpdatePatient = new JButton("Update Patient");
		btnUpdatePatient.setBounds(0, 72, 358, 46);
		panel.add(btnUpdatePatient);
		
		JButton btnViewPatient = new JButton("View Patient");
		btnViewPatient.setBounds(0, 140, 358, 46);
		panel.add(btnViewPatient);
		
		JButton button = new JButton("Update Patient");
		button.setBounds(0, 202, 358, 46);
		panel.add(button);
		
		JButton button_1 = new JButton("Update Patient");
		button_1.setBounds(0, 266, 358, 46);
		panel.add(button_1);
		
		JButton btnDoctorDetails = new JButton("Doctor Details");
		btnDoctorDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDoctorDetails.setBounds(0, 343, 358, 46);
		panel.add(btnDoctorDetails);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Page3_E.class.getResource("/image/receptionist-icon.png")));
		lblNewLabel.setBounds(460, 73, 244, 282);
		contentPane.add(lblNewLabel);
		
		JTree tree = new JTree();
		tree.setBounds(364, 73, 78, 72);
		contentPane.add(tree);
	}
}
