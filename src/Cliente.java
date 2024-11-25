import java.time.LocalDate;
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
	
	@Override
	public void login() {
		for (Usuario cliente : this.getUsuarios()) {
			String nombre = validaString("Ingrese su nombre");
			String dni = validaString("ingrese su dni");
			if (cliente.getNombre().equalsIgnoreCase(nombre) && cliente.getDni().equals(dni)) {
                JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre);
			} else {
				JOptionPane.showMessageDialog(null, "error");
			}
		}
	}
	
	
	
	public double Accion(Cliente receptor) {
	    int opcion = 0;
	    do {
	        opcion = JOptionPane.showOptionDialog(null, cuenta,  tipo,  0, 0, null, OpcionesCliente.values(),  OpcionesCliente.values());
	        
	       
	        switch (opcion) {
	            case 0: // Transferencia
	                double transferencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad que quiere transferir a " + receptor.getNombre()));
	                if (transferencia > this.cuenta.getSaldo() ||  transferencia <= 0) {
	                    JOptionPane.showMessageDialog(null, "No se puede hacer la transferencia");
	                   
	                } else {
	                	this.cuenta.setSaldo(this.cuenta.getSaldo() - transferencia);
	                    JOptionPane.showMessageDialog(null, "Transferencia enviada a " + receptor.getNombre());
	                    JOptionPane.showMessageDialog(null, "Ahora su estado de cuenta es de " + this.cuenta.getSaldo());
	                    this.cuenta.getMovimientos().add(new Movimiento(LocalDate.now(), "pago", this));
	                    this.cuenta.getMovimientos().add(new Movimiento(LocalDate.now(), "Recibo de plata", receptor));
	                }
	                break;
	               
	            case 1: // Depósito
	                double depositar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad que quiere depositar"));
	                this.cuenta.setSaldo(this.cuenta.getSaldo() + depositar);
	                JOptionPane.showMessageDialog(null, "Ahora su saldo es de " + this.cuenta.getSaldo());
                    this.cuenta.getMovimientos().add(new Movimiento(LocalDate.now(), "deposito", this));

	                break;

	            case 2: // Retiro
	                double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad que quiere retirar"));
	                if (retiro > this.cuenta.getSaldo()) {
	                    JOptionPane.showMessageDialog(null, "No se puede realizar el retiro");
	                } else {
	                    this.cuenta.setSaldo(this.cuenta.getSaldo() - retiro);
	                    JOptionPane.showMessageDialog(null, "Retiro exitoso, ahora tiene " + this.cuenta.getSaldo());
	                    this.cuenta.getMovimientos().add(new Movimiento(LocalDate.now(), "retiro", this));

	                }
	                break;

	            default:
	                JOptionPane.showMessageDialog(null, "Gracias por ser parte de nuestro banco");
	                break;
	        }
	    } while (opcion != 3);

	    return this.cuenta.getSaldo();
	}
}