import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.DatosReservas;
import is.unican.es.IGestionReservasEJBRemote;
import is.unican.es.dominio.Cliente;
import is.unican.es.dominio.Pago;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;
import is.unican.es.dominio.TipoTarjeta;

@Stateless
public class GestionReservas implements IGestionReservasEJBRemote{

	@EJB
	private DatosReservas dr;
	@Override
	public ReservaTipoHabitacion consultaReserva(int id) {
		return dr.consultaReserva(id);
	}

	@Override
	public boolean cancelarReserva(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarReservaHabitaciones(int id, int numHabitaciones, TipoHabitacion tipo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarReservaFecha(int id, Date fecha) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ReservaTipoHabitacion reservar(TipoHabitacion tH, String nombre, String dni, int tarjeta, int numHabitaciones,
			Date fechaEntrada, Date fechaSalida, int precio, String primerApellido, String segundoApellido, String email,
			int cvc, int mesCaducidad, int anhoCaducidad, TipoTarjeta tipo) {
		
		Calendar c = Calendar.getInstance();
		if (anhoCaducidad < c.get(c.YEAR)) {
			return null;
		}else if (anhoCaducidad == c.get(c.YEAR)){
			if (mesCaducidad < c.get(c.MONTH)) {
				return null;
			}
		}
		
		ReservaTipoHabitacion r = new ReservaTipoHabitacion(numHabitaciones, tH, new Reserva(fechaEntrada, fechaSalida, precio, new Cliente(dni, nombre, primerApellido, segundoApellido, email),
						new Pago(tarjeta, cvc, mesCaducidad, anhoCaducidad, tipo)));
		
		dr.addReserva(r);
		return r;
	}

}
