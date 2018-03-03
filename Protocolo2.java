
public class Protocolo2 extends FormatoHTTP implements Protocolos
{
	Banco banco;

	@Override
	public void notificar(Banco bancoDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se realizo una transferencia a su cuenta.");
		
	}

	public void transferencia(Banco bancoOrigen, Banco bancoDestino, double monto) 
	{
		System.out.println("Transaccion del banco " + bancoOrigen + " al banco " + bancoDestino + " por un monto de " + monto);
	}
}
