import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		
		 
		Usuario cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Administrador admin = new Administrador(null, null, null, 0, null);
		
		cliente1.setCuenta(new Cuenta(0, 0)); // Inicializamos la cuenta antes de usarla
		 
		 String[] opciones = {
			"registrarse", "iniciar sesion", "transaccion", "movimientos", "salir"	 
		 };
	
		 int opcion = 0;
		 
		 do {
			 opcion = JOptionPane.showOptionDialog(null, "Menu","", 0, 0, null, opciones, opciones[0]);
			 switch (opcion) {
			case 0:
				
				cliente.registrarse();
				
				break;
			case 1:
				
				cliente.Login();
				
				break;	
				
			case 2:
				cliente2.setNombre("Juan");
				cliente1.setDni("111");
				cliente1.Accion(cliente2);
				
				break;		
			case 3:
				admin.verMovimientos(cliente1);
				
				break;			

			default:
				break;
			}
			
		} while (opcion != 4);
		
	}
}