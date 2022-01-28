package Inmueble;

public class CPais extends CProvincia {
static CProvincia[] paoProvincia = {new CProvincia("Madrid", 28, 0.5f),
									new CProvincia("Toledo", 45, 1.5f),
									new CProvincia("Segovia", 40, 2.5f),
									new CProvincia("Avila", 5, 3.5f)};

	public CPais(String psNb, int piCdg, float pfIpc) {
		super(psNb, piCdg, pfIpc);
	}
}
