import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Cliente extends Usuario{
	private String tipo;
	private Cuenta cuenta;
	public Cliente(String nombre, String dni, String contrasena, String tipo, Cuenta cuenta) {
		super(nombre, dni, contrasena);
		this.tipo = tipo;
		this.cuenta = cuenta;
	}
	public Cliente() {
		super();
	
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	@Override
	public String toString() {
		return "Cliente [tipo=" + tipo + ", cuenta=" + cuenta + ", toString()=" + super.toString() + "\n]";
	}
	
	public void registrarse() {
					
					
		this.setDni(JOptionPane.showInputDialog("ingrese su dni"));
		this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
		this.setContrasena(JOptionPane.showInputDialog("Ingrese su contraseña"));
		this.cuenta.setNroCuenta(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de cuenta bancaria")));
					
					if (this.getNombre().isEmpty() || this.getNombre() == null && this.getDni().isEmpty() || this.getDni() == null && 
						this.getContrasena().isEmpty() || this.getContrasena() == null && this.cuenta.getNroCuenta() > 0) {
						JOptionPane.showMessageDialog(null, "Error");
					} else {
						
					Usuario.getUsuarios().add(this);
				}
					
		
		
	}
	
	public void ingresarASuSaldo() {
		
		this.cuenta.estadoCuenta();
		
		
	}
	
	public void Menu(Cliente cliente) {
		int opcion = JOptionPane.showOptionDialog(null, cuenta, tipo, 0, 0, null, OpcionesCliente.values(), OpcionesCliente.values());
		
		switch (opcion) {
		case 0:
			JOptionPane.showMessageDialog(null, this.cuenta.getMovimientos() , "Movimientos", 0);
			
			int transferencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad que quiere transferir a " + cliente.getNombre()));
			if (transferencia > this.cuenta.getSaldo()) {
				JOptionPane.showMessageDialog(null, "No se puede hacer la transferencia");
			} else {
				JOptionPane.showMessageDialog(null, "Transferencia enviada a " + cliente.getNombre());
				this.cuenta.getMovimientos().add(
						new Movimiento(
								LocalDateTime.now(),
								"Transferencia desde la cuetna " + this.getDni() + " monto " + transferencia ,
								this.cuenta.getMovimientos().size(),
								this
								
								));
			}
			break;

		default:
			break;
		}
	}
	
}
