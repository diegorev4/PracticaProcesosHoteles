package is.unican.es;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import is.unican.es.dominio.Hotel;

@Named
@SessionScoped
public class HotelesBean implements Serializable{

	@EJB
	private IGestionHotelesEJBRemote gest;
	
	private String nombre;
	private String localidad;
	//Cambiar
	private List<Hotel> ho;
	
	public String buscarHotel() {
		ho = null; //vaciar array
		ho = new ArrayList<Hotel>();
		if(nombre.isEmpty()) {
			if (localidad.isEmpty()) {
				return "index.xhtml";
			}else {
				ho = gest.consultarHotelLocalidad(localidad);
				return "hotelDetalle.xhtml";
			}
		}else {
			ho.add(gest.consultarHotel(nombre));
			return "hotelDetalle.xhtml";
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

	public List<Hotel> getHo() {
		return ho;
	}

	public void setHo(List<Hotel> ho) {
		this.ho = ho;
	}
	
}
