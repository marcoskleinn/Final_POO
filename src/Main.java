import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, Cliente.getUsuarios());
		 
		Usuario cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Administrador admin = new Administrador(null, null, null, 0, null);

		 
		 String[] opciones = {
			"registrarse", "iniciar sesion", "transaccion", "movimientos", "salir"	 
		 };
	
		 int opcion = 0;
		 
		 do {
			 opcion = JOptionPane.showOptionDialog(null, "Menu", null, opcion, opcion, null, opciones, opciones);
			 switch (opcion) {
			case 0:
				
				cliente.registrarse();
				
				break;
			case 1:
				
				cliente.Login();
				
				break;	
				
			case 2:
				cliente2.setNombre("Juan");
				
				cliente1.Accion(cliente2);
				
				break;		
			case 3:
				admin.verMovimientos();
				
				break;			

			default:
				break;
			}
			
		} while (opcion != 4);
		
	}
}
