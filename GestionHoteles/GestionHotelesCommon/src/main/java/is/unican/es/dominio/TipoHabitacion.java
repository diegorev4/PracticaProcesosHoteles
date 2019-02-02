package is.unican.es.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoHabitacion implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
