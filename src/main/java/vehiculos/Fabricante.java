package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	int frecuencia;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<>();

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		pais.frecuencia++;
		fabricantes.add(this);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricante = null;
		for (Fabricante f : fabricantes) {
			try {
				if (f.frecuencia > fabricante.frecuencia) {
					fabricante = f;
				}
			} catch (Exception e) {
				fabricante = f;
			}
		}
		return fabricante;
	}
}
