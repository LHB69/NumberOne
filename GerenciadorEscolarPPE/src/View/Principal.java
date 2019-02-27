package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.DefaultComboBoxModel;

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
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chckbxPrimeiroano, chckbxSegundoAno, chckbxTerceiroAno, chckbxPreVest, chckbxRespfinanaluno;
	private JTextField txtEmail, txtNome, txtNomeSocial, txtRg, txtRua, txtNumeroCasa, txtBairro, txtCidade;
	private JLabel lblCelular, lblEmail, lblCpf, lblRg, lblrgExp, lblNasc, label;
	private JComboBox cboxOrgExpedidor, cboxEstado, cboxSexo, comboBox;
	private JFormattedTextField frmCelularAluno, frmCpfAluno, frmNascAluno, frmCepAluno;;
	private JButton btnFiliacao, btnRespfinanceiro;
	private JRadioButton rdbtnNomeSocial;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
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
		btnMatricula.setBounds(694, 13, 125, 41);
		frame.getContentPane().add(btnMatricula);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(82, 345, 1670, 636);
		frame.getContentPane().add(tabbedPane);
		
		principal = new JPanel();
		tabbedPane.addTab("MATRÍCULA", null, principal, null);
		principal.setLayout(null);
		
		JCheckBox checkBox = new JCheckBox("PRIMEIRO ANO");
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkBox.setBounds(30, 54, 155, 25);
		principal.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("SEGUNDO ANO");
		checkBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkBox_1.setBounds(189, 54, 155, 25);
		principal.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("TERCEIRO ANO");
		checkBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkBox_2.setBounds(348, 54, 155, 25);
		principal.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("PR\u00C9-VESTIBULAR");
		checkBox_3.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkBox_3.setBounds(513, 54, 155, 25);
		principal.add(checkBox_3);
		
		JLabel label_3 = new JLabel("NOME:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(27, 109, 56, 16);
		principal.add(label_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(86, 106, 582, 22);
		principal.add(textField);
		
		JLabel label_4 = new JLabel("SEXO:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(701, 109, 47, 16);
		principal.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setBounds(749, 103, 81, 22);
		principal.add(comboBox_1);
		
		JRadioButton radioButton = new JRadioButton("NOME SOCIAL:");
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton.setBounds(27, 142, 121, 25);
		principal.add(radioButton);
		
		textField_1 = new JTextField();
		textField_1.setText(" ");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(150, 143, 680, 22);
		principal.add(textField_1);
		
		JLabel label_5 = new JLabel("CELULAR:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(45, 412, 70, 16);
		principal.add(label_5);
		
		JLabel label_6 = new JLabel("E-MAIL:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(273, 412, 62, 16);
		principal.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(338, 409, 315, 22);
		principal.add(textField_2);
		
		JLabel label_7 = new JLabel("CPF:");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(27, 225, 37, 16);
		principal.add(label_7);
		
		JLabel label_8 = new JLabel("RG:");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setBounds(221, 225, 37, 16);
		principal.add(label_8);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(255, 222, 164, 22);
		principal.add(textField_3);
		
		JLabel lblrgoExpedidor = new JLabel("\u00D3RG\u00C3O EXPEDIDOR:");
		lblrgoExpedidor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblrgoExpedidor.setBounds(457, 225, 155, 16);
		principal.add(lblrgoExpedidor);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_2.setBounds(612, 225, 81, 22);
		principal.add(comboBox_2);
		
		JLabel label_10 = new JLabel("NASC.:");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_10.setBounds(30, 179, 56, 16);
		principal.add(label_10);
		
		JButton button = new JButton("A");
		button.setBounds(1041, 213, 140, 25);
		principal.add(button);
		
		JLabel label_11 = new JLabel("RUA:");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(27, 271, 37, 16);
		principal.add(label_11);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(69, 268, 325, 22);
		principal.add(textField_4);
		
		JLabel label_12 = new JLabel("N\u00DAMERO:");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_12.setBounds(422, 271, 70, 16);
		principal.add(label_12);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(499, 268, 116, 22);
		principal.add(textField_5);
		
		JLabel label_13 = new JLabel("BAIRRO:");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBounds(27, 308, 70, 16);
		principal.add(label_13);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(97, 305, 220, 22);
		principal.add(textField_6);
		
		JLabel label_14 = new JLabel("CIDADE:");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setBounds(349, 308, 70, 16);
		principal.add(label_14);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(418, 305, 206, 22);
		principal.add(textField_7);
		
		JLabel label_15 = new JLabel("UF:");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_15.setBounds(670, 308, 30, 16);
		principal.add(label_15);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(704, 305, 68, 22);
		principal.add(comboBox_3);
		
		JLabel label_16 = new JLabel("CEP.:");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setBounds(636, 271, 37, 16);
		principal.add(label_16);
		
		JButton button_1 = new JButton("<html><br>RESPONS\u00C1VEL ACAD\u00CAMICO</br></html>");
		button_1.setBounds(1041, 259, 140, 61);
		principal.add(button_1);
		
		JLabel label_17 = new JLabel("UF:");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(728, 228, 30, 16);
		principal.add(label_17);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(762, 225, 68, 22);
		principal.add(comboBox_4);
		
		JFormattedTextField formattedTextField = new JFormattedTextField((AbstractFormatter) null);
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextField.setBounds(127, 409, 121, 22);
		principal.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField((AbstractFormatter) null);
		formattedTextField_1.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextField_1.setBounds(64, 222, 121, 22);
		principal.add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField((AbstractFormatter) null);
		formattedTextField_2.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextField_2.setBounds(96, 176, 94, 22);
		principal.add(formattedTextField_2);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField((AbstractFormatter) null);
		formattedTextField_3.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextField_3.setBounds(685, 268, 87, 22);
		principal.add(formattedTextField_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkBox_4.setBounds(1051, 134, 25, 32);
		principal.add(checkBox_4);
		
		JLabel label_18 = new JLabel(" FINANCEIRO");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_18.setBounds(1080, 150, 101, 16);
		principal.add(label_18);
		
		JLabel label_19 = new JLabel("RESPONS\u00C1VEL");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_19.setBounds(1084, 129, 97, 16);
		principal.add(label_19);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(0, 28, 830, 2);
		principal.add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(840, 28, 825, 2);
		principal.add(separator_12);
		
		JLabel lblNaturalidade = new JLabel("NATURALIDADE:");
		lblNaturalidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNaturalidade.setBounds(232, 180, 121, 16);
		principal.add(lblNaturalidade);
		
		JComboBox cboxCidade = new JComboBox();
		cboxCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboxCidade.setBounds(355, 178, 298, 22);
		principal.add(cboxCidade);
		
		JComboBox cboxEstNaturalidade = new JComboBox();
		cboxEstNaturalidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboxEstNaturalidade.setModel(new DefaultComboBoxModel(new String[] {"MT"}));
		cboxEstNaturalidade.setBounds(774, 178, 56, 22);
		principal.add(cboxEstNaturalidade);
		
		JLabel lblEstado = new JLabel("ESTADO:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEstado.setBounds(701, 179, 70, 16);
		principal.add(lblEstado);
		
		JPanel cadastros = new JPanel();
		tabbedPane.addTab("CADASTROS", null, cadastros, null);
		
		JPanel consultas = new JPanel();
		tabbedPane.addTab("CONSULTAS", null, consultas, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("**********", null, panel_3, null);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(722, 101, 961, 2);
		frame.getContentPane().add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(722, 116, 961, 190);
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
		lblAprovados.setBounds(795, 70, 815, 31);
		frame.getContentPane().add(lblAprovados);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(317, 114, 1, 169);
		frame.getContentPane().add(separator_3);
		
		txtPrimA = new JTextField();
		txtPrimA.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrimA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrimA.setText("25");
		txtPrimA.setBounds(329, 121, 80, 22);
		txtPrimA.setEditable(false);
		frame.getContentPane().add(txtPrimA);
		txtPrimA.setColumns(10);
		
		txtSegA = new JTextField();
		txtSegA.setHorizontalAlignment(SwingConstants.CENTER);
		txtSegA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSegA.setText("25");
		txtSegA.setBounds(329, 166, 80, 22);
		txtSegA.setEditable(false);
		frame.getContentPane().add(txtSegA);
		txtSegA.setColumns(10);
		
		txtTercA = new JTextField();
		txtTercA.setHorizontalAlignment(SwingConstants.CENTER);
		txtTercA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTercA.setText("30");
		txtTercA.setBounds(329, 210, 80, 22);
		txtTercA.setEditable(false);
		frame.getContentPane().add(txtTercA);
		txtTercA.setColumns(10);
		
		txtPrevestA = new JTextField();
		txtPrevestA.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrevestA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrevestA.setText("150");
		txtPrevestA.setBounds(329, 254, 80, 22);
		txtPrevestA.setEditable(false);
		frame.getContentPane().add(txtPrevestA);
		txtPrevestA.setColumns(10);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(421, 114, 1, 163);
		frame.getContentPane().add(separator_7);
		
		JLabel label = new JLabel("*");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(539, 210, 80, 22);
		frame.getContentPane().add(label);
		
		txtPrimIn = new JTextField();
		txtPrimIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrimIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrimIn.setText("25");
		txtPrimIn.setBounds(434, 121, 80, 22);
		txtPrimIn.setEditable(false);
		frame.getContentPane().add(txtPrimIn);
		txtPrimIn.setColumns(10);
		
		txtSegIn = new JTextField();
		txtSegIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSegIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtSegIn.setText("25");
		txtSegIn.setBounds(434, 166, 80, 22);
		txtSegIn.setEditable(false);
		frame.getContentPane().add(txtSegIn);
		txtSegIn.setColumns(10);
		
		txtTercIn = new JTextField();
		txtTercIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTercIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtTercIn.setText("30");
		txtTercIn.setBounds(434, 210, 80, 22);
		txtTercIn.setEditable(false);
		frame.getContentPane().add(txtTercIn);
		txtTercIn.setColumns(10);
		
		txtPrevestIn = new JTextField();
		txtPrevestIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrevestIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrevestIn.setText("150");
		txtPrevestIn.setBounds(434, 254, 80, 22);
		txtPrevestIn.setEditable(false);
		frame.getContentPane().add(txtPrevestIn);
		txtPrevestIn.setColumns(10);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(526, 114, 1, 163);
		frame.getContentPane().add(separator_8);
		
		txtPrevestAp = new JTextField();
		txtPrevestAp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrevestAp.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrevestAp.setText("150");
		txtPrevestAp.setBounds(539, 254, 80, 22);
		txtPrevestAp.setEditable(false);
		frame.getContentPane().add(txtPrevestAp);
		txtPrevestAp.setColumns(10);
		
		JLabel label_1 = new JLabel("*");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(539, 166, 80, 22);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(539, 121, 80, 22);
		frame.getContentPane().add(label_2);
		
		JLabel lblAtivos = new JLabel("ATIVOS");
		lblAtivos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAtivos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtivos.setBounds(341, 88, 56, 16);
		frame.getContentPane().add(lblAtivos);
		
		JLabel lblInativos = new JLabel("INATIVOS");
		lblInativos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInativos.setBounds(434, 88, 80, 16);
		frame.getContentPane().add(lblInativos);
		
		JLabel lblAprovados_1 = new JLabel("APROVADOS");
		lblAprovados_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAprovados_1.setBounds(534, 88, 90, 16);
		frame.getContentPane().add(lblAprovados_1);
		
		JButton btnPrimeiroAno = new JButton("PRIMEIRO ANO");
		btnPrimeiroAno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrimeiroAno.setBounds(151, 115, 155, 35);
		frame.getContentPane().add(btnPrimeiroAno);
		
		JButton btnSegundoAno = new JButton("SEGUNDO ANO");
		btnSegundoAno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSegundoAno.setBounds(151, 160, 155, 35);
		frame.getContentPane().add(btnSegundoAno);
		
		JButton btnTerceiroAno = new JButton("TERCEIRO ANO");
		btnTerceiroAno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTerceiroAno.setBounds(151, 204, 155, 35);
		frame.getContentPane().add(btnTerceiroAno);
		
		JButton btnPrvestibular = new JButton("PR\u00C9-VEST");
		btnPrvestibular.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrvestibular.setBounds(151, 248, 155, 35);
		frame.getContentPane().add(btnPrvestibular);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(151, 106, 468, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(82, 60, 1670, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(82, 330, 800, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(952, 330, 800, 2);
		frame.getContentPane().add(separator_6);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(63, 265, 38, 31);
		frame.getContentPane().add(desktopPane);
		desktopPane.setBackground(SystemColor.menu);
	}
}
