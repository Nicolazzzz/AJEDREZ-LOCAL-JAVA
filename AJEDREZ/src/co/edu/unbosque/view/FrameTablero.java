package co.edu.unbosque.view;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class FrameTablero extends JFrame {

	public FrameTablero() {
		this.setTitle("Ajedrez");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(1000, 1000);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		PanelTablero pt = new PanelTablero();
		this.add(pt);
		
		this.setLayout(new GridBagLayout());
	}

}
