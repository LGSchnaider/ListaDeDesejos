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

		JPanel centro = new JPanel();
		contentPane.add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(3, 2, 0, 0));

		JPanel panel_2 = new JPanel();
		centro.add(panel_2);
		panel_2.setLayout(null);
		
				JLabel lblNewLabel_1 = new JLabel("Nome:");
				lblNewLabel_1.setBounds(76, 25, 52, 22);
				panel_2.add(lblNewLabel_1);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

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
		panel_4.setLayout(null);
		
				JLabel lblNewLabel_2 = new JLabel("Valor:");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_2.setLabelFor(this);
				lblNewLabel_2.setToolTipText("");
				lblNewLabel_2.setBounds(43, 8, 118, 57);
				panel_4.add(lblNewLabel_2);
				lblNewLabel_2.setForeground(new Color(0, 0, 0));

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
		panel_6.setLayout(null);
		
				JLabel lblNewLabel_3 = new JLabel("Categoria:");
				lblNewLabel_3.setBounds(62, 25, 80, 22);
				panel_6.add(lblNewLabel_3);
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JPanel panel_7 = new JPanel();
		centro.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JPanel panel_18 = new JPanel();
		panel_7.add(panel_18, BorderLayout.NORTH);

		JPanel panel_19 = new JPanel();
		panel_7.add(panel_19, BorderLayout.SOUTH);
		
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"Brinquedo", "Eletrônico", "Utilidades ", "Alimento", "Outros"}));
		panel_7.add(cbCategoria, BorderLayout.CENTER);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1o - Pega as coisas dos campos de texto
				String nomeProduto = txtNome.getText();
				String precoProduto = txtValor.getText();

				// 2o - Conversao de tipo
				Double preco = Double.valueOf(precoProduto);

				// 3o - Criar o objeto e seta os valores
				Produto produto = new Produto();
				produto.setNome(nomeProduto);
				produto.setValor(preco);
				produto.setCategoria(String.valueOf(cbCategoria.getSelectedItem()));

				// 4o - Adiciona o objeto no arraylist do DAO
				ProdutoDAO bdProduto = ProdutoDAO.getInstancia();
				boolean validar = bdProduto.inserir(produto);
				if (validar == true) {
				JOptionPane.showMessageDialog(btnInserir, "Produto cadastrado com sucesso");
				} else {
				JOptionPane.showMessageDialog(btnInserir, "Erro ao cadastrar o produto");
				}
				return;
			}
		});
		panel_1.add(btnInserir);
		
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
	}

}
