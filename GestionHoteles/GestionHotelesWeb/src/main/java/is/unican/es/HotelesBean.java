package is.unican.es;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import is.unican.es.dominio.Hotel;

@Named
@SessionScoped
public class HotelesBean {

	@EJB
	private IGestionHotelesEJBRemote gest;
	
	private String nombre;
	private String localidad;
	private Hotel[] ho;
	
	public String buscarHotel() {
		ho = null; //vaciar array
		
		if(nombre.isEmpty()) {
			if (localidad.isEmpty()) {
				return "index.xhtml";
			}else {
				//ho = gest.hotelesporlocalidad(localidad);
				return "hotelDetalle.xhtml";
			}
		}else {
			ho[0] = gest.consultarHotel(nombre);
			return "hotelDetalle.xhtml";
		}
	}
	
}
