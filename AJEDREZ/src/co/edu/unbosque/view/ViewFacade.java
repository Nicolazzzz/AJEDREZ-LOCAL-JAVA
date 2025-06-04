package co.edu.unbosque.view;

public class ViewFacade {

	FrameTablero pt = new FrameTablero();

	public ViewFacade() {
		// TODO Auto-generated constructor stub
	}

	public ViewFacade(FrameTablero pt) {
		super();
		this.pt = pt;
	}

	public FrameTablero getPt() {
		return pt;
	}

	public void setPt(FrameTablero pt) {
		this.pt = pt;
	}

}
