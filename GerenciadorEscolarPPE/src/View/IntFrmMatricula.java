package View;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class IntFrmMatricula extends JInternalFrame {

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chckbxPrimeiroano, chckbxSegundoAno, chckbxTerceiroAno, chckbxPreVest, chckbxRespfinanaluno;
	private JTextField txtEmail, txtNome, txtNomeSocial, txtRg, txtRua, txtNumeroCasa, txtBairro, txtCidade;
	private JLabel lblCelular, lblEmail, lblCpf, lblRg, lblrgExp, lblNasc, label;
	private JComboBox cboxOrgExpedidor, cboxEstado, cboxSexo, comboBox;
	private JFormattedTextField frmCelularAluno, frmCpfAluno, frmNascAluno, frmCepAluno;;
	private JButton btnFiliacao, btnRespfinanceiro;
	private JRadioButton rdbtnNomeSocial;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntFrmMatricula frame = new IntFrmMatricula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private MaskFormatter Mascara(String Mascara) { // MÁSCARA DE FORMATAÇÃO DE CAMPOS DE TEXTO
		MaskFormatter Mask = new MaskFormatter();
		try {
			Mask.setMask(Mascara);
			Mask.setPlaceholderCharacter(' ');
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Mask;
	}

	private void configNomeSocial() {
		if (rdbtnNomeSocial.isSelected()) {
			txtNomeSocial.setEnabled(true);
		} else {
			txtNomeSocial.setText("");
			txtNomeSocial.setEnabled(false);
		}
	}

	private void invokTelaFiliacao() {
		Filiacao dialog = new Filiacao();
		dialog.setVisible(true);
	}

	private void invokTelaResponsavel() {
		Responsavel dialog = new Responsavel();
		dialog.setVisible(true);
	}

	public void setPosicao() {
		Dimension d = this.getDesktopPane().getSize();
		this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
	}

	public IntFrmMatricula() {
		setBackground(SystemColor.menu);
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 1060, 555);
		getContentPane().setLayout(null);

		chckbxPrimeiroano = new JCheckBox("PRIMEIRO ANO");
		buttonGroup.add(chckbxPrimeiroano);
		chckbxPrimeiroano.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxPrimeiroano.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxPrimeiroano.setBounds(87, 55, 155, 25);
		getContentPane().add(chckbxPrimeiroano);

		chckbxSegundoAno = new JCheckBox("SEGUNDO ANO");
		buttonGroup.add(chckbxSegundoAno);
		chckbxSegundoAno.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxSegundoAno.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxSegundoAno.setBounds(329, 55, 155, 25);
		getContentPane().add(chckbxSegundoAno);

		chckbxTerceiroAno = new JCheckBox("TERCEIRO ANO");
		buttonGroup.add(chckbxTerceiroAno);
		chckbxTerceiroAno.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxTerceiroAno.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTerceiroAno.setBounds(571, 55, 155, 25);
		getContentPane().add(chckbxTerceiroAno);

		chckbxPreVest = new JCheckBox("PR\u00C9-VESTIBULAR");
		buttonGroup.add(chckbxPreVest);
		chckbxPreVest.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxPreVest.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxPreVest.setBounds(813, 55, 155, 25);
		getContentPane().add(chckbxPreVest);

		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(50, 110, 56, 16);
		getContentPane().add(lblNome);

		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setBounds(109, 107, 686, 22);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel txtSexo = new JLabel("SEXO:");
		txtSexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSexo.setBounds(867, 110, 56, 16);
		getContentPane().add(txtSexo);

		cboxSexo = new JComboBox();
		cboxSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboxSexo.setModel(new DefaultComboBoxModel(new String[] { "---", "F", "M" }));
		cboxSexo.setBounds(926, 104, 81, 22);
		getContentPane().add(cboxSexo);

		rdbtnNomeSocial = new JRadioButton("NOME SOCIAL:");
		rdbtnNomeSocial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configNomeSocial();
			}
		});
		rdbtnNomeSocial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNomeSocial.setBounds(50, 143, 121, 25);
		getContentPane().add(rdbtnNomeSocial);

		txtNomeSocial = new JTextField();
		txtNomeSocial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNomeSocial.setText(" ");
		txtNomeSocial.setBounds(173, 144, 622, 22);
		getContentPane().add(txtNomeSocial);
		txtNomeSocial.setColumns(10);
		txtNomeSocial.setEnabled(false);

		lblCelular = new JLabel("CELULAR:");
		lblCelular.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCelular.setBounds(50, 188, 70, 16);
		getContentPane().add(lblCelular);

		lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(278, 188, 62, 16);
		getContentPane().add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEmail.setBounds(343, 185, 265, 22);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCpf.setBounds(50, 226, 37, 16);
		getContentPane().add(lblCpf);

		lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRg.setBounds(244, 226, 37, 16);
		getContentPane().add(lblRg);

		txtRg = new JTextField();
		txtRg.setHorizontalAlignment(SwingConstants.CENTER);
		txtRg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRg.setBounds(278, 223, 164, 22);
		getContentPane().add(txtRg);
		txtRg.setColumns(10);

		lblrgExp = new JLabel("\u00D3RG. EXP.:");
		lblrgExp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblrgExp.setBounds(471, 226, 81, 16);
		getContentPane().add(lblrgExp);

		cboxOrgExpedidor = new JComboBox();
		cboxOrgExpedidor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboxOrgExpedidor.setModel(new DefaultComboBoxModel(new String[] { "",
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
		cboxOrgExpedidor.setBounds(555, 223, 121, 22);
		getContentPane().add(cboxOrgExpedidor);

		lblNasc = new JLabel("NASC.:");
		lblNasc.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNasc.setBounds(635, 188, 56, 16);
		getContentPane().add(lblNasc);

		btnFiliacao = new JButton("A");
		btnFiliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				invokTelaFiliacao();
			}
		});
		btnFiliacao.setBounds(867, 223, 140, 25);
		getContentPane().add(btnFiliacao);

		JSeparator separator = new JSeparator();
		separator.setBounds(50, 258, 957, 2);
		getContentPane().add(separator);

		JLabel lblRua = new JLabel("RUA:");
		lblRua.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRua.setBounds(50, 272, 37, 16);
		getContentPane().add(lblRua);

		txtRua = new JTextField();
		txtRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRua.setBounds(92, 269, 325, 22);
		getContentPane().add(txtRua);
		txtRua.setColumns(10);

		JLabel lblNmero = new JLabel("N\u00DAMERO:");
		lblNmero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNmero.setBounds(445, 272, 70, 16);
		getContentPane().add(lblNmero);

		txtNumeroCasa = new JTextField();
		txtNumeroCasa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNumeroCasa.setBounds(522, 269, 116, 22);
		getContentPane().add(txtNumeroCasa);
		txtNumeroCasa.setColumns(10);

		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBairro.setBounds(50, 309, 70, 16);
		getContentPane().add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBairro.setBounds(120, 306, 220, 22);
		getContentPane().add(txtBairro);
		txtBairro.setColumns(10);

		JLabel lblCidade = new JLabel("CIDADE:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCidade.setBounds(372, 309, 70, 16);
		getContentPane().add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCidade.setBounds(441, 306, 206, 22);
		getContentPane().add(txtCidade);
		txtCidade.setColumns(10);

		JLabel lblEstado = new JLabel("UF:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEstado.setBounds(693, 309, 30, 16);
		getContentPane().add(lblEstado);

		cboxEstado = new JComboBox();
		cboxEstado.setModel(new DefaultComboBoxModel(
				new String[] { "----", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG",
						"PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		cboxEstado.setBounds(727, 306, 68, 22);
		getContentPane().add(cboxEstado);

		JLabel lblCep = new JLabel("CEP.:");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCep.setBounds(659, 272, 37, 16);
		getContentPane().add(lblCep);

		btnRespfinanceiro = new JButton("RESPONS\u00C1VEL");
		btnRespfinanceiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				invokTelaResponsavel();
			}
		});
		btnRespfinanceiro.setBounds(867, 269, 140, 25);
		getContentPane().add(btnRespfinanceiro);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 338, 957, 2);
		getContentPane().add(separator_1);

		label = new JLabel("UF:");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(693, 226, 30, 16);
		getContentPane().add(label);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "----", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG",
						"PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		comboBox.setBounds(727, 223, 68, 22);
		getContentPane().add(comboBox);

		frmCelularAluno = new JFormattedTextField(Mascara("(##) #####-####"));
		frmCelularAluno.setHorizontalAlignment(SwingConstants.CENTER);
		frmCelularAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmCelularAluno.setBounds(132, 185, 121, 22);
		getContentPane().add(frmCelularAluno);

		frmCpfAluno = new JFormattedTextField(Mascara("###.###.###-##"));
		frmCpfAluno.setHorizontalAlignment(SwingConstants.CENTER);
		frmCpfAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmCpfAluno.setBounds(87, 223, 121, 22);
		getContentPane().add(frmCpfAluno);

		frmNascAluno = new JFormattedTextField(Mascara("##/##/####"));
		frmNascAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmNascAluno.setHorizontalAlignment(SwingConstants.CENTER);
		frmNascAluno.setBounds(701, 185, 94, 22);
		getContentPane().add(frmNascAluno);

		frmCepAluno = new JFormattedTextField(Mascara("##.###-###"));
		frmCepAluno.setHorizontalAlignment(SwingConstants.CENTER);
		frmCepAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmCepAluno.setBounds(708, 269, 87, 22);
		getContentPane().add(frmCepAluno);
		
		chckbxRespfinanaluno = new JCheckBox("");
		chckbxRespfinanaluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxRespfinanaluno.setBounds(877, 144, 25, 32);
		getContentPane().add(chckbxRespfinanaluno);
		
		JLabel lblFinanceiro = new JLabel(" FINANCEIRO");
		lblFinanceiro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFinanceiro.setBounds(906, 160, 101, 16);
		getContentPane().add(lblFinanceiro);
		
		JLabel lblNewLabel = new JLabel("RESPONS\u00C1VEL");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(910, 139, 97, 16);
		getContentPane().add(lblNewLabel);

	}
}