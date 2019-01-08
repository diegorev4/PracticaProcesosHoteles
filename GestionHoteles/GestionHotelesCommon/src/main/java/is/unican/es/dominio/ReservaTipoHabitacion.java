package is.unican.es.dominio;

public class ReservaTipoHabitacion {

	private int numHabitaciones;
	private TipoHabitacion tipoHabitacion;
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