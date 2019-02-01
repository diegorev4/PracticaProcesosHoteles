import javax.ejb.EJB;
import javax.ejb.Stateless;

import is.unican.es.IGestionLoginEJBRemote;
import is.unican.es.ILoginDAO;

@Stateless
public class GestionLogin implements IGestionLoginEJBRemote{


	@EJB
	private ILoginDAO dl;
	@Override
	public boolean iniciarSesion(String usuario, String pass) {
		
		return dl.IniciarSesion(usuario, pass);
	}

	@Override
	public boolean cerrarSesion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estadoSesion() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
