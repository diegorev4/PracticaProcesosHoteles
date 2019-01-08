package is.unican.es.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoHabitacion {

	@Id
	private int id;
	private String descripcion;
	private double precioPorNoche;
	private int disponibles;
	
	public TipoHabitacion() {
		
	}

	public TipoHabitacion(String descripcion, double precioPorNoche, int disponibles) {
		super();
		this.descripcion = descripcion;
		this.precioPorNoche = precioPorNoche;
		this.disponibles = disponibles;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public int getDisponibles() {
		return disponibles;
	}

	public void setDisponibles(int disponibles) {
		this.disponibles = disponibles;
	}
	
}
