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
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + ", contrasena=" + contrasena + "]";
	}
	
	public void registrarCliente() {
		this.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente:"));
		this.setDni(JOptionPane.showInputDialog("Ingrese el DNI del cliente:"));
		this.setContrasena(JOptionPane.showInputDialog("Ingrese la contraseña del cliente:"));
        Cliente clientee = new Cliente(getNombre(), getDni(), getContrasena(), "", null);
        clientes.add(clientee);
	}
	
	public void registrarAdmin() {
        Administrador admin = new Administrador(nombre, dni, contrasena, 0, null);

		this.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del administrador:"));
		this.setDni(JOptionPane.showInputDialog("Ingrese el dni del administrador:"));
		this.setContrasena(JOptionPane.showInputDialog("Ingrese la contraseña del administrador:"));
        admin.setNroAdmin(Integer.parseInt(JOptionPane.showInputDialog("numero de admin: ")));
        Administrador adminn = new Administrador(getNombre(), getDni(), getContrasena(), admin.getNroAdmin(), null);
        admministradores.add(adminn);

	}
	
	
	public void Logincliente() {
		

				String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
				String dni = JOptionPane.showInputDialog("Ingrese su dni");
				
				for (Cliente cliente : clientes) {
					if (cliente.getNombre().equalsIgnoreCase(nombre) && cliente.getDni().equals(dni)) {
		                JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre);
					} else {
						JOptionPane.showMessageDialog(null, "error");
					}
	
				}
	}
	
	public void loginAdmin() {
		
		

		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int nroAdmin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de administrador:"));
		
		for (Administrador administrador : admministradores) {
			if (administrador.getNombre().equals(nombre) && administrador.getNroAdmin() == nroAdmin) {
                JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre);
			} else {
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
		
		
	}


}
