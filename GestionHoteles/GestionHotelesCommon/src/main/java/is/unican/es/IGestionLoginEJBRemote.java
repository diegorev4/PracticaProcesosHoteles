package is.unican.es;

import javax.ejb.Remote;

@Remote
public interface IGestionLoginEJBRemote {
	
	public boolean iniciarSesion(String usuario, String pass);
	public boolean cerrarSesion();
	public boolean estadoSesion();
}
