package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;

public class ListaDeDesejos extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ListaDeDesejos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 255));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Lista de desejos");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.add(table);
		
		scrollPane.setViewportView(table);
		
		DefaultTableModel model = new DefaultTableModel();
		Object[] Column = {"Nome", "Valor", "Validade"};
		Object[] row = new Object[3];
		model.setColumnIdentifiers(Column);
		table.setModel(model);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Comprado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CHAMA A CLASSE TELA INICIAL
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Inicio frame = new Inicio();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				setVisible(false);
				//TERMINA O CHAMADO
				
			}
		});
		panel_2.add(btnVoltar);
	}
}