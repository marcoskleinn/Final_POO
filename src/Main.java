import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		 
		 Cliente cliente = new Cliente();
		 JOptionPane.showMessageDialog(null, Cliente.getUsuarios(),"1",0);
		 cliente.registrarse();
		 Cliente cliente2 = new Cliente();

		 JOptionPane.showMessageDialog(null, Usuario.getUsuarios(),"2",0);
		 cliente.registrarse();

		 cliente2.registrarse();
		 JOptionPane.showMessageDialog(null, Usuario.getUsuarios(),"3",0);
		 cliente.Menu();
		 
	
		
	}
}
