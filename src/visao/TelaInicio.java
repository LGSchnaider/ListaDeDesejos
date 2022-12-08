package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel north = new JPanel();
		north.setBackground(new Color(255, 255, 0));
		contentPane.add(north, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Pagina Inicial");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		north.add(lblNewLabel);

		JPanel center = new JPanel();
		contentPane.add(center, BorderLayout.CENTER);
		center.setLayout(new GridLayout(3, 2, 0, 0));

		JPanel panel_1 = new JPanel();
		center.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10, BorderLayout.NORTH);

		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11, BorderLayout.WEST);

		JPanel panel_12 = new JPanel();
		panel_1.add(panel_12, BorderLayout.EAST);

		JPanel panel_13 = new JPanel();
		panel_1.add(panel_13, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		center.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6, BorderLayout.NORTH);

		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7, BorderLayout.WEST);

		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8, BorderLayout.SOUTH);

		JPanel panel_9 = new JPanel();
		panel_2.add(panel_9, BorderLayout.EAST);

		JPanel panel_3 = new JPanel();
		center.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JButton btnProduto = new JButton("Cadastrar Produto");
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				// CHAMA A CLASSE CADASTRAR PRODUTO
				TelaProduto frame = new TelaProduto();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				// TERMINA O CHAMADO
			}
		});
		panel_3.add(btnProduto);

		JPanel panel_14 = new JPanel();
		panel_3.add(panel_14, BorderLayout.NORTH);

		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15, BorderLayout.WEST);

		JPanel panel_16 = new JPanel();
		panel_3.add(panel_16, BorderLayout.EAST);

		JPanel panel_17 = new JPanel();
		panel_3.add(panel_17, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		center.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_4 = new JButton("Cadastrar Vendedor");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		panel_4.add(btnNewButton_4);

		JPanel panel_22 = new JPanel();
		panel_4.add(panel_22, BorderLayout.WEST);

		JPanel panel_23 = new JPanel();
		panel_4.add(panel_23, BorderLayout.EAST);

		JPanel panel_24 = new JPanel();
		panel_4.add(panel_24, BorderLayout.NORTH);

		JPanel panel_25 = new JPanel();
		panel_4.add(panel_25, BorderLayout.SOUTH);

		JPanel panel_5 = new JPanel();
		center.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		JPanel panel_18 = new JPanel();
		panel_5.add(panel_18, BorderLayout.NORTH);

		JPanel panel_19 = new JPanel();
		panel_5.add(panel_19, BorderLayout.WEST);

		JPanel panel_20 = new JPanel();
		panel_5.add(panel_20, BorderLayout.SOUTH);

		JPanel panel_21 = new JPanel();
		panel_5.add(panel_21, BorderLayout.EAST);

		JPanel panel = new JPanel();
		center.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JButton btnLogout = new JButton("Logout");
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
		panel.add(panel_26, BorderLayout.NORTH);

		JPanel panel_27 = new JPanel();
		panel.add(panel_27, BorderLayout.WEST);

		JPanel panel_28 = new JPanel();
		panel.add(panel_28, BorderLayout.SOUTH);

		JPanel panel_29 = new JPanel();
		panel.add(panel_29, BorderLayout.EAST);
	}

}
