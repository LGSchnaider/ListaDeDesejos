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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.UsuarioDAO;
import modelo.Usuario;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel north = new JPanel();
		north.setBackground(new Color(81, 81, 81));
		contentPane.add(north, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		north.add(lblNewLabel);

		JPanel center = new JPanel();
		contentPane.add(center, BorderLayout.CENTER);
		center.setLayout(new GridLayout(4, 3, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(81, 81, 81));
		center.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(81, 81, 81));
		center.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(81, 81, 81));
		center.add(panel_2);

		JLabel lblNewLabel_1 = new JLabel("Login:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		panel_2.add(lblNewLabel_1);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(81, 81, 81));
		center.add(panel_4);

		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtLogin.setBackground(new Color(192, 192, 192));
		panel_4.add(txtLogin);
		txtLogin.setColumns(10);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(81, 81, 81));
		center.add(panel_5);

		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_5.add(lblNewLabel_2);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(81, 81, 81));
		center.add(panel_6);

		txtSenha = new JTextField();
		txtSenha.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtSenha.setBackground(new Color(192, 192, 192));
		panel_6.add(txtSenha);
		txtSenha.setColumns(10);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(81, 81, 81));
		center.add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(81, 81, 81));
		center.add(panel_9);

		JPanel south = new JPanel();
		south.setBackground(new Color(81, 81, 81));
		contentPane.add(south, BorderLayout.SOUTH);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String login = txtLogin.getText();
				String senha = txtSenha.getText();

				UsuarioDAO bdUsuario = UsuarioDAO.getInstancia();
				Usuario usuarioLogado = bdUsuario.efetuarLogin(login, senha);
				if (usuarioLogado != null) {
					dispose();
					TelaInicio telaInicio = new TelaInicio(usuarioLogado);
					telaInicio.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Login invalido");
				}

			}
		});
		south.add(btnLogin);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE START
				TelaStart frame = new TelaStart();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				// TERMINA O CHAMADO
			}
		});
		south.add(btnVoltar);

		// if (!)
	}
}
