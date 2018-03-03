import java.util.*;

public class BancoApp 
{
	@SuppressWarnings("resource")
	public static void main (String [] args)
	{
		//Protocolos
		FormatoEmail email = new Protocolo1();
		FormatoHTTP http = new Protocolo2();
		FormatoOracle oracle = new Protocolo3();
		
		Protocolo1 protocolo1 = new Protocolo1();
		Protocolo2 protocolo2 = new Protocolo2();
		Protocolo3 protocolo3 = new Protocolo3();
		
		//Bancos Origen
		Banco hsbc = new HSBC();
		hsbc.setOrigen(hsbc);
		Banco santander = new Santander();
		santander.setOrigen(santander);
		Banco banamex = new Banamex();
		banamex.setOrigen(banamex);
		
		//Cuentas
		hsbc.setCuenta();
		santander.setCuenta();
		banamex.setCuenta();
		System.out.println(hsbc.getCuenta());
		System.out.println(santander.getCuenta());
		System.out.println(banamex.getCuenta());
		
		Scanner scannerCantidad = new Scanner (System.in);
		System.out.println("\nIngresa la cantidad a transferir: ");
		String cantidad = scannerCantidad.next();
		double value = Double.parseDouble(cantidad);
		
		//Bancos Destinos
		hsbc.setDestino(santander);
		santander.setDestino(banamex);
		banamex.setDestino(hsbc);
		
		//Monto
		hsbc.setMonto(value);
		santander.setMonto(value);
		banamex.setMonto(value);
		
		//HSBC
		System.out.println("\n\n");
		protocolo1.notificar(hsbc.getDestino());
		email.notify(hsbc.getOrigen());
		protocolo1.transferencia(hsbc.getCuenta(), value);
		
		//Santander
		System.out.println("\n\n");
		protocolo2.notificar(santander.getDestino());
		http.notify(santander.getOrigen());
		protocolo2.transferencia(santander.getOrigen(), santander.getDestino(), santander.getMonto());
		
		//Banamex
		System.out.println("\n\n");
		protocolo3.notificar(banamex.getDestino());
		oracle.notify(banamex.getOrigen());
		protocolo3.transferencia(banamex.getOrigen(), banamex.getDestino(), banamex.getMonto(), ((Banamex) banamex).getAlias(), ((Banamex) banamex).getNIP());
		
		
//		Scanner scannerBancoOrigen = new Scanner (System.in);
//		System.out.println("\nIngresa tu banco: ");	
//		String bancoOrigen = scannerBancoOrigen.next();
//		
//		Scanner scannerBancoDestino = new Scanner (System.in);
//		System.out.println("\nIngresa el banco a transferir: ");	
//		String bancoDestino = scannerBancoDestino.next();
//		
//		Scanner scannerCantidad = new Scanner (System.in);
//		System.out.println("\nIngresa la cantidad a transferir: ");
//		String cantidad = scannerCantidad.next();
//		double value = Double.parseDouble(cantidad);
//		
//		if (bancoOrigen.equals("hsbc"))
//		{
//			hsbc.setCantidad(value);
//			if (bancoDestino.equals("santander"))
//			{
//				hsbc.setDestino(santander);
//				System.out.println(hsbc.getOrigen().toString());
//				System.out.println(hsbc.getDestino().toString());
//				System.out.println(hsbc.getCantidad());
//				
//				protocolo1.transferencia(hsbc.getOrigen(), hsbc.getDestino(), hsbc.getCantidad());
//			}
//			
//			else if (bancoDestino.equals("hsbc"))
//			{
//				hsbc.setDestino(hsbc);
//			}
//			
//			else if (bancoDestino.equals("banamex"))
//			{
//				hsbc.setDestino(banamex);
//			}		
//			
//			//hsbc.enviar(hsbc.getCuenta(), hsbc.getOrigen(), hsbc.getDestino(), hsbc.getCantidad());
//		}
//		
//		else if (bancoOrigen.equals("santander"))
//		{
//			santander.setCantidad(value);
//			
//			if (bancoDestino.equals("santander"))
//			{
//				santander.setDestino(santander);
//			}
//			
//			else if (bancoDestino.equals("hsbc"))
//			{
//				santander.setDestino(hsbc);
//			}
//			
//			else if (bancoDestino.equals("banamex"))
//			{
//				santander.setDestino(banamex);
//			}
//			
//			//santander.enviar(santander.getCuenta(), santander.getOrigen(), santander.getDestino(), santander.getCantidad());
//		}
//		
//		else if (bancoOrigen.equals("banamex"))
//		{
//			banamex.setCantidad(value);
//			
//			if (bancoDestino.equals("santander"))
//			{
//				banamex.setDestino(santander);
//			}
//			
//			else if (bancoDestino.equals("hsbc"))
//			{
//				banamex.setDestino(hsbc);
//			}
//			
//			else if (bancoDestino.equals("banamex"))
//			{
//				banamex.setDestino(banamex);
//			}
//			
//			banamex.setCantidad(value);
//			
//			//banamex.enviar(banamex.getCuenta(), banamex.getOrigen(), banamex.getDestino(), banamex.getCantidad());
//		}
	}
}
