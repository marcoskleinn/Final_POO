import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class Administrador extends Usuario {
	
	
	private int nroAdmin;
	private LinkedList<Movimiento> movimeintos;

	
	public Administrador(String nombre, String dni, String contrasena, int nroAdmin,
			LinkedList<Movimiento> movimeintos) {
		super(nombre, dni, contrasena);
		this.nroAdmin = nroAdmin;
		this.movimeintos = new LinkedList<Movimiento>();
	}
	
	



	public int getNroAdmin() {
		return nroAdmin;
	}





	public void setNroAdmin(int nroAdmin) {
		this.nroAdmin = nroAdmin;
	}





	public LinkedList<Movimiento> getMovimeintos() {
		return movimeintos;
	}





	public void setMovimeintos(LinkedList<Movimiento> movimeintos) {
		this.movimeintos = movimeintos;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Administrador [nroAdmin=" + nroAdmin + ", movimeintos=" + movimeintos + ", getMovimeintos()="
				+ getMovimeintos() + "]";
	}





	
		
		





	public void verMovimientos(Cliente cliente) {
		String[] movimietosEjemplo = {
				"Pago","Transferencia","Deposito"
		};
		
	
		if (cliente.getCuenta().getMovimientos().isEmpty()) {
	        JOptionPane.showMessageDialog(null, "No tiene movimientos en su cuenta");
	        return; // Salimos del método si no hay movimientos
	    }

	    // Creamos una cadena que irá concatenando todos los movimientos
	    String movimientosDetalle = ""; 

	    // Recorremos la lista de movimientos y los agregamos a la cadena
	    for (Movimiento movimiento : cliente.getCuenta().getMovimientos()) {
	        movimientosDetalle += "Fecha: " + movimiento.getFecha() + 
	                              ", Detalle: " + movimiento.getDetalle() + 
	                              ", Cliente relacionado: " + movimiento.getCliente().getNombre() + "\n";
	    }

	    // Mostramos todos los movimientos en un cuadro de diálogo
	    JOptionPane.showMessageDialog(null, "Movimientos realizados:\n" + movimientosDetalle);
	
	    	
	
}	
}
	
	
	
	
