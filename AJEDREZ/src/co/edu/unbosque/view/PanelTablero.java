package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PanelTablero extends JPanel{

	int tamCasilla = 85;
	
	int col = 8;
	int fil = 8;
	
	public PanelTablero() {
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(col * tamCasilla, fil * tamCasilla));
	}
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		for ( int i = 0; i<fil; i++) {
			for(int j = 0; j<col; j++) {
				g2d.setColor((j+i)%2==0 ? new Color(235,236,208) : new Color(115, 149, 82));
				g2d.fillRect(j*tamCasilla, i*tamCasilla, tamCasilla, tamCasilla);
			}
		}
		
		
	}
}
