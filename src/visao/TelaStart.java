package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaStart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaStart frame = new TelaStart();
					frame.setLocationRelativeTo(null);
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
	public TelaStart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(81, 81, 81));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Lista de Desejos");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(81, 81, 81));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE CADASTRAR
				TelaCadastroUsuario frame = new TelaCadastroUsuario();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);

				// TERMINA O CHAMADO
			}
		});
		panel_3.add(btnCadastrar);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_5, BorderLayout.NORTH);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_6, BorderLayout.WEST);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_7, BorderLayout.SOUTH);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_8, BorderLayout.EAST);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE LOGIN
				TelaLogin frame = new TelaLogin();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				// TERMINA O CHAMADO

			}
		});
		panel_4.add(btnLogin);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_9, BorderLayout.NORTH);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_10, BorderLayout.WEST);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_11, BorderLayout.SOUTH);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_12, BorderLayout.EAST);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel_2.add(btnSair);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(81, 81, 81));
		panel_2.add(panel_13, BorderLayout.NORTH);

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(81, 81, 81));
		panel_2.add(panel_14, BorderLayout.WEST);

		JPanel panel_15 = new JPanel();
		panel_15.setForeground(new Color(0, 0, 0));
		panel_15.setBackground(new Color(81, 81, 81));
		panel_2.add(panel_15, BorderLayout.SOUTH);

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(81, 81, 81));
		panel_2.add(panel_16, BorderLayout.EAST);
	}

}
