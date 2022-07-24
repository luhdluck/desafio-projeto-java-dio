
public class Main {

	public static void main(String[] args) {
		Cliente luisa = new Cliente();
		luisa.setNome("Luisa");
		
		Conta cc = new ContaCorrente(luisa);
		Conta poupanca = new ContaPoupanca(luisa);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
