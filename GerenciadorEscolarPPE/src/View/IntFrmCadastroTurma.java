package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IntFrmCadastroTurma extends JInternalFrame {


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntFrmCadastroTurma frame = new IntFrmCadastroTurma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public IntFrmCadastroTurma() {
		setBounds(100, 100, 450, 300);

	}

}
