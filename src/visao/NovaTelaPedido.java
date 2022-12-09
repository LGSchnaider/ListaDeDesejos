package visao;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.PedidoDAO;
import controle.ProdutoDAO;
import modelo.IProdutoDAO;
import modelo.Pedido;
import modelo.Produto;

public class NovaTelaPedido extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTable tablePedidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaTelaPedido frame = new NovaTelaPedido();
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
	public NovaTelaPedido() {
		
		PedidoDAO bdPedido = PedidoDAO.getInstancia();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("Faça seu pedido");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 30));
		lblTitulo.setBounds(193, 0, 278, 37);
		contentPane.add(lblTitulo);

		JButton btnConcluirPdd = new JButton("Finalizar Pedido");
		btnConcluirPdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido pedido = new Pedido();
				
				bdPedido.inserir(pedido);
			}
		});
		btnConcluirPdd.setBounds(22, 363, 169, 23);
		contentPane.add(btnConcluirPdd);

		JButton btnEditar = new JButton("Editar Pedido");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido pedido = new Pedido();
				bdPedido.alterar(pedido);
				
			}
		});
		btnEditar.setBounds(217, 363, 143, 23);
		contentPane.add(btnEditar);

		JButton btnDeletarPdd = new JButton("Deletar Pedido");
		btnDeletarPdd.setForeground(new Color(255, 0, 0));
		btnDeletarPdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido  pedido = new Pedido();
				bdPedido.excluir(pedido);
			}
		});
		btnDeletarPdd.setBounds(396, 363, 129, 23);
		contentPane.add(btnDeletarPdd);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE TELA DE INICIO
				TelaInicio frame = new TelaInicio(null);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				// TERMINA O CHAMADO
			}
		});
		btnCancelar.setForeground(new Color(255, 0, 0));
		btnCancelar.setBounds(555, 363, 89, 23);
		contentPane.add(btnCancelar);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(22, 65, 46, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(78, 62, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProduto.setBounds(193, 65, 46, 14);
		contentPane.add(lblProduto);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(249, 48, 182, 69);
		contentPane.add(scrollPane);

		JLabel lblData = new JLabel("Data");
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setBounds(447, 65, 30, 14);
		contentPane.add(lblData);

		JComboBox cbDia = new JComboBox();
		cbDia.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
						"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		cbDia.setBounds(499, 61, 46, 22);
		contentPane.add(cbDia);

		JComboBox cbMes = new JComboBox();
		cbMes.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		cbMes.setBounds(576, 61, 46, 22);
		contentPane.add(cbMes);

		JComboBox<String> cbAno = new JComboBox<>();
		cbAno.setModel(new DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
				"2020", "2021", "2022", "2023", "2024", "2025" }));
		cbAno.setBounds(538, 94, 54, 22);
		contentPane.add(cbAno);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 149, 645, 203);
		contentPane.add(scrollPane_1);

		tablePedidos = new JTable();
		scrollPane_1.setViewportView(tablePedidos);

		ProdutoDAO bdProdutos = ProdutoDAO.getInstancia();
		ArrayList<Produto> produtos = bdProdutos.listarProduto();

		JList<Produto> list = new JList<>();
		DefaultListModel<Produto> listaP = new DefaultListModel<>();
		for (Produto P : produtos) {
			listaP.addElement(P);
		}
		list.setModel(listaP);

		list.setBounds(0, 0, 182, 69);
		scrollPane.add(list);

		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "Nome", "Categoria", "Valor", "Data" });

		for (int i = 0; i < produtos.size(); i++) {
			Produto p = produtos.get(i);
			modelo.addRow(
					new Object[] { p.getNome(), p.getCategoria(), p.getValor() });
		}

		tablePedidos.setModel(modelo);

	}
}
