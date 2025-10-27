public class Cartao extends Pagamento implements Transferencia{
    @Override
    public void limite() {
        System.out.println("Limite máximp de R$20k");
    }
}
