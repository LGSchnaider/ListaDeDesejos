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

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JTextField txtCPF;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCadastroUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel Norte = new JPanel();
		Norte.setBackground(new Color(81, 81, 81));
		contentPane.add(Norte, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
		Norte.add(lblNewLabel);

		JPanel Centro = new JPanel();
		contentPane.add(Centro, BorderLayout.CENTER);
		Centro.setLayout(new GridLayout(4, 2, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(81, 81, 81));
		Centro.add(panel_1);

		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		panel_1.add(lblNewLabel_3);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(81, 81, 81));
		Centro.add(panel_2);

		txtNome = new JTextField();
		txtNome.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtNome.setBackground(new Color(192, 192, 192));
		panel_2.add(txtNome);
		txtNome.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(81, 81, 81));
		Centro.add(panel_3);

		JLabel lblNewLabel_4 = new JLabel("CPF:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(0, 255, 0));
		panel_3.add(lblNewLabel_4);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(81, 81, 81));
		Centro.add(panel);

		txtCPF = new JTextField();
		txtCPF.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtCPF.setBackground(new Color(192, 192, 192));
		panel.add(txtCPF);
		txtCPF.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(81, 81, 81));
		Centro.add(panel_4);

		JLabel lblNewLabel_1 = new JLabel("Login:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		panel_4.add(lblNewLabel_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(81, 81, 81));
		Centro.add(panel_5);

		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		panel_5.add(txtLogin);
		txtLogin.setBackground(new Color(192, 192, 192));
		txtLogin.setColumns(10);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(81, 81, 81));
		Centro.add(panel_6);

		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		panel_6.add(lblNewLabel_2);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(81, 81, 81));
		Centro.add(panel_7);

		txtSenha = new JTextField();
		txtSenha.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		panel_7.add(txtSenha);
		txtSenha.setBackground(new Color(192, 192, 192));
		txtSenha.setColumns(10);

		JPanel Sul = new JPanel();
		Sul.setBackground(new Color(81, 81, 81));
		contentPane.add(Sul, BorderLayout.SOUTH);

		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtNome.getText();
				long cpf;
				try {
					cpf = Long.valueOf(txtCPF.getText());

				} catch (NumberFormatException x) {
					JOptionPane.showMessageDialog(null, "CPF invalido");
					return;
				}
				String login = txtLogin.getText();
				String senha = txtSenha.getText();

				if (login.isEmpty() || senha.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Favor inserir senha e login");
					return;
				}
				UsuarioDAO bdUsuario = UsuarioDAO.getInstancia();

				// completar
				Usuario usuario = new Usuario();
				usuario.setNome(nome);
				usuario.setCpf(cpf);

				usuario.setLogin(login);
				usuario.setSenha(senha);

				boolean valida = bdUsuario.inserir(usuario);
				if (valida == true) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Dados não cadastrados");
				}

			}
		});
		Sul.add(btnNewButton_1);

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
		Sul.add(btnVoltar);
	}

}
