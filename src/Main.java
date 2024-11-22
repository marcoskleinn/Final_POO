import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		
		 
		Usuario cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Administrador admin = new Administrador(null, null, null, 0, null);
		
		
		cliente1.setCuenta(new Cuenta(0, 0)); // Inicializamos la cuenta antes de usarla
		 
		 String[] opciones = {
			"registrar cliente", "iniciar sesion cliente", "transaccion", "registrar administrador",  "iniciar sesion administrador", "movimientos", "salir"	 
		 };
	
		 int opcion = 0;
		 
		 do {
			 opcion = JOptionPane.showOptionDialog(null, "Menu","", 0, 0, null, opciones, opciones[0]);
			 switch (opcion) {
			case 0:
				
				cliente.registrarCliente();;
				
				break;
			case 1:
				
				cliente.Logincliente();
				
				break;	
				
			case 2:
				cliente2.setNombre("Juan");
				cliente.setDni("111");
				cliente1.Accion(cliente2);
				
				break;		
			case 3:
				
				admin.registrarAdmin();
				admin.verMovimientos(cliente1);
				
				break;	
				
			case 4:
				
				admin.loginAdmin();
				
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
			
		} while (opcion != 4);
		
	}
}