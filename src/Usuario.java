import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public abstract class Usuario {
	private String nombre;
	private String dni;
	private String contrasena;
	private static LinkedList<Cliente> clientes = new LinkedList<Cliente>();
	private static LinkedList<Administrador> admministradores = new LinkedList<Administrador>();

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
		return clientes;
	}
	public static void setUsuarios(LinkedList<Cliente> usuarios) {
		Usuario.clientes = new LinkedList<>();
	}
	
	
	
	public static LinkedList<Administrador> getAdmministradores() {
		return admministradores;
	}
	public static void setAdmministradores(LinkedList<Administrador> admministradores) {
		Usuario.admministradores = admministradores;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + ", contrasena=" + contrasena + "]";
	}
	
	public void registrarCliente() {
		this.setNombre(validaString("Ingrese el nombre del cliente:"));
		this.setDni(validaString("Ingrese el DNI del cliente:"));
		this.setContrasena(validaString("Ingrese la contraseña del cliente:"));
        Cliente clientee = new Cliente(getNombre(), getDni(), getContrasena(), "", null);
        clientes.add(clientee);
	}
	
	public void registrarAdmin() {
        Administrador admin = new Administrador(nombre, dni, contrasena, 0);

        admin.setNombre(validaString("Ingrese el nombre del administrador:"));
        admin.setDni(validaString("Ingrese el dni del administrador:"));
        admin.setContrasena(validaString("Ingrese la contraseña del administrador:"));
        admin.setNroAdminn(Integer.parseInt(validaString("numero de admin: ")));
        admministradores.add(admin);

	}
	public void login() {
		
	}
	public static String validaString(String mensaje) {
		String  palabra = "";
		
		do {
			palabra = JOptionPane.showInputDialog(mensaje);
		} while (palabra.isEmpty());
		return palabra;
	}
	
	


}
