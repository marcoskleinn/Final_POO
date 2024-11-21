import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

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





	public void verMovimientos() {
		String[] movimietosEjemplo = {
				"Pago","Transferencia","Deposito"
		};
		
	
		/*movimiento.setDetalle(movimietosEjemplo[(int)(Math.random()*movimietosEjemplo.length)]);

		this.getMovimiento().getCliente().getCuenta().getMovimientos().add(movimiento);
		movimiento.setDetalle(movimietosEjemplo[(int)(Math.random()*movimietosEjemplo.length)]);
		this.getMovimiento().getCliente().getCuenta().getMovimientos().add(movimiento);
		movimiento.setDetalle(movimietosEjemplo[(int)(Math.random()*movimietosEjemplo.length)]);

		this.getMovimiento().getCliente().getCuenta().getMovimientos().add(movimiento);
		
		for (Movimiento movimiento : this.getMovimiento().getCliente().getCuenta().getMovimientos()) {
			movimientosDetalle = movimientosDetalle + movimiento.getDetalle() + "\n";
		}
		
		
		String[] detalles = movimientosDetalle.split("\n"); 
		String seleccionado = (String)JOptionPane.showInputDialog(null, "Elija detalle",
				"", 0, null, detalles, detalles[0]);
	
		JOptionPane.showMessageDialog(null, "Selecciono el movimientio;: " + seleccionado);*/
		
	
		
			/*for (int i = 0; i < this.movimeintos.size(); i++) {
				if (this.movimeintos.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No tiene movimientos hasta el momento");
				}
				JOptionPane.showMessageDialog(null, this.getMovimeintos());
			}*/
			
			for (Movimiento movi : this.getMovimeintos()) {
				JOptionPane.showMessageDialog(null, movi.toString());
			}
			
	}
}
	
	
	
	

			
	
	
