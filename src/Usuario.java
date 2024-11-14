import java.util.LinkedList;

import javax.swing.JOptionPane;

public abstract class Usuario {
	private String nombre;
	private String dni;
	private String contrasena;
	private static LinkedList<Cliente> usuarios = new LinkedList<Cliente>();
	public Usuario(String nombre, String dni, String contrasena) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.contrasena = contrasena;
	}
	public Usuario() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public static LinkedList<Cliente> getUsuarios() {
		return usuarios;
	}
	public static void setUsuarios(LinkedList<Cliente> usuarios) {
		Usuario.usuarios = new LinkedList<>();
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + ", contrasena=" + contrasena + "]";
	}
	
	
	
	public void Login() {
		
		this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
		this.setContrasena(JOptionPane.showInputDialog("Ingrese una contraseña"));
		
		
		
	
	}
	public void Menu() {
		
	}

}
