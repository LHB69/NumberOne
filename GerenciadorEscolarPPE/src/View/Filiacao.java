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
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class Filiacao extends JDialog {

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JPanel contentPane;
	private JTextField txtRgOutro, txtEmailOutro, txtNomeOutroResponsavel, txtEmailPai, txtRgPai, txtNomePai, txtEmailMae, txtRgMae, txtNomeMae;
	private JComboBox cboxEstCivilMae, cboxOrgExpRgMae, cboxOrgExpOutro, cboxUfRgOutro, cboxEstCivilOutro; 
	private JLabel label_6, label_14, label_15, label_16, label_17, label_18, label_19, label_20, lblResponsvel, lblFinanceiro, label_21, label_22;
	private JFormattedTextField frmCelularOutro;
	private JButton btnSalvar;
	private JFormattedTextField frmCpfOutro; 
	private JCheckBox chckbxRespFinanPai, chckbxRespFinanMae, chckboxOutroResponsavel;
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
					Filiacao dialog = new Filiacao();
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
	private void configTela() { // DA ÁREA DE OUTRO RESPONSÁVEL
		if(chckboxOutroResponsavel.isSelected()) {	
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
			chckbxRespFinanMae.setEnabled(false);
			chckbxRespFinanPai.setEnabled(false);
		} else {
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
			label_19.setEnabled(false);
			cboxUfRgOutro.setEnabled(false);
			label_20.setEnabled(false);
			frmCpfOutro.setEnabled(false);
			label_16.setEnabled(false);
			cboxEstCivilOutro.setEnabled(false);
			txtRgOutro.setText("");
			frmCpfOutro.setText("");
			cboxEstCivilOutro.setSelectedIndex(0);
			cboxUfRgOutro.setSelectedIndex(0);
			cboxOrgExpOutro.setSelectedIndex(0);
			chckbxRespFinanMae.setEnabled(true);
			chckbxRespFinanPai.setEnabled(true);
		}
	}
	
	public Filiacao() {
		setModal(true);
		setBounds(100, 100, 890, 680);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 890, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JLabel label = new JLabel("NOME DA M\u00C3E:");
		label.setBounds(58, 47, 111, 16);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label);

		txtNomeMae = new JTextField();
		txtNomeMae.setBounds(173, 44, 351, 22);
		txtNomeMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNomeMae.setColumns(10);
		contentPane.add(txtNomeMae);

		JLabel label_1 = new JLabel("ESTADO CIVIL:");
		label_1.setBounds(559, 47, 111, 16);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_1);

		cboxEstCivilMae = new JComboBox();
		cboxEstCivilMae.setModel(new DefaultComboBoxModel(new String[] {"-----------", "SOLTEIRO(A)", "CASADO(A)", "SEPARADO(A)", "DIVORCIADO(A)", "VI\u00DAVO(A)"}));
		cboxEstCivilMae.setBounds(682, 44, 121, 22);
		cboxEstCivilMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(cboxEstCivilMae);

		JLabel label_2 = new JLabel("RG:");
		label_2.setBounds(58, 87, 30, 16);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_2);

		txtRgMae = new JTextField();
		txtRgMae.setBounds(95, 84, 140, 22);
		txtRgMae.setHorizontalAlignment(SwingConstants.CENTER);
		txtRgMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRgMae.setColumns(10);
		contentPane.add(txtRgMae);

		JLabel label_3 = new JLabel("\u00D3RG. EXP.:");
		label_3.setBounds(262, 87, 81, 16);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_3);

		cboxOrgExpRgMae = new JComboBox();
		cboxOrgExpRgMae.setBounds(352, 84, 121, 22);
		cboxOrgExpRgMae.setModel(new DefaultComboBoxModel(new String[] {"", "SSP - Secretaria de Seguran\u00E7a P\u00FAblica", "PM - Pol\u00EDcia Militar", "PC - Policia Civil", "CNT - Carteira Nacional de Habilita\u00E7\u00E3o", "DIC - Diretoria de Identifica\u00E7\u00E3o Civil", "CTPS - Carteira de Trabaho e Previd\u00EAncia Social", "FGTS - Fundo de Garantia do Tempo de Servi\u00E7o", "IFP - Instituto F\u00E9lix Pacheco", "IPF - Instituto Pereira Faustino", "IML - Instituto M\u00E9dico-Legal", "MTE - Minist\u00E9rio do Trabalho e Emprego", "MMA - Minist\u00E9rio da Marinha", "MAE - Minist\u00E9rio da Aeron\u00E1utica", "MEX - Minist\u00E9rio do Ex\u00E9rcito", "POF - Pol\u00EDcia Federal", "POM - Pol\u00EDcia Militar", "SES - Carteira de Estrangeiro", "SJS - Secretaria da Justi\u00E7a e Seguran\u00E7a", "SJTS - Secretaria da Justi\u00E7a do Trabalho e Seguran\u00E7a", "ZZZ - Outros (inclusive exterior) "}));
		cboxOrgExpRgMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(cboxOrgExpRgMae);

		JLabel label_4 = new JLabel("UF:");
		label_4.setBounds(511, 87, 30, 16);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_4);

		JComboBox cboxUfRgMae = new JComboBox();
		cboxUfRgMae.setBounds(543, 84, 68, 22);
		cboxUfRgMae.setModel(new DefaultComboBoxModel(
				new String[] { "----", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG",
						"PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		contentPane.add(cboxUfRgMae);

		JLabel label_5 = new JLabel("CPF:");
		label_5.setBounds(637, 87, 37, 16);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_5);

		JFormattedTextField frmCpfMae = new JFormattedTextField();
		frmCpfMae.setBounds(682, 84, 121, 22);
		frmCpfMae.setHorizontalAlignment(SwingConstants.CENTER);
		frmCpfMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(frmCpfMae);

		JLabel lblCelular = new JLabel("CELULAR:");
		lblCelular.setBounds(58, 127, 70, 16);
		lblCelular.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblCelular);

		JFormattedTextField frmCelularMae = new JFormattedTextField();
		frmCelularMae.setBounds(140, 124, 121, 22);
		frmCelularMae.setHorizontalAlignment(SwingConstants.CENTER);
		frmCelularMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(frmCelularMae);

		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setBounds(295, 127, 62, 16);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblEmail);

		txtEmailMae = new JTextField();
		txtEmailMae.setBounds(362, 124, 291, 22);
		txtEmailMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(txtEmailMae);
		txtEmailMae.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(58, 225, 745, 5);
		contentPane.add(separator);

		JLabel lblNomeDoPai = new JLabel("NOME DO PAI:");
		lblNomeDoPai.setBounds(58, 239, 111, 16);
		lblNomeDoPai.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNomeDoPai);

		txtNomePai = new JTextField();
		txtNomePai.setBounds(173, 236, 351, 22);
		txtNomePai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNomePai.setColumns(10);
		contentPane.add(txtNomePai);

		JLabel label_7 = new JLabel("ESTADO CIVIL:");
		label_7.setBounds(559, 239, 111, 16);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_7);

		JComboBox cboxEstCivilPai = new JComboBox();
		cboxEstCivilPai.setModel(new DefaultComboBoxModel(new String[] {"-----------", "SOLTEIRO(A)", "CASADO(A)", "SEPARADO(A)", "DIVORCIADO(A)", "VI\u00DAVO(A)"}));
		cboxEstCivilPai.setBounds(682, 236, 121, 22);
		cboxEstCivilPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(cboxEstCivilPai);

		JLabel label_8 = new JLabel("RG:");
		label_8.setBounds(58, 274, 30, 16);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_8);

		txtRgPai = new JTextField();
		txtRgPai.setBounds(95, 271, 140, 22);
		txtRgPai.setHorizontalAlignment(SwingConstants.CENTER);
		txtRgPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRgPai.setColumns(10);
		contentPane.add(txtRgPai);

		JLabel label_9 = new JLabel("\u00D3RG. EXP.:");
		label_9.setBounds(262, 274, 81, 16);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_9);

		JComboBox cboxOrgExpRgPai = new JComboBox();
		cboxOrgExpRgPai.setBounds(352, 271, 121, 22);
		cboxOrgExpRgPai.setModel(new DefaultComboBoxModel(new String[] { "",
				"SSP - Secretaria de Seguran\u00E7a P\u00FAblica", "PM - Pol\u00EDcia Militar", "PC - Policia Civil",
				"CNT - Carteira Nacional de Habilita\u00E7\u00E3o", "DIC - Diretoria de Identifica\u00E7\u00E3o Civil",
				"CTPS - Carteira de Trabaho e Previd\u00EAncia Social",
				"FGTS - Fundo de Garantia do Tempo de Servi\u00E7o", "IFP - Instituto F\u00E9lix Pacheco",
				"IPF - Instituto Pereira Faustino", "IML - Instituto M\u00E9dico-Legal",
				"MTE - Minist\u00E9rio do Trabalho e Emprego", "MMA - Minist\u00E9rio da Marinha",
				"MAE - Minist\u00E9rio da Aeron\u00E1utica", "MEX - Minist\u00E9rio do Ex\u00E9rcito",
				"POF - Pol\u00EDcia Federal", "POM - Pol\u00EDcia Militar", "SES - Carteira de Estrangeiro",
				"SJS - Secretaria da Justi\u00E7a e Seguran\u00E7a",
				"SJTS - Secretaria da Justi\u00E7a do Trabalho e Seguran\u00E7a",
				"ZZZ - Outros (inclusive exterior) " }));
		cboxOrgExpRgPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(cboxOrgExpRgPai);

		JLabel label_10 = new JLabel("UF:");
		label_10.setBounds(511, 274, 30, 16);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_10);

		JComboBox cboxUfRgPai = new JComboBox();
		cboxUfRgPai.setBounds(543, 271, 68, 22);
		cboxUfRgPai.setModel(new DefaultComboBoxModel(new String[] {"----", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		contentPane.add(cboxUfRgPai);

		JLabel label_11 = new JLabel("CPF:");
		label_11.setBounds(637, 274, 37, 16);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_11);

		JFormattedTextField frmCpfPai = new JFormattedTextField();
		frmCpfPai.setBounds(682, 271, 121, 22);
		frmCpfPai.setHorizontalAlignment(SwingConstants.CENTER);
		frmCpfPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(frmCpfPai);

		JLabel label_12 = new JLabel("CELULAR:");
		label_12.setBounds(58, 314, 70, 16);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_12);

		JFormattedTextField frmCelularPai = new JFormattedTextField();
		frmCelularPai.setBounds(140, 311, 121, 22);
		frmCelularPai.setHorizontalAlignment(SwingConstants.CENTER);
		frmCelularPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(frmCelularPai);

		JLabel label_13 = new JLabel("E-MAIL:");
		label_13.setBounds(295, 314, 62, 16);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(label_13);

		txtEmailPai = new JTextField();
		txtEmailPai.setBounds(362, 311, 291, 22);
		txtEmailPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEmailPai.setColumns(10);
		contentPane.add(txtEmailPai);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(58, 412, 745, 5);
		contentPane.add(separator_1);

		label_6 = new JLabel("NOME:");
		label_6.setBounds(58, 461, 56, 16);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setEnabled(false);
		contentPane.add(label_6);

		txtNomeOutroResponsavel = new JTextField();
		txtNomeOutroResponsavel.setBounds(117, 458, 407, 22);
		txtNomeOutroResponsavel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNomeOutroResponsavel.setColumns(10);
		txtNomeOutroResponsavel.setEnabled(false);
		contentPane.add(txtNomeOutroResponsavel);

		label_14 = new JLabel("CELULAR:");
		label_14.setBounds(58, 526, 70, 16);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setEnabled(false);
		contentPane.add(label_14);

		label_15 = new JLabel("E-MAIL:");
		label_15.setBounds(286, 526, 62, 16);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_15.setEnabled(false);
		contentPane.add(label_15);

		txtEmailOutro = new JTextField();
		txtEmailOutro.setBounds(351, 523, 452, 22);
		txtEmailOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEmailOutro.setColumns(10);
		txtEmailOutro.setEnabled(false);
		contentPane.add(txtEmailOutro);

		frmCelularOutro = new JFormattedTextField();
		frmCelularOutro.setBounds(140, 523, 121, 22);
		frmCelularOutro.setHorizontalAlignment(SwingConstants.CENTER);
		frmCelularOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmCelularOutro.setEnabled(false);
		contentPane.add(frmCelularOutro);

		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(706, 573, 97, 25);
		contentPane.add(btnSalvar);
		
		label_16 = new JLabel("ESTADO CIVIL:");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setBounds(559, 458, 111, 16);
		label_16.setEnabled(false);
		contentPane.add(label_16);
		
		cboxEstCivilOutro = new JComboBox();
		cboxEstCivilOutro.setModel(new DefaultComboBoxModel(new String[] {"-----------", "SOLTEIRO(A)", "CASADO(A)", "SEPARADO(A)", "DIVORCIADO(A)", "VI\u00DAVO(A)"}));
		cboxEstCivilOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboxEstCivilOutro.setBounds(682, 455, 121, 22);
		cboxEstCivilOutro.setEnabled(false);
		contentPane.add(cboxEstCivilOutro);
		
		label_17 = new JLabel("RG:");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(58, 494, 30, 16);
		label_17.setEnabled(false);
		contentPane.add(label_17);
		
		txtRgOutro = new JTextField();
		txtRgOutro.setHorizontalAlignment(SwingConstants.CENTER);
		txtRgOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRgOutro.setColumns(10);
		txtRgOutro.setBounds(95, 491, 140, 22);
		txtRgOutro.setEnabled(false);
		contentPane.add(txtRgOutro);
		
		label_18 = new JLabel("\u00D3RG. EXP.:");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_18.setBounds(262, 494, 81, 16);
		label_18.setEnabled(false);
		contentPane.add(label_18);
		
		cboxOrgExpOutro = new JComboBox();
		cboxOrgExpOutro.setModel(new DefaultComboBoxModel(new String[] {"", "SSP - Secretaria de Seguran\u00E7a P\u00FAblica", "PM - Pol\u00EDcia Militar", "PC - Policia Civil", "CNT - Carteira Nacional de Habilita\u00E7\u00E3o", "DIC - Diretoria de Identifica\u00E7\u00E3o Civil", "CTPS - Carteira de Trabaho e Previd\u00EAncia Social", "FGTS - Fundo de Garantia do Tempo de Servi\u00E7o", "IFP - Instituto F\u00E9lix Pacheco", "IPF - Instituto Pereira Faustino", "IML - Instituto M\u00E9dico-Legal", "MTE - Minist\u00E9rio do Trabalho e Emprego", "MMA - Minist\u00E9rio da Marinha", "MAE - Minist\u00E9rio da Aeron\u00E1utica", "MEX - Minist\u00E9rio do Ex\u00E9rcito", "POF - Pol\u00EDcia Federal", "POM - Pol\u00EDcia Militar", "SES - Carteira de Estrangeiro", "SJS - Secretaria da Justi\u00E7a e Seguran\u00E7a", "SJTS - Secretaria da Justi\u00E7a do Trabalho e Seguran\u00E7a", "ZZZ - Outros (inclusive exterior) "}));
		cboxOrgExpOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboxOrgExpOutro.setBounds(352, 491, 121, 22);
		cboxOrgExpOutro.setEnabled(false);
		contentPane.add(cboxOrgExpOutro);
		
		label_19 = new JLabel("UF:");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_19.setBounds(511, 494, 30, 16);
		label_19.setEnabled(false);
		contentPane.add(label_19);
		
		cboxUfRgOutro = new JComboBox();
		cboxUfRgOutro.setModel(new DefaultComboBoxModel(new String[] {"----", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cboxUfRgOutro.setBounds(543, 491, 68, 22);
		cboxUfRgOutro.setEnabled(false);
		contentPane.add(cboxUfRgOutro);
		
		label_20 = new JLabel("CPF:");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_20.setBounds(637, 494, 37, 16);
		label_20.setEnabled(false);
		contentPane.add(label_20);
		
		frmCpfOutro = new JFormattedTextField();
		frmCpfOutro.setHorizontalAlignment(SwingConstants.CENTER);
		frmCpfOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmCpfOutro.setBounds(682, 491, 121, 22);
		frmCpfOutro.setEnabled(false);
		contentPane.add(frmCpfOutro);
		
		chckboxOutroResponsavel = new JCheckBox("    OUTRO RESPONS\u00C1VEL?");
		chckboxOutroResponsavel.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckboxOutroResponsavel.setHorizontalAlignment(SwingConstants.CENTER);
		chckboxOutroResponsavel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configTela();
			}
		});
		chckboxOutroResponsavel.setBounds(58, 426, 213, 25);
		contentPane.add(chckboxOutroResponsavel);
		
		chckbxRespFinanPai = new JCheckBox("");
		buttonGroup_1.add(chckbxRespFinanPai);
		chckbxRespFinanPai.setBounds(673, 305, 25, 25);
		contentPane.add(chckbxRespFinanPai);
		
		chckbxRespFinanMae = new JCheckBox("");
		chckbxRespFinanMae.setMnemonic('0');
		buttonGroup_1.add(chckbxRespFinanMae);
		chckbxRespFinanMae.setBounds(673, 118, 25, 25);
		contentPane.add(chckbxRespFinanMae);
		
		lblResponsvel = new JLabel("RESPONS\u00C1VEL");
		lblResponsvel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResponsvel.setBounds(706, 114, 97, 16);
		contentPane.add(lblResponsvel);
		
		lblFinanceiro = new JLabel("FINANCEIRO");
		lblFinanceiro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFinanceiro.setBounds(706, 130, 97, 16);
		contentPane.add(lblFinanceiro);
		
		label_21 = new JLabel("RESPONS\u00C1VEL");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_21.setBounds(706, 302, 97, 16);
		contentPane.add(label_21);
		
		label_22 = new JLabel("FINANCEIRO");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_22.setBounds(706, 318, 97, 16);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("RUA:");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_23.setBounds(58, 159, 37, 16);
		contentPane.add(label_23);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(100, 156, 325, 22);
		contentPane.add(textField);
		
		JLabel label_24 = new JLabel("N\u00DAMERO:");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_24.setBounds(453, 159, 70, 16);
		contentPane.add(label_24);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(530, 156, 116, 22);
		contentPane.add(textField_1);
		
		JLabel label_25 = new JLabel("BAIRRO:");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_25.setBounds(58, 196, 70, 16);
		contentPane.add(label_25);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(128, 193, 220, 22);
		contentPane.add(textField_2);
		
		JLabel label_26 = new JLabel("CIDADE:");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_26.setBounds(380, 196, 70, 16);
		contentPane.add(label_26);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(449, 193, 206, 22);
		contentPane.add(textField_3);
		
		JLabel label_27 = new JLabel("UF:");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_27.setBounds(701, 196, 30, 16);
		contentPane.add(label_27);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(735, 193, 68, 22);
		contentPane.add(comboBox);
		
		JLabel label_28 = new JLabel("CEP.:");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_28.setBounds(667, 159, 37, 16);
		contentPane.add(label_28);
		
		JFormattedTextField formattedTextField = new JFormattedTextField((AbstractFormatter) null);
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextField.setBounds(716, 156, 87, 22);
		contentPane.add(formattedTextField);
		
		JLabel label_29 = new JLabel("RUA:");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_29.setBounds(58, 346, 37, 16);
		contentPane.add(label_29);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(100, 343, 325, 22);
		contentPane.add(textField_4);
		
		JLabel label_30 = new JLabel("N\u00DAMERO:");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_30.setBounds(453, 346, 70, 16);
		contentPane.add(label_30);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(530, 343, 116, 22);
		contentPane.add(textField_5);
		
		JLabel label_31 = new JLabel("BAIRRO:");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_31.setBounds(58, 383, 70, 16);
		contentPane.add(label_31);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(128, 380, 220, 22);
		contentPane.add(textField_6);
		
		JLabel label_32 = new JLabel("CIDADE:");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_32.setBounds(380, 383, 70, 16);
		contentPane.add(label_32);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(449, 380, 206, 22);
		contentPane.add(textField_7);
		
		JLabel label_33 = new JLabel("UF:");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_33.setBounds(701, 383, 30, 16);
		contentPane.add(label_33);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(735, 380, 68, 22);
		contentPane.add(comboBox_1);
		
		JLabel label_34 = new JLabel("CEP.:");
		label_34.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_34.setBounds(667, 346, 37, 16);
		contentPane.add(label_34);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField((Object) null);
		formattedTextField_1.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextField_1.setBounds(716, 343, 87, 22);
		contentPane.add(formattedTextField_1);
	}
}
