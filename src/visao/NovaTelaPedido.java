package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Produto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class NovaTelaPedido extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaTelaPedido frame = new NovaTelaPedido(null);
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
	public NovaTelaPedido(ArrayList<Produto> lista) {
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
		btnConcluirPdd.setBounds(22, 363, 169, 23);
		contentPane.add(btnConcluirPdd);
		
		JButton btnEditar = new JButton("Editar Pedido");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setBounds(217, 363, 143, 23);
		contentPane.add(btnEditar);
		
		JButton btnDeletarPdd = new JButton("Deletar Pedido");
		btnDeletarPdd.setForeground(new Color(255, 0, 0));
		btnDeletarPdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeletarPdd.setBounds(383, 363, 129, 23);
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
		txtNome.setText("Digite");
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
		
		JList list = new JList();
		
		DefaultListModel<String> listaP = new DefaultListModel<String>();
		for (Produto P : lista) {
			listaP.addElement(P.getNome());
		}
		list.setModel(listaP);
		
		list.setBounds(0, 0, 182, 69);
		scrollPane.add(list);
		
		JLabel lblData = new JLabel("Data");
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setBounds(447, 65, 30, 14);
		contentPane.add(lblData);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(499, 61, 46, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(576, 61, 46, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBoxAno = new JComboBox();
		comboBoxAno.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025"}));
		comboBoxAno.setBounds(538, 94, 54, 22);
		contentPane.add(comboBoxAno);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 149, 645, 203);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		DefaultTableModel model = new DefaultTableModel();
		Object[] Column = {"Nome", "Marca", "Categoria", "Estabelecimento", "Valor", "Data"};
		Object[] row = new Object[6];
		model.setColumnIdentifiers(Column);
		table.setModel(model);
		

		
	}
}
