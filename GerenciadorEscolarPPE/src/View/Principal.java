package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.JTable;
import java.awt.Panel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Principal {

	private JFrame frame;
	private JDesktopPane desktopPane;
	private JButton btnMatricula;
	private JTabbedPane tabbedPane;
	private JPanel principal;
	private JSeparator separator_2;
	private JTable table;
	private JTextField txtPrimA;
	private JTextField txtSegA;
	private JTextField txtTercA;
	private JTextField txtPrevestA;
	private JTextField txtPrimIn;
	private JTextField txtSegIn;
	private JTextField txtTercIn;
	private JTextField txtPrevestIn;
	private JTextField txtPrevestAp;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		initialize();
	}
	
	private void invokTelaMatricula() {
		IntFrmMatricula matricula = new IntFrmMatricula();
		desktopPane.add(matricula);
		matricula.setLocation(0, 0);
		matricula.setPosicao();
		matricula.show();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 1840, 1075);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		btnMatricula = new JButton("MATRÍCULA");
		btnMatricula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				invokTelaMatricula();
}
		});
		btnMatricula.setBounds(952, 338, 125, 41);
		frame.getContentPane().add(btnMatricula);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(82, 345, 800, 636);
		frame.getContentPane().add(tabbedPane);
		
		principal = new JPanel();
		tabbedPane.addTab("PRINCIPAL", null, principal, null);
		principal.setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 795, 606);
		principal.add(desktopPane);
		desktopPane.setBackground(SystemColor.menu);
		
		JPanel cadastros = new JPanel();
		tabbedPane.addTab("CADASTROS", null, cadastros, null);
		
		JPanel consultas = new JPanel();
		tabbedPane.addTab("CONSULTAS", null, consultas, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("**********", null, panel_3, null);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(791, 107, 815, 2);
		frame.getContentPane().add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(791, 122, 815, 190);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setCellSelectionEnabled(true);
		table.setShowVerticalLines(false);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"NOME", "CURSO(S)", "IES", "LOCAL"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(33);
		
		JLabel lblAprovados = new JLabel("APROVADOS");
		lblAprovados.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAprovados.setHorizontalAlignment(SwingConstants.CENTER);
		lblAprovados.setBounds(791, 78, 815, 31);
		frame.getContentPane().add(lblAprovados);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(386, 120, 1, 169);
		frame.getContentPane().add(separator_3);
		
		txtPrimA = new JTextField();
		txtPrimA.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrimA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrimA.setText("25");
		txtPrimA.setBounds(398, 127, 80, 22);
		txtPrimA.setEditable(false);
		frame.getContentPane().add(txtPrimA);
		txtPrimA.setColumns(10);
		
		txtSegA = new JTextField();
		txtSegA.setHorizontalAlignment(SwingConstants.CENTER);
		txtSegA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSegA.setText("25");
		txtSegA.setBounds(398, 172, 80, 22);
		txtSegA.setEditable(false);
		frame.getContentPane().add(txtSegA);
		txtSegA.setColumns(10);
		
		txtTercA = new JTextField();
		txtTercA.setHorizontalAlignment(SwingConstants.CENTER);
		txtTercA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTercA.setText("30");
		txtTercA.setBounds(398, 216, 80, 22);
		txtTercA.setEditable(false);
		frame.getContentPane().add(txtTercA);
		txtTercA.setColumns(10);
		
		txtPrevestA = new JTextField();
		txtPrevestA.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrevestA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrevestA.setText("150");
		txtPrevestA.setBounds(398, 260, 80, 22);
		txtPrevestA.setEditable(false);
		frame.getContentPane().add(txtPrevestA);
		txtPrevestA.setColumns(10);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(490, 120, 1, 163);
		frame.getContentPane().add(separator_7);
		
		JLabel label = new JLabel("*");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(608, 216, 80, 22);
		frame.getContentPane().add(label);
		
		txtPrimIn = new JTextField();
		txtPrimIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrimIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrimIn.setText("25");
		txtPrimIn.setBounds(503, 127, 80, 22);
		txtPrimIn.setEditable(false);
		frame.getContentPane().add(txtPrimIn);
		txtPrimIn.setColumns(10);
		
		txtSegIn = new JTextField();
		txtSegIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSegIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtSegIn.setText("25");
		txtSegIn.setBounds(503, 172, 80, 22);
		txtSegIn.setEditable(false);
		frame.getContentPane().add(txtSegIn);
		txtSegIn.setColumns(10);
		
		txtTercIn = new JTextField();
		txtTercIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTercIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtTercIn.setText("30");
		txtTercIn.setBounds(503, 216, 80, 22);
		txtTercIn.setEditable(false);
		frame.getContentPane().add(txtTercIn);
		txtTercIn.setColumns(10);
		
		txtPrevestIn = new JTextField();
		txtPrevestIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrevestIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrevestIn.setText("150");
		txtPrevestIn.setBounds(503, 260, 80, 22);
		txtPrevestIn.setEditable(false);
		frame.getContentPane().add(txtPrevestIn);
		txtPrevestIn.setColumns(10);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(595, 120, 1, 163);
		frame.getContentPane().add(separator_8);
		
		txtPrevestAp = new JTextField();
		txtPrevestAp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrevestAp.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrevestAp.setText("150");
		txtPrevestAp.setBounds(608, 260, 80, 22);
		txtPrevestAp.setEditable(false);
		frame.getContentPane().add(txtPrevestAp);
		txtPrevestAp.setColumns(10);
		
		JLabel label_1 = new JLabel("*");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(608, 172, 80, 22);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(608, 127, 80, 22);
		frame.getContentPane().add(label_2);
		
		JLabel lblAtivos = new JLabel("ATIVOS");
		lblAtivos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAtivos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtivos.setBounds(410, 94, 56, 16);
		frame.getContentPane().add(lblAtivos);
		
		JLabel lblInativos = new JLabel("INATIVOS");
		lblInativos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInativos.setBounds(503, 94, 80, 16);
		frame.getContentPane().add(lblInativos);
		
		JLabel lblAprovados_1 = new JLabel("APROVADOS");
		lblAprovados_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAprovados_1.setBounds(603, 94, 90, 16);
		frame.getContentPane().add(lblAprovados_1);
		
		JButton btnPrimeiroAno = new JButton("PRIMEIRO ANO");
		btnPrimeiroAno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrimeiroAno.setBounds(220, 121, 155, 35);
		frame.getContentPane().add(btnPrimeiroAno);
		
		JButton btnSegundoAno = new JButton("SEGUNDO ANO");
		btnSegundoAno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSegundoAno.setBounds(220, 166, 155, 35);
		frame.getContentPane().add(btnSegundoAno);
		
		JButton btnTerceiroAno = new JButton("TERCEIRO ANO");
		btnTerceiroAno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTerceiroAno.setBounds(220, 210, 155, 35);
		frame.getContentPane().add(btnTerceiroAno);
		
		JButton btnPrvestibular = new JButton("PR\u00C9-VEST");
		btnPrvestibular.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrvestibular.setBounds(220, 254, 155, 35);
		frame.getContentPane().add(btnPrvestibular);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(220, 112, 468, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(82, 78, 1670, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(82, 330, 800, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(952, 330, 800, 2);
		frame.getContentPane().add(separator_6);
	}
}
