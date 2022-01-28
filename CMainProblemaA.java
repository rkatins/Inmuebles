package Inmueble;

import java.util.ArrayList;
//import java.util.Arrays;

public class CMainProblemaA {
	static ArrayList<CInmueble> wlInmueble = new ArrayList<>();
	
	public static void main(String[] args) {
		wlInmueble.add(new CPiso("Piso1", 28, 0.5f, "c/ Alcalá 20", 200000, 28, new CPais("Madrid", 28, 0.5f), 3, 2));						
		wlInmueble.add(new CPiso("Piso2", 5, 3.5f, "c/ Betún 30", 300000, 5, new CPais("Avila", 5, 3.5f), 2, 1));
		wlInmueble.add(new CGaraje("Garaje", 40, 2.5f, "c/ Zapato 40", 40000, 40, new CPais("Segovia", 40, 2.5f), 4));
		
		for (int i = 0; i < wlInmueble.size(); i++) {
			wlInmueble.get(i).mvActualizarPrecio();
			wlInmueble.get(i).mvReformar(2500);
			
			System.out.println(wlInmueble.get(i).psNb + " -> PreciCompra: " + wlInmueble.get(i).piPrecio + "€");
			
			System.out.println("\n");
		}
	}
}
