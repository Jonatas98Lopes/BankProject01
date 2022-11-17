public class Main {
    public static void main(String[] args) {
        Cliente jonatas = new Cliente("Jonatas", "Lopes de Sousa",
                "Rua Zé da Farofa,123","000000000-00");

        Cliente natanael = new Cliente("Natanael", "Lopes de Sousa",
                "Rua Zé da Farofa,123","111111111-11");

        Conta ccNumero1 = new ContaCorrente(jonatas);
        Conta cpNumero1 = new ContaPoupanca(natanael);

        ccNumero1.depositar(500);
        ccNumero1.transferir(100,cpNumero1);

        ccNumero1.imprimirExtrato();
        System.out.println("--------------------------------------");
        cpNumero1.imprimirExtrato();
    }
}