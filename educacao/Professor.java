public final class Professor extends Pessoa {
    public Cargo cargo;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cargo=" + cargo +
                '}';
    }

    public Professor(Cargo cargo) {
        this.cargo = cargo;
    }

    public Professor(String nome, Cargo cargo) {
        super(nome);
        this.cargo = cargo;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou um professor.");

    }

    @Override
    public void minhaAtividade() {

    }

    public Professor(String nome){
        super(nome);
    }

}