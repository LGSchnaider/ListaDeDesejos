package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameControl extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtMarca;
	private JTextField txtEstOrigin;
	private JTextField txtValor;
	private JTextField txtData;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameControl frame = new JFrameControl();
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
	public JFrameControl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 500);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel superior = new JPanel();
		contentPane.add(superior, BorderLayout.NORTH);
		superior.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		superior.add(panel);
		
		JLabel lblNewLabel = new JLabel("Lista de Desejos");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel);
		
		JPanel inferior = new JPanel();
		contentPane.add(inferior, BorderLayout.SOUTH);
		inferior.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel esquerda = new JPanel();
		contentPane.add(esquerda, BorderLayout.WEST);
		esquerda.setLayout(new GridLayout(0, 2, 6, 0));
		
		JPanel panel_1 = new JPanel();
		esquerda.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		esquerda.add(panel_2);
		
		txtNome = new JTextField();
		panel_2.add(txtNome);
		txtNome.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		esquerda.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Marca:");
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		esquerda.add(panel_4);
		
		txtMarca = new JTextField();
		panel_4.add(txtMarca);
		txtMarca.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		esquerda.add(panel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Categoria:");
		panel_5.add(lblNewLabel_3);
		
		JPanel panel_6 = new JPanel();
		esquerda.add(panel_6);
		
		JComboBox cBoxCategory = new JComboBox();
		panel_6.add(cBoxCategory);
		cBoxCategory.addItem("Eletrônicos");
		cBoxCategory.addItem("Vestuario");
		cBoxCategory.addItem("Culinaria");
		cBoxCategory.addItem("Jardinágem");
		
		JPanel panel_7 = new JPanel();
		esquerda.add(panel_7);
		
		JLabel lblNewLabel_4 = new JLabel("Estabelecimento:");
		panel_7.add(lblNewLabel_4);
		
		JPanel panel_8 = new JPanel();
		esquerda.add(panel_8);
		
		txtEstOrigin = new JTextField();
		panel_8.add(txtEstOrigin);
		txtEstOrigin.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		esquerda.add(panel_9);
		
		JLabel lblNewLabel_5 = new JLabel("Valor:");
		panel_9.add(lblNewLabel_5);
		
		JPanel panel_10 = new JPanel();
		esquerda.add(panel_10);
		
		txtValor = new JTextField();
		panel_10.add(txtValor);
		txtValor.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		esquerda.add(panel_11);
		
		JLabel lblNewLabel_6 = new JLabel("Data:");
		panel_11.add(lblNewLabel_6);
		
		JPanel panel_12 = new JPanel();
		esquerda.add(panel_12);
		
		txtData = new JTextField();
		panel_12.add(txtData);
		txtData.setColumns(10);
		
		JPanel meio = new JPanel();
		meio.setBorder(new LineBorder(new Color(0, 128, 0), 2));
		contentPane.add(meio, BorderLayout.CENTER);
		meio.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		

		
		table = new JTable();

		DefaultTableModel model = new DefaultTableModel();
		Object[] Column = {"Nome", "Marca", "Categoria", "Estabelecimento", "Valor", "Data"};
		Object[] row = new Object[6];
		model.setColumnIdentifiers(Column);
		table.setModel(model);
		
		JScrollPane scrollPane = new JScrollPane(table);
		meio.add(scrollPane);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNome.getText().equals("") || txtMarca.getText().equals("") || txtEstOrigin.getText().equals("") || txtValor.getText().equals("") || txtData.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
				}else {
					
					row[0] = txtNome.getText();
					row[1] = txtMarca.getText();
					row[2] = (String) cBoxCategory.getSelectedItem();
					row[3] = txtEstOrigin.getText();
					row[4] = txtValor.getText();
					row[5] = txtData.getText();
					
					model.addRow(row);
					
					txtNome.setText("");
					txtMarca.setText("");
					txtEstOrigin.setText("");
					txtValor.setText("");
					txtData.setText("");
					JOptionPane.showMessageDialog(null, "Item salvo com sucesso!!");
				}
				

				
			}
		});
		inferior.add(btnAdd);
		
		JButton btnUpdate = new JButton("Editar");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
				model.setValueAt(txtNome.getText(), i, 0);
				model.setValueAt(txtMarca.getText(), i, 1);
				model.setValueAt(cBoxCategory.getSelectedItem(), i, 2);
				model.setValueAt(txtEstOrigin.getText(), i, 3);
				model.setValueAt(txtValor.getText(), i, 4);
				model.setValueAt(txtData.getText(), i, 5);
				}else {
					JOptionPane.showMessageDialog(null, "Nenhum item selecionado");
				}
			}
		});
		inferior.add(btnUpdate);

		JButton btnRemove = new JButton("Remover");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
				model.removeRow(i);
				JOptionPane.showMessageDialog(null, "Item removido com sucesso!!");
				}else {
					JOptionPane.showMessageDialog(null, "Nenhum item selecionado.");
				}
				
			}	
		});
		inferior.add(btnRemove);
		
		JButton btnClose = new JButton("Fechar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtMarca.setText("");
				txtEstOrigin.setText("");
				txtValor.setText("");
				txtData.setText("");
			}
		});
		inferior.add(btnLimpar);
		inferior.add(btnClose);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				txtNome.setText(model.getValueAt(i, 0).toString());
				txtMarca.setText(model.getValueAt(i, 1).toString());
				cBoxCategory.setSelectedItem(model.getValueAt(i, 2).toString());
				txtEstOrigin.setText(model.getValueAt(i, 3).toString());
				txtValor.setText(model.getValueAt(i, 4).toString());
				txtData.setText(model.getValueAt(i, 5).toString());
			}
		});
		
		
	}
	

	
	
}