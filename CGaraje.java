package Inmueble;

public class CGaraje extends CInmueble {
	int piNumPlazas;

	public CGaraje(String psNb, int piCdg, float pfIpc, String psDireccionString, int piPrecio, int piCdgPvc, CPais pioPais, int piNumPlazas) {
		super(psNb, piCdg, pfIpc, psDireccionString, piPrecio, piCdgPvc, pioPais);
		this.piNumPlazas = piNumPlazas;
	}
	
	@Override
	public void mvActualizarPrecio() {
		super.mvActualizarPrecio();
		this.piPrecio *= 0.1;
	}
	
	@Override
	public void mvReformar(int iiPresupuesto) {
		super.mvReformar(iiPresupuesto);
		if (this.piNumPlazas > 1) {
			this.piNumPlazas -= 1;
		}
	}
}
