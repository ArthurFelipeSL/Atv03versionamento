public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Maria", 15);
        cliente.setGenero("f");
        
        ContaCliente conta = new ContaCliente(101, cliente);
        conta.addDeposito(1500.00);
        conta.subSaldo(300.00);
        
        FaturaCliente fatura = new FaturaCliente(201, cliente, 499.90);
        System.out.println(fatura.getValorComDesconto()); // 424.91
    }
}