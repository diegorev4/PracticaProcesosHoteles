import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import is.unican.es.IGestionReservasEJBRemote;
import is.unican.es.IReservasDAO;
import is.unican.es.dominio.Cliente;
import is.unican.es.dominio.Pago;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;
import is.unican.es.dominio.TipoTarjeta;

@Stateless
public class GestionReservas implements IGestionReservasEJBRemote{

	@EJB
	private IReservasDAO dr;
	@Override
	public Reserva consultaReserva(int id) {
		return dr.consultaReserva(id);
	}

	@Override
	public boolean cancelarReserva(int id) {
		if(!dr.eliminarReserva(id)) {
			return false;//Indica que no existe tal reserva
		}
		return true;
	}

	@Override
	public boolean modificarReservaHabitaciones(int id, int numHabitaciones, TipoHabitacion tipo) {
		ReservaTipoHabitacion r = dr.consultaReservaHabitacion(id);
		r.setTipoHabitacion(tipo);
		r.setNumHabitaciones(numHabitaciones);
		
		if(dr.modificarReservaHabitacion(r) == null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean modificarReservaFecha(int id, Date fechaInicio,Date fechaSalida) {
		Reserva reserva = dr.consultaReserva(id);
		reserva.setFechaEntrada(fechaInicio);
		reserva.setFechaSalida(fechaSalida);
		if(dr.modificarReserva(reserva) == null) {
			return false;
		}
		return true;
	}


	@Override
	public ReservaTipoHabitacion reservar(TipoHabitacion tH, String nombre, String dni, int tarjeta, int numHabitaciones,
			Date fechaEntrada, Date fechaSalida, String primerApellido, String segundoApellido, String email,
			int cvc, int mesCaducidad, int anhoCaducidad, TipoTarjeta tipo) {
		
		Calendar c = Calendar.getInstance();
		if (anhoCaducidad < c.get(c.YEAR)) {
			return null;
		}else if (anhoCaducidad == c.get(c.YEAR)){
			if (mesCaducidad < c.get(c.MONTH)) {
				return null;
			}
		}
		
		double precio = numHabitaciones*tH.getPrecioPorNoche();
		
		ReservaTipoHabitacion r = new ReservaTipoHabitacion(numHabitaciones, tH, new Reserva(fechaEntrada, fechaSalida, precio, new Cliente(dni, nombre, primerApellido, segundoApellido, email),
						new Pago(tarjeta, cvc, mesCaducidad, anhoCaducidad, tipo)));
		
		dr.addReservaHabitacion(r);
		return r;
	}

}
