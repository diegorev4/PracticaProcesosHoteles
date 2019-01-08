package is.unican.es.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Hotel {

	@Id
	private String nombre;
	private String localidad;
	private String direccion;
	@OneToMany
	@JoinColumn(name="hotel_fk")
	private List<TipoHabitacion> habitaciones;
	@OneToMany
	@JoinColumn(name="hotel_fk")
	private List<Reserva> reservas;
	
	public Hotel() {
		
	}

	public Hotel(String nombre, String localidad, String direccion, List<TipoHabitacion> habitaciones) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.direccion = direccion;
		this.habitaciones = habitaciones;
	}
	
	public void anhadirHabitacion(TipoHabitacion th) {
		habitaciones.add(th);
	}
	
	public void elimnarHabitacion(TipoHabitacion th) {
		habitaciones.remove(th);
	}
	
	public void anhadirReserva(Reserva r) {
		reservas.add(r);
	}
	
	public void eliminarReserva(int id) {
		for (Reserva reserva : reservas) {
			if (reserva.getId() == id) {
				reservas.remove(reserva);
			}
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<TipoHabitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<TipoHabitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	
}
