package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Produto;
import modelo.Usuario;

import modelo.Produto;

public class TelaInicio extends JFrame {

	private JPanel contentPane;
	private Usuario usuarioLogado;
	private ArrayList<Produto> produtos;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaInicio(Usuario usuario) {

		if (usuario != null) {
			this.usuarioLogado = usuario;
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel north = new JPanel();
		north.setBackground(new Color(81, 81, 81));
		contentPane.add(north, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Pagina Inicial");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		north.add(lblNewLabel);

		JPanel center = new JPanel();
		contentPane.add(center, BorderLayout.CENTER);
		center.setLayout(new GridLayout(3, 2, 0, 0));

		JPanel panel_3 = new JPanel();
		center.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JButton btnProduto = new JButton("Cadastrar Produto");
		btnProduto.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE CADASTRAR PRODUTO
				TelaCadastrarProduto frame = new TelaCadastrarProduto();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				// TERMINA O CHAMADO
			}
		});
		panel_3.add(btnProduto);

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_14, BorderLayout.NORTH);

		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_15, BorderLayout.WEST);

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_16, BorderLayout.EAST);

		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(81, 81, 81));
		panel_3.add(panel_17, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		center.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JButton btnPedido = new JButton("Fazer Pedido");
		btnPedido.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE
				NovaTelaPedido frame = new NovaTelaPedido();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				// TERMINA O CHAMADO
			}
		});
		panel_4.add(btnPedido);

		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_22, BorderLayout.WEST);

		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_23, BorderLayout.EAST);

		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_24, BorderLayout.NORTH);

		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(81, 81, 81));
		panel_4.add(panel_25, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		center.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE START
				TelaStart frame = new TelaStart();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				// TERMINA O CHAMADO
			}
		});
		panel.add(btnLogout);

		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(81, 81, 81));
		panel.add(panel_26, BorderLayout.NORTH);

		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(81, 81, 81));
		panel.add(panel_27, BorderLayout.WEST);

		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(81, 81, 81));
		panel.add(panel_28, BorderLayout.SOUTH);

		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(81, 81, 81));
		panel.add(panel_29, BorderLayout.EAST);
		setLocationRelativeTo(null);
	}

}
