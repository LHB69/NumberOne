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

public class Principal {

	private JFrame frame;
	private JDesktopPane desktopPane;
	private JButton btnMatricula;
	private JTabbedPane tabbedPane;
	private JPanel principal;
	
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
		//frame.setLocation(x, y);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBorder(new LineBorder(SystemColor.activeCaptionText));
		desktopPane.setBackground(SystemColor.menu);
		desktopPane.setBounds(652, 48, 56, 50); //desktopPane.setBounds(67, 448, 1070, 560);
		frame.getContentPane().add(desktopPane);
		
		btnMatricula = new JButton("MATRÍCULA");
		btnMatricula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				invokTelaMatricula();
 
}
		});
		btnMatricula.setBounds(67, 48, 125, 62);
		frame.getContentPane().add(btnMatricula);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(88, 140, 1670, 323);
		frame.getContentPane().add(tabbedPane);
		
		principal = new JPanel();
		tabbedPane.addTab("PRINCIPAL", null, principal, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("CADASTROS", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("CONSULTAS", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
	}
}
