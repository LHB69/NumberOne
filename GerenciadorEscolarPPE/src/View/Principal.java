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

public class Principal {

	private JFrame frame;
	private JDesktopPane desktopPane;
	private JButton btnMatricula;
	private JTabbedPane tabbedPane;
	private JPanel principal;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JTable table;
	
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
		
		desktopPane = new JDesktopPane();
		desktopPane.setBorder(new LineBorder(SystemColor.activeCaptionText));
		desktopPane.setBackground(SystemColor.menu);
		desktopPane.setBounds(88, 496, 1670, 531);
		frame.getContentPane().add(desktopPane);
		
		btnMatricula = new JButton("MATRÍCULA");
		btnMatricula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				invokTelaMatricula();
}
		});
		btnMatricula.setBounds(88, 42, 125, 62);
		frame.getContentPane().add(btnMatricula);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(705, 445, 546, 155);
		frame.getContentPane().add(tabbedPane);
		
		principal = new JPanel();
		tabbedPane.addTab("PRINCIPAL", null, principal, null);
		
		JPanel cadastros = new JPanel();
		tabbedPane.addTab("CADASTROS", null, cadastros, null);
		
		JPanel consultas = new JPanel();
		tabbedPane.addTab("CONSULTAS", null, consultas, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("**********", null, panel_3, null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(82, 404, 1670, 2);
		frame.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(82, 160, 815, 2);
		frame.getContentPane().add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(937, 160, 815, 2);
		frame.getContentPane().add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(937, 175, 815, 190);
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
				false, false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(33);
	}
}
