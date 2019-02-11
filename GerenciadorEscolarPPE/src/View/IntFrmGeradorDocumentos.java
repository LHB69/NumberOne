package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IntFrmGeradorDocumentos extends JInternalFrame {

 static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntFrmGeradorDocumentos frame = new IntFrmGeradorDocumentos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public IntFrmGeradorDocumentos() {
		setBounds(100, 100, 450, 300);

	}

}
