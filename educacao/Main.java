import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        String r;
        do {
            Scanner sc = new Scanner(System.in);
            Aluno c = new Aluno();
            Professor p = new Professor("Maria");
            Disciplina d = new Disciplina("POO");


            d.associar(p);
            d.mostrarDisciplina();

            System.out.println(Cargo.Professor);

            System.out.println("Digite 1 para Aluno ou digite 2 Professor");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção 1 selecionada");

                    System.out.print("Digite sua matricula: ");
                    c.setMatricula(sc.nextInt());
                    System.out.print("Digite sua NOTA1: ");
                    c.setNota1(sc.nextDouble());
                    System.out.print("Digite sua NOTA2: ");
                    c.setNota2(sc.nextDouble());
                    System.out.print("Digite sua NOTA3: ");
                    c.setNota3(sc.nextDouble());

                    c.calcularMedia();
                    System.out.println("Sua media é " + c.getMedia());

                    break;
                case 2:
                    System.out.println("Opção 2 selecionada");


                    break;
                default:
                    System.out.println("Opção invalida.");
            }



            System.out.println("Quer se cadastrar novamente? Digite S");
            r = sc.next();
        }while (r.equalsIgnoreCase("S"));


    }
}