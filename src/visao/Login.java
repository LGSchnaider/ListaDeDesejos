package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel north = new JPanel();
		north.setBackground(new Color(128, 0, 255));
		contentPane.add(north, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		north.add(lblNewLabel);

		JPanel center = new JPanel();
		contentPane.add(center, BorderLayout.CENTER);
		center.setLayout(new GridLayout(4, 3, 0, 0));

		JPanel panel = new JPanel();
		center.add(panel);

		JPanel panel_1 = new JPanel();
		center.add(panel_1);

		JPanel panel_2 = new JPanel();
		center.add(panel_2);

		JLabel lblNewLabel_1 = new JLabel("Login:");
		panel_2.add(lblNewLabel_1);

		JPanel panel_4 = new JPanel();
		center.add(panel_4);

		textField = new JTextField();
		panel_4.add(textField);
		textField.setColumns(10);

		JPanel panel_5 = new JPanel();
		center.add(panel_5);

		JLabel lblNewLabel_2 = new JLabel("Senha:");
		panel_5.add(lblNewLabel_2);

		JPanel panel_6 = new JPanel();
		center.add(panel_6);

		textField_1 = new JTextField();
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_8 = new JPanel();
		center.add(panel_8);

		JPanel panel_9 = new JPanel();
		center.add(panel_9);

		JPanel south = new JPanel();
		contentPane.add(south, BorderLayout.SOUTH);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//CHAMA A CLASSE INICIO
				Inicio frame = new Inicio();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				//TERMINA O CHAMADO
			}
		});
		south.add(btnLogin);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//CHAMA A CLASSE START
				Start frame = new Start();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				//TERMINA O CHAMADO
			}
		});
		south.add(btnVoltar);
	}
}
