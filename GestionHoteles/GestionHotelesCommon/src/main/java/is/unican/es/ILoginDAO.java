package is.unican.es;

public interface ILoginDAO {
	public boolean comprobarUsuario(String user);
	public boolean IniciarSesion(String user, String pass);
	public boolean comprobarEstado(String user);
}
