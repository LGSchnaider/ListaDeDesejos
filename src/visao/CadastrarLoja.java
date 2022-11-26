package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class CadastrarLoja extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public CadastrarLoja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Cadastar Loja");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		panel_1.add(btnCadastrar);
		
		JButton btnDeletar = new JButton("Deletar");
		panel_1.add(btnDeletar);
		
		JButton btnEditar = new JButton("Editar");
		panel_1.add(btnEditar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//CHAMA A CLASSE INICIO
				Inicio frame = new Inicio();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				//TERMINA O CHAMADO
			}
		});
		panel_1.add(btnVoltar);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("  Loja:");
		panel_5.add(lblNewLabel_1, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("  Cidade:");
		panel_6.add(lblNewLabel_2, BorderLayout.EAST);
		
		JPanel panel_7 = new JPanel();
		panel_3.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("  Produto:");
		panel_7.add(lblNewLabel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		textField_2 = new JTextField();
		panel_9.add(textField_2, BorderLayout.CENTER);
		textField_2.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_9.add(panel_11, BorderLayout.NORTH);
		
		JPanel panel_12 = new JPanel();
		panel_9.add(panel_12, BorderLayout.SOUTH);
		
		JPanel panel_21 = new JPanel();
		panel_9.add(panel_21, BorderLayout.WEST);
		
		JPanel panel_22 = new JPanel();
		panel_9.add(panel_22, BorderLayout.EAST);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		textField_1 = new JTextField();
		panel_8.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_8.add(panel_13, BorderLayout.NORTH);
		
		JPanel panel_14 = new JPanel();
		panel_8.add(panel_14, BorderLayout.SOUTH);
		
		JPanel panel_19 = new JPanel();
		panel_8.add(panel_19, BorderLayout.WEST);
		
		JPanel panel_20 = new JPanel();
		panel_8.add(panel_20, BorderLayout.EAST);
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_10.add(panel_15, BorderLayout.NORTH);
		
		JPanel panel_16 = new JPanel();
		panel_10.add(panel_16, BorderLayout.SOUTH);
		
		JPanel panel_17 = new JPanel();
		panel_10.add(panel_17, BorderLayout.WEST);
		
		JPanel panel_18 = new JPanel();
		panel_10.add(panel_18, BorderLayout.EAST);
		
		JComboBox comboBox = new JComboBox();
		panel_10.add(comboBox, BorderLayout.CENTER);
	}

}
