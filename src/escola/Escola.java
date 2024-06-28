package escola;

import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        String[] disci = new String[aluno.getDisciplina().length];
        int[] nota = new int[aluno.getNotas().length];

        System.out.println("Cadastro de aluno: ");

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scan.nextLine());

        System.out.println("Digite a idade do aluno: ");
        aluno.setIdade(scan.nextInt());

        System.out.println("Digite sua matricula: ");
        aluno.setMatricula(scan.nextInt());

        scan.reset();

        for (int i = 0; i < aluno.getDisciplina().length; i++) {

            scan.nextLine();
            System.out.println("Digite uma disciplina");
            disci[i] = scan.nextLine();
            aluno.setDisciplina(disci);

            System.out.println("Digite uma nota");
            nota[i] = scan.nextInt();
            aluno.setNotas(nota);

        }
        aluno.imprimeTela(aluno);

    }

    public Escola() {
    }
}
