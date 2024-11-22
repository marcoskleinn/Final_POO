import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Cuenta {
	private int nroCuenta;
	private double saldo;
	private LinkedList<Movimiento> movimientos;
	public Cuenta(int nroCuenta, double saldo) {
		super();
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
		this.movimientos = new LinkedList<Movimiento>();
	}
	public int getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public LinkedList<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(LinkedList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
	@Override
	public String toString() {
		return "Cuenta [nroCuenta=" + nroCuenta + ", saldo=" + saldo + ", movimientos=" + movimientos + "]\n";
	}
	
	public void estadoCuenta() {
		
		this.setSaldo(Math.random()* 10000000);
		JOptionPane.showMessageDialog(null, "Su saldo actual es " + this.getSaldo());
		
	}
	
	
}