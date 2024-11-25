import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class Administrador extends Usuario {
	
	
	private int nroAdminn;
	private LinkedList<Movimiento> movimeintos = new LinkedList<Movimiento>();

	
	public Administrador(String nombre, String dni, String contrasena, int nroAdmin) {
		super(nombre, dni, contrasena);
		this.nroAdminn = nroAdmin;
		this.movimeintos = new LinkedList<Movimiento>();
	}
	
	


	public Administrador(String nombre, String dni, String contrasena) {
		super(nombre, dni, contrasena);
	}


	


	





	public int getNroAdminn() {
		return nroAdminn;
	}




	public void setNroAdminn(int nroAdminn) {
		this.nroAdminn = nroAdminn;
	}




	public LinkedList<Movimiento> getMovimeintos() {
		return movimeintos;
	}





	public void setMovimeintos(LinkedList<Movimiento> movimeintos) {
		this.movimeintos = movimeintos;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Administrador [nroAdmin=" + getNroAdminn() + ", movimeintos=" + movimeintos + ", getMovimeintos()="
				+ getMovimeintos() + "]";
	}
	
	@Override
	public void login() {
		
		

		String nombre = validaString("Ingrese su nombre");
        int nroAdmin = Integer.parseInt(validaString("Ingrese su número de administrador:"));
		if ( Usuario.getAdmministradores().isEmpty()) {
			JOptionPane.showMessageDialog(null, "mp ai xd");
		} else {
			for (Administrador administrador : Usuario.getAdmministradores()) {
				if (administrador.getNombre().equals(nombre) && administrador.getNroAdminn() == nroAdmin) {
	                JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre);
				} else {
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		}
		
		
		
	}





	
		
		





	public void verMovimientos(Cliente cliente) {
	
		if (cliente.getCuenta().getMovimientos().isEmpty()) {
	        JOptionPane.showMessageDialog(null, "No tiene movimientos en su cuenta");
	        
	    } else {
	    	String movimientosDetalle = ""; 
	    	
	    	 for (Movimiento movimiento : cliente.getCuenta().getMovimientos()) {
	 	        movimientosDetalle += "Fecha: " + movimiento.getFecha() + 
	 	                              ", Detalle: " + movimiento.getDetalle() + 
	 	                              ", Cliente : " + movimiento.getCliente().getNombre() + "\n";
	 	    }
	 	    JOptionPane.showMessageDialog(null, "Movimientos realizados:\n" + movimientosDetalle);
	    	
	    }
	    	
	
	}	
}
	
	
	
	
