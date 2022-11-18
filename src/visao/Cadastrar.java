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

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel Norte = new JPanel();
		Norte.setBackground(new Color(255, 0, 0));
		contentPane.add(Norte, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		Norte.add(lblNewLabel);

		JPanel Centro = new JPanel();
		contentPane.add(Centro, BorderLayout.CENTER);
		Centro.setLayout(new GridLayout(4, 2, 0, 0));

		JPanel panel_1 = new JPanel();
		Centro.add(panel_1);

		JPanel panel_2 = new JPanel();
		Centro.add(panel_2);

		JPanel panel_3 = new JPanel();
		Centro.add(panel_3);

		JLabel lblNewLabel_1 = new JLabel("Login:");
		panel_3.add(lblNewLabel_1);

		JPanel panel = new JPanel();
		Centro.add(panel);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		JPanel panel_4 = new JPanel();
		Centro.add(panel_4);

		JLabel lblNewLabel_2 = new JLabel("Senha:");
		panel_4.add(lblNewLabel_2);

		JPanel panel_5 = new JPanel();
		Centro.add(panel_5);

		textField_1 = new JTextField();
		panel_5.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_6 = new JPanel();
		Centro.add(panel_6);

		JPanel panel_7 = new JPanel();
		Centro.add(panel_7);

		JPanel Sul = new JPanel();
		contentPane.add(Sul, BorderLayout.SOUTH);

		JButton btnNewButton_1 = new JButton("Cadastrar");
		Sul.add(btnNewButton_1);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Sul.add(btnVoltar);
	}

}
