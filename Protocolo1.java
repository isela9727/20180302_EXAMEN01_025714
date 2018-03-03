import java.util.*;

public class Protocolo1 extends FormatoEmail implements Protocolos
{
	Banco banco;

	@Override
	public void notificar(Banco bancoDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se realizo una transferencia a su cuenta.");
		
	}

	public void transferencia(UUID numCuenta, double monto) 
	{
		System.out.println("Transaccion de " + numCuenta + " por monto de " + monto);
	}
}
