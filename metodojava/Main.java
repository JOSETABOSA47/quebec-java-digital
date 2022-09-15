package metodojava;

public class Main {
    public static void main(String[] args) {

        Calculadora.soma(15, 20);
        Calculadora.divisao(15, 20);
        Calculadora.multiplicacao(15, 20);
        Calculadora.subtracao(15, 20);

        MesagemHora.mensagem(5);
        MesagemHora.mensagem(13);
        MesagemHora.mensagem(1);

        Emprestimo.calcular(1200, 2);
        Emprestimo.calcular(1200, 3);
        Emprestimo.calcular(1200, 4);
        Emprestimo.calcular(1200, 5);
    }

}
