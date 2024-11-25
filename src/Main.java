import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		
		 
		Usuario cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Administrador admin = new Administrador(null, null, null, 0);
		
		
		cliente1.setCuenta(new Cuenta(0, 0)); // Inicializamos la cuenta antes de usarla
		 
		 String[] opciones = {
			"registrar cliente", "registrar administrador", "iniciar sesion cliente", "iniciar sesion administrador",  "transaccion", "movimientos", "salir"	 
		 };
	
		 int opcion = 0;
		 
		 do {
			 opcion = JOptionPane.showOptionDialog(null, "Menu","", 0, 0, null, opciones, opciones[0]);
			 switch (opcion) {
			case 0:
				
				cliente.registrarCliente();;
				
				break;
			case 1:
				
				cliente.registrarAdmin();
				
				break;	
				
			case 2:
				
				cliente1.login();
				
				
				break;		
			case 3:
				
				admin.login();
				
				
				break;	
				
			case 4:
				cliente2.setNombre("Juan");
				cliente1.Accion(cliente2);
				
				
				break;
				
				
			case 5:
				
				admin.verMovimientos(cliente1);
				
				
				
				break;	
				
			case 6:
				
				JOptionPane.showMessageDialog(null, "gracias por se parte de neustro banco");
				
				break;		

			default:
				
				JOptionPane.showMessageDialog(null, "gracias por se parte de neustro banco");
				break;
			}
			
		} while (opcion != 6);
		
	}
}