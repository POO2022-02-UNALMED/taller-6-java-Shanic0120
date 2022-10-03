package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	int frecuencia = 0;
	private static ArrayList<Pais> paises = new ArrayList<>();

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Pais paisMasVendedor() {
		Pais pais = null;
		for (Pais p : paises) {
			if (p.frecuencia > pais.frecuencia || pais == null) {
				pais = p;
			}
		}
		return pais;
	}
}
