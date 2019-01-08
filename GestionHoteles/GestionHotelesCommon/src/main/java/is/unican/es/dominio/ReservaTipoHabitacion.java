package is.unican.es.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ReservaTipoHabitacion {

	@Id
	private int id;
	private int numHabitaciones;
	@OneToOne
	@JoinColumn(name="tipoHabitacion_fk")
	private TipoHabitacion tipoHabitacion;
	@OneToOne
	@JoinColumn(name="reserva_fk")
	private Reserva reserva;
	
	public ReservaTipoHabitacion() {
		
	}
	
	public ReservaTipoHabitacion(int numHabitaciones, TipoHabitacion tipoHabitacion, Reserva reserva) {
		super();
		this.numHabitaciones = numHabitaciones;
		this.tipoHabitacion = tipoHabitacion;
		this.reserva = reserva;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
}
