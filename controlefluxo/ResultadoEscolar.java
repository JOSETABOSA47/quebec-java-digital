package controlefluxo;

public class ResultadoEscolar {

    // condição composta
    public static void main(String[] args) {

        int nota = 3;

        if (nota >= 7) {
            System.out.println(("Aprovado"));
        }
        // condição encandeada
        else if (nota <= 6 && nota >= 5) {
            System.out.println("Prova final");
        } else {
            System.out.println("Reprovado");
        }

        // condição ternaria
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // condição ternaria com encandeada
        String resultado1 = nota >= 7 ? "Aprovado" : nota <= 6 && nota > 5 ? "Prova final" : "Reprovado";
        System.out.println(resultado1);
    }
}
