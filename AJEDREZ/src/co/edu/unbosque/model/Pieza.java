package co.edu.unbosque.model;

public class Pieza {

	public ColorPieza color;
	public int posX;
	public int posY;

	public Pieza() {
		// TODO Auto-generated constructor stub
	}

	public Pieza(ColorPieza color, int posX, int posY) {
		super();
		this.color = color;
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public ColorPieza getColor() {
		return color;
	}

	public void setColor(ColorPieza color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pieza [color=" + color + ", posX=" + posX + ", posY=" + posY + "]";
	}
	
}
