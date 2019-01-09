package dao;

import java.util.Date;

import is.unican.es.IReservasDAO;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.TipoHabitacion;

public class DatosReservas implements IReservasDAO{

	protected static DatosReservas instancia = null;
	
	protected DatosReservas() {
		
	}
	
	public DatosReservas getInstance() {
		if(instancia == null) {
			instancia = new DatosReservas();
		}
		return instancia;
	}
	public Reserva consultaReserva(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva eliminarReserva(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva addReserva(TipoHabitacion th, String nombre, String dni, String tarjeta, int numHabitaciones,
			Hotel h, Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva modificarReserva(Reserva reservaNueva) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva[] reservaPorFecha(Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva[] reservaPorRangoFecha(Date fechaIni, Date fechaFin) {
		// TODO Auto-generated method stub
		return null;
	}

}
