package Inmueble;

public class CInmueble extends CProvincia {
	String psDireccionString;
	int piPrecio;
	int piCdgPvc;
	CPais pioPais;

	public CInmueble(String psNb, int piCdg, float pfIpc, String psDireccionString, int piPrecio, int piCdgPvc,CPais pioPais) {
		super(psNb, piCdg, pfIpc);
		this.psDireccionString = psDireccionString;
		this.piPrecio = piPrecio;
		this.piCdgPvc = piCdgPvc;
		this.pioPais = pioPais;
	}

	public void mvActualizarPrecio() {
		this.piPrecio *= this.pfIpc;
	}
	
	public void mvReformar(int iiPresupuesto) {
		this.piPrecio += iiPresupuesto;
	}
}
