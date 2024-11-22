import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movimiento {
	private LocalDate fecha;
	private String detalle;
	private Cliente cliente;
	public Movimiento(LocalDate fecha, String detalle, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.detalle = detalle;
		this.cliente = cliente;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Movimiento [fecha=" + fecha + ", detalle=" + detalle + ", cliente= " + cliente.getNombre() + "]";
	}
	
}
