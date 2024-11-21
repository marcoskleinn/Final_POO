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
		this.movimeintos = movimeintos;
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





	public void verMovimientos() {
		String[] movimietosEjemplo = {
				"Pago","Transferencia","Deposito"
		};
		
		
		String movimientosDetalle="";
		
		
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
		
		int opcion = 0;
		
		opcion = JOptionPane.showOptionDialog(null, "", movimientosDetalle, opcion, opcion, null, movimietosEjemplo, movimietosEjemplo[0]);
		
		switch (opcion) {
		case 0:
			for (Movimiento movimientos : this.getMovimeintos()) {
				JOptionPane.showMessageDialog(null, movimientos);
			}
			break;

		default:
			break;
		}
	}
	
	}
	
	

			
	
	
