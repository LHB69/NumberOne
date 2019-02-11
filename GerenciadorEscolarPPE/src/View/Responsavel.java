package View;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Responsavel extends JDialog {

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel contentPane;
	private JTextField txtRgOutro, txtEmailOutro, txtNomeOutroResponsavel, txtEmailPai, txtRgPai, txtNomePai, txtEmailMae, txtRgMae, txtNomeMae;
	private JComboBox cboxEstCivilMae, cboxOrgExpRgMae, cboxOrgExpOutro, cboxUfRgOutro, cboxEstCivilOutro; 
	private JRadioButton rdbtnRespFinanPai, rdbtnRespFinanMae, rdbtnRespFinanOutro, rdbtnRespFinanAluno;
	private JLabel label_6, label_14, label_15, label_16, label_17, label_18, label_19, label_20;
	private JFormattedTextField frmCelularOutro;
	private JButton btnSalvar;
	private int select;


	
	
	private JFormattedTextField frmCpfOutro; 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Responsavel dialog = new Responsavel();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
					dialog.setModal(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

								// MÉTODO QUE ATIVA E DESATIVA OS CAMPOS
	private void configTela() { // DA ÁREA DE OUTRO RESPONSÁVEL FINANCEIRO
		switch (select) { 		
		case 1:
			label_6.setEnabled(true);
			label_14.setEnabled(true);
			label_15.setEnabled(true);
			frmCelularOutro.setEnabled(true);
			txtEmailOutro.setEnabled(true);
			txtNomeOutroResponsavel.setEnabled(true);
			label_17.setEnabled(true);
			txtRgOutro.setEnabled(true);
			label_18.setEnabled(true);
			cboxOrgExpOutro.setEnabled(true);
			label_19.setEnabled(true);
			cboxUfRgOutro.setEnabled(true);
			label_20.setEnabled(true);
			frmCpfOutro.setEnabled(true);
			label_16.setEnabled(true);
			cboxEstCivilOutro.setEnabled(true);
			break;
		case 2:
			label_6.setEnabled(false);
			label_14.setEnabled(false);
			label_15.setEnabled(false);
			frmCelularOutro.setEnabled(false);
			txtEmailOutro.setEnabled(false);
			txtNomeOutroResponsavel.setEnabled(false);
			txtEmailOutro.setText("");
			frmCelularOutro.setText("");
			txtNomeOutroResponsavel.setText("");
			label_17.setEnabled(false);
			txtRgOutro.setEnabled(false);
			label_18.setEnabled(false);
			cboxOrgExpOutro.setEnabled(false);
			cboxOrgExpOutro.setSelectedIndex(0);
			label_19.setEnabled(false);
			cboxUfRgOutro.setEnabled(false);
			cboxUfRgOutro.setSelectedIndex(0);
			label_20.setEnabled(false);
			frmCpfOutro.setEnabled(false);
			label_16.setEnabled(false);
			cboxEstCivilOutro.setEnabled(false);
			cboxEstCivilOutro.setSelectedIndex(0);
			txtRgOutro.setText("");
			frmCpfOutro.setText("");
		default:
			break;
		}
	}
	
	public Responsavel() {
		setModal(true);
		setBounds(100, 100, 890, 280);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 890, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		rdbtnRespFinanMae = new JRadioButton("M\u00E3e");
		rdbtnRespFinanMae.setBounds(364, 26, 121, 25);
		buttonGroup.add(rdbtnRespFinanMae);
		rdbtnRespFinanMae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				select = 2;
				configTela();
			}
		});
		rdbtnRespFinanMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnRespFinanMae.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(rdbtnRespFinanMae);
		
		rdbtnRespFinanPai = new JRadioButton("Pai");
		rdbtnRespFinanPai.setBounds(507, 26, 121, 25);
		buttonGroup.add(rdbtnRespFinanPai);
		rdbtnRespFinanPai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select = 2;
				configTela();
			}
		});
		rdbtnRespFinanPai.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRespFinanPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnRespFinanPai);

		JLabel lblRegistrarComoResponsvel = new JLabel("RESPONS\u00C1VEL:");
		lblRegistrarComoResponsvel.setBounds(112, 30, 121, 16);
		lblRegistrarComoResponsvel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblRegistrarComoResponsvel);

		rdbtnRespFinanOutro = new JRadioButton("Outro");
		rdbtnRespFinanOutro.setBounds(650, 26, 121, 25);
		buttonGroup.add(rdbtnRespFinanOutro);
		rdbtnRespFinanOutro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select = 1;
				configTela();
			}
		});
		rdbtnRespFinanOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnRespFinanOutro.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(rdbtnRespFinanOutro);

		label_6 = new JLabel("NOME:");
		label_6.setBounds(58, 77, 56, 16);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setEnabled(false);
		contentPane.add(label_6);

		txtNomeOutroResponsavel = new JTextField();
		txtNomeOutroResponsavel.setBounds(117, 74, 407, 22);
		txtNomeOutroResponsavel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNomeOutroResponsavel.setColumns(10);
		txtNomeOutroResponsavel.setEnabled(false);
		contentPane.add(txtNomeOutroResponsavel);

		label_14 = new JLabel("CELULAR:");
		label_14.setBounds(58, 142, 70, 16);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setEnabled(false);
		contentPane.add(label_14);

		label_15 = new JLabel("E-MAIL:");
		label_15.setBounds(286, 142, 62, 16);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_15.setEnabled(false);
		contentPane.add(label_15);

		txtEmailOutro = new JTextField();
		txtEmailOutro.setBounds(351, 139, 452, 22);
		txtEmailOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEmailOutro.setColumns(10);
		txtEmailOutro.setEnabled(false);
		contentPane.add(txtEmailOutro);

		frmCelularOutro = new JFormattedTextField();
		frmCelularOutro.setBounds(140, 139, 121, 22);
		frmCelularOutro.setHorizontalAlignment(SwingConstants.CENTER);
		frmCelularOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmCelularOutro.setEnabled(false);
		contentPane.add(frmCelularOutro);

		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(706, 189, 97, 25);
		contentPane.add(btnSalvar);

		rdbtnRespFinanAluno = new JRadioButton("Aluno");
		rdbtnRespFinanAluno.setBounds(221, 26, 121, 25);
		rdbtnRespFinanAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select = 2;
				configTela();
			}
		});
		buttonGroup.add(rdbtnRespFinanAluno);
		rdbtnRespFinanAluno.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRespFinanAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnRespFinanAluno);
		
		label_16 = new JLabel("ESTADO CIVIL:");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setBounds(559, 74, 111, 16);
		label_16.setEnabled(false);
		contentPane.add(label_16);
		
		cboxEstCivilOutro = new JComboBox();
		cboxEstCivilOutro.setModel(new DefaultComboBoxModel(new String[] {"-----------", "SOLTEIRO(A)", "CASADO(A)", "SEPARADO(A)", "DIVORCIADO(A)", "VI\u00DAVO(A)"}));
		cboxEstCivilOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboxEstCivilOutro.setBounds(682, 71, 121, 22);
		cboxEstCivilOutro.setEnabled(false);
		contentPane.add(cboxEstCivilOutro);
		
		label_17 = new JLabel("RG:");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(58, 110, 30, 16);
		label_17.setEnabled(false);
		contentPane.add(label_17);
		
		txtRgOutro = new JTextField();
		txtRgOutro.setHorizontalAlignment(SwingConstants.CENTER);
		txtRgOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRgOutro.setColumns(10);
		txtRgOutro.setBounds(95, 107, 140, 22);
		txtRgOutro.setEnabled(false);
		contentPane.add(txtRgOutro);
		
		label_18 = new JLabel("\u00D3RG. EXP.:");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_18.setBounds(262, 110, 81, 16);
		label_18.setEnabled(false);
		contentPane.add(label_18);
		
		cboxOrgExpOutro = new JComboBox();
		cboxOrgExpOutro.setModel(new DefaultComboBoxModel(new String[] {"", "SSP - Secretaria de Seguran\u00E7a P\u00FAblica", "PM - Pol\u00EDcia Militar", "PC - Policia Civil", "CNT - Carteira Nacional de Habilita\u00E7\u00E3o", "DIC - Diretoria de Identifica\u00E7\u00E3o Civil", "CTPS - Carteira de Trabaho e Previd\u00EAncia Social", "FGTS - Fundo de Garantia do Tempo de Servi\u00E7o", "IFP - Instituto F\u00E9lix Pacheco", "IPF - Instituto Pereira Faustino", "IML - Instituto M\u00E9dico-Legal", "MTE - Minist\u00E9rio do Trabalho e Emprego", "MMA - Minist\u00E9rio da Marinha", "MAE - Minist\u00E9rio da Aeron\u00E1utica", "MEX - Minist\u00E9rio do Ex\u00E9rcito", "POF - Pol\u00EDcia Federal", "POM - Pol\u00EDcia Militar", "SES - Carteira de Estrangeiro", "SJS - Secretaria da Justi\u00E7a e Seguran\u00E7a", "SJTS - Secretaria da Justi\u00E7a do Trabalho e Seguran\u00E7a", "ZZZ - Outros (inclusive exterior) "}));
		cboxOrgExpOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboxOrgExpOutro.setBounds(352, 107, 121, 22);
		cboxOrgExpOutro.setEnabled(false);
		contentPane.add(cboxOrgExpOutro);
		
		label_19 = new JLabel("UF:");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_19.setBounds(511, 110, 30, 16);
		label_19.setEnabled(false);
		contentPane.add(label_19);
		
		cboxUfRgOutro = new JComboBox();
		cboxUfRgOutro.setModel(new DefaultComboBoxModel(new String[] {"----", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cboxUfRgOutro.setBounds(543, 107, 68, 22);
		cboxUfRgOutro.setEnabled(false);
		contentPane.add(cboxUfRgOutro);
		
		label_20 = new JLabel("CPF:");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_20.setBounds(637, 110, 37, 16);
		label_20.setEnabled(false);
		contentPane.add(label_20);
		
		frmCpfOutro = new JFormattedTextField();
		frmCpfOutro.setHorizontalAlignment(SwingConstants.CENTER);
		frmCpfOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmCpfOutro.setBounds(682, 107, 121, 22);
		frmCpfOutro.setEnabled(false);
		contentPane.add(frmCpfOutro);
	}
}

		
