package Inmueble;

public class CPiso extends CInmueble {
	int piNumHabitaciones;
	int piNumBanios;
	
	public CPiso(String psNb, int piCdg, float pfIpc, String psDireccionString, int piPrecio, int piCdgPvc, CPais pioPais, int piNumHabitaciones, int piNumBanios) {
		super(psNb, piCdg, pfIpc, psDireccionString, piPrecio, piCdgPvc, pioPais);
		this.piNumHabitaciones = piNumHabitaciones;
		this.piNumBanios = piNumBanios;
	}

	@Override
	public void mvActualizarPrecio() {
		super.mvActualizarPrecio();
		for (int i = 0; i < this.piNumHabitaciones; i++) {
			this.piPrecio += 1000;
		}
	}
	
	@Override
	public void mvReformar(int iiPresupuesto) {
		super.mvReformar(iiPresupuesto);
	}
}
 