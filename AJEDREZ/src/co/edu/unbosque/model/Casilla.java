package co.edu.unbosque.model;

public class Casilla {

	public ColorPieza color;
	public int posX;
	public int posY;
	public boolean estaOcupada;

	public Casilla() {
		// TODO Auto-generated constructor stub
	}

	public Casilla(ColorPieza color, int posX, int posY, boolean estaOcupada) {
		super();
		this.color = color;
		this.posX = posX;
		this.posY = posY;
		this.estaOcupada = estaOcupada;
	}

	public ColorPieza getColor() {
		return color;
	}

	public void setColor(ColorPieza color) {
		this.color = color;
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

	public boolean isEstaOcupada() {
		return estaOcupada;
	}

	public void setEstaOcupada(boolean estaOcupada) {
		this.estaOcupada = estaOcupada;
	}

	@Override
	public String toString() {
		return "Casilla [color=" + color + ", posX=" + posX + ", posY=" + posY + ", estaOcupada=" + estaOcupada + "]";
	}

}
