package controlefluxo.lacorepeticao;

public class RepeticaoForArray {

    public static void main(String[] args) {

        String alunos[] = { "jose", "tabosa", "braga", "sobrinho" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice " + x + " : " + alunos[x]);
        }

        // for mais resumido
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }

}
