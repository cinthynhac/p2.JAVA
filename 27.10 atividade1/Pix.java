public class Pix extends Pagamento implements Transferencia{
    @Override
    public void limite(){
        System.out.println("Limite máximo de pagamento de R$ 5.000,00");
    }
}
