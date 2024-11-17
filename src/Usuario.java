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
	
	public void registrarse() {
		this.setDni(JOptionPane.showInputDialog("ingrese su dni"));
		this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
		this.setContrasena(JOptionPane.showInputDialog("Ingrese su contraseña"));

					
					if (this.getNombre().isEmpty() || this.getNombre() == null && this.getDni().isEmpty() || this.getDni() == null && 
						this.getContrasena().isEmpty() || this.getContrasena() == null ) {
						JOptionPane.showMessageDialog(null, "Error");
					} else {
						
					Usuario.getUsuarios().add((Cliente) this);
				}
	}
	
	
	public void Login() {
		
		int opcion = 0;
		String[] tipoUsuario = {
			"cliente", "admin", "salir"
		};
		
		do {
			opcion = JOptionPane.showOptionDialog(null, tipoUsuario, contrasena, opcion, opcion, null, tipoUsuario, tipoUsuario);
			switch (opcion) {
			case 0:
				this.setDni(JOptionPane.showInputDialog("ingrese su dni"));
				this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
				JOptionPane.showMessageDialog(null, "Bienvenido " + this.getNombre());
				break;
			case 1:
				this.setDni(JOptionPane.showInputDialog("ingrese su dni"));
				this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
				JOptionPane.showMessageDialog(null, "Bienvenido " + this.getNombre());
				break;		

			default:
				break;
			}
			
		} while (opcion != 2);
		
	
	}
	public void Menu() {
		
	}

}
