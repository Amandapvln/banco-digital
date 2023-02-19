
public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Amanda Lino", "123.456.789-00", "Rua A, 123");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getEndereco());
		
		System.out.println("\n");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		poupanca.sacar(25);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
