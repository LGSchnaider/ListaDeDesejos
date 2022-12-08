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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Produto;

public class TelaCadastrarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;
	private JTextField txtMarca;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCadastrarProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Cadastrar Produto");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnNewButton_1 = new JButton("Editar");
		panel_1.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Remover");
		panel_1.add(btnNewButton_2);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE TELA DE INICIO
				TelaInicio frame = new TelaInicio(null);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				// TERMINA O CHAMADO

			}
		});
		panel_1.add(btnVoltar);

		JPanel centro = new JPanel();
		contentPane.add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(3, 2, 0, 0));

		JPanel panel_2 = new JPanel();
		centro.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_2.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("Nome:");
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		centro.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		txtNome = new JTextField();
		panel_3.add(txtNome, BorderLayout.CENTER);
		txtNome.setColumns(10);

		JPanel panel_14 = new JPanel();
		panel_3.add(panel_14, BorderLayout.NORTH);

		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		centro.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10);

		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_2 = new JLabel("Valor:");
		panel_11.add(lblNewLabel_2, BorderLayout.CENTER);

		JPanel panel_5 = new JPanel();
		centro.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		txtValor = new JTextField();
		panel_5.add(txtValor, BorderLayout.CENTER);
		txtValor.setColumns(10);

		JPanel panel_16 = new JPanel();
		panel_5.add(panel_16, BorderLayout.NORTH);

		JPanel panel_17 = new JPanel();
		panel_5.add(panel_17, BorderLayout.SOUTH);

		JPanel panel_6 = new JPanel();
		centro.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_12 = new JPanel();
		panel_6.add(panel_12);

		JPanel panel_13 = new JPanel();
		panel_6.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_3 = new JLabel("Marca:");
		panel_13.add(lblNewLabel_3, BorderLayout.CENTER);

		JPanel panel_7 = new JPanel();
		centro.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		txtMarca = new JTextField();
		panel_7.add(txtMarca, BorderLayout.CENTER);
		txtMarca.setColumns(10);

		JPanel panel_18 = new JPanel();
		panel_7.add(panel_18, BorderLayout.NORTH);

		JPanel panel_19 = new JPanel();
		panel_7.add(panel_19, BorderLayout.SOUTH);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto();
				produto.setNome(txtNome.getText());
				txtNome.setText("");
			}
		});
		panel_1.add(btnInserir);
	}

}
