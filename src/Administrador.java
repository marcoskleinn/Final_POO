
public class Administrador extends Usuario {
	
	
	private int nroAdmin;
	private Movimiento movimiento;
	public Administrador(String nombre, String dni, String contrasena, int nroAdmin, Movimiento movimiento) {
		super(nombre, dni, contrasena);
		this.nroAdmin = nroAdmin;
		this.movimiento = movimiento;
	}
	public int getNroAdmin() {
		return nroAdmin;
	}
	public void setNroAdmin(int nroAdmin) {
		this.nroAdmin = nroAdmin;
	}
	public Movimiento getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}
	
	public void verMovimientos() {
		for (int i = 0; i < this.movimiento.getMovimiento(); i++) {
			
		}
	}
	
	

			
	
	
	
	
	
	
	
	
}
