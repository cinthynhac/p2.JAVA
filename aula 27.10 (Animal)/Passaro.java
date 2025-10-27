public class Passaro extends Animal {
    public Passaro (String nome, String genero, int idade){
        super(nome,genero,idade);
    }
    @Override
    public void Emitirsom(){
        System.out.println("Piu Piu");
    }
}
