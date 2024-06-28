package escola;

public class Aluno {

    private String nome;
    private int idade;
    private int matricula;
    private String[] disciplina = new String[5];
    private int[] notas = new int[5];

    public void imprimeTela(Aluno a) {
        System.out.println("Aluno: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Matricula: " + a.getMatricula());

        for (int i = 0; i < a.getDisciplina().length; i++) {
            System.out.println("Disciplinas: " + a.getDisciplina()[i] + "\tNotas: " + a.getNotas()[i]);
        }
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

}
