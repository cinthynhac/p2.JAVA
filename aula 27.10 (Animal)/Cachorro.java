public class Cachorro extends Animal implements Corrida, Estimacao{
    public Cachorro (String nome, String genero, int idade){
        super(nome,genero,idade);
    }
    @Override
    public void Emitirsom(){
        System.out.println("Au Au");
    }
    @Override
    public void correr(){
        System.out.println("Eu corro rápido");
    }
    @Override
    public void estimacao(){
        System.out.println("Você pode me criar");
    }

}
