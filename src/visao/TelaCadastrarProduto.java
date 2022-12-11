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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ProdutoDAO;
import modelo.Produto;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class TelaCadastrarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCadastrarProduto() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(81, 81, 81));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Cadastrar Produto");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(81, 81, 81));
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JPanel centro = new JPanel();
		contentPane.add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(3, 2, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(81, 81, 81));
		centro.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(81, 81, 81));
		panel_2.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(81, 81, 81));
		panel_21.setForeground(new Color(81, 81, 81));
		panel_2.add(panel_21);
		panel_21.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBackground(new Color(81, 81, 81));
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_21.add(lblNewLabel_1, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		centro.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_8, BorderLayout.NORTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_9, BorderLayout.WEST);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_10, BorderLayout.SOUTH);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_11, BorderLayout.EAST);
		
		txtNome = new JTextField();
		txtNome.setBackground(new Color(192, 192, 192));
		panel_3.add(txtNome, BorderLayout.CENTER);
		txtNome.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(81, 81, 81));
		centro.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_23);
		panel_23.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Valor:");
		lblNewLabel_2.setBackground(new Color(81, 81, 81));
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_23.add(lblNewLabel_2, BorderLayout.CENTER);

		JPanel panel_5 = new JPanel();
		centro.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(81, 81, 81));
		panel_12.setForeground(new Color(81, 81, 81));
		panel_5.add(panel_12, BorderLayout.NORTH);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(81, 81, 81));
		panel_5.add(panel_13, BorderLayout.WEST);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(81, 81, 81));
		panel_5.add(panel_14, BorderLayout.EAST);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(81, 81, 81));
		panel_5.add(panel_15, BorderLayout.SOUTH);
		
		txtValor = new JTextField();
		txtValor.setBackground(new Color(192, 192, 192));
		panel_5.add(txtValor, BorderLayout.CENTER);
		txtValor.setColumns(10);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(81, 81, 81));
		centro.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(81, 81, 81));
		panel_6.add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(81, 81, 81));
		panel_6.add(panel_25);
		panel_25.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_25.add(lblNewLabel_3, BorderLayout.CENTER);

		JPanel panel_7 = new JPanel();
		centro.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(81, 81, 81));
		panel_7.add(panel_18, BorderLayout.NORTH);

		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(81, 81, 81));
		panel_7.add(panel_19, BorderLayout.SOUTH);
		
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"Brinquedo", "Eletrônico", "Utilidades ", "Alimento", "Outros"}));
		panel_7.add(cbCategoria, BorderLayout.CENTER);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(81, 81, 81));
		panel_7.add(panel_16, BorderLayout.WEST);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(81, 81, 81));
		panel_7.add(panel_17, BorderLayout.EAST);

		JButton btnSalvar = new JButton("Inserir");
		btnSalvar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1o - Pega as coisas dos campos de texto
				String nomeProduto = txtNome.getText();
				String precoProduto = txtValor.getText();

				// 2o - Conversao de tipo
				Double preco = Double.valueOf(precoProduto);

				// 3o - Criar o objeto e seta os valores
				Produto produto = new Produto();
				produto.setNome(nomeProduto);
				produto.setValor(Double.valueOf(txtValor.getText()));
				String a = (String) cbCategoria.getSelectedItem();
				System.out.println(a);
				produto.setCategoria(a);
				//produto.setCategoria(String.valueOf(cbCategoria.getSelectedItem()));

				// 4o - Adiciona o objeto no arraylist do DAO
				ProdutoDAO bdProduto = ProdutoDAO.getInstancia();
				boolean validar = bdProduto.inserir(produto);
				if (validar == true) {
				JOptionPane.showMessageDialog(btnSalvar, "Produto cadastrado com sucesso");
				} else {
				JOptionPane.showMessageDialog(btnSalvar, "Erro ao cadastrar o produto");
				}
				return;
			}
		});
		panel_1.add(btnSalvar);
		
				JButton btnVoltar = new JButton("Voltar");
				btnVoltar.setFont(new Font("Times New Roman", Font.BOLD, 12));
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
	}
}
