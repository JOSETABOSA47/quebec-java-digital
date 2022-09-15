package metodojava;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício criar uma calculadora");
        Calculadora.soma(15, 20);
        Calculadora.divisao(15, 20);
        Calculadora.multiplicacao(15, 20);
        Calculadora.subtracao(15, 20);

        System.out.println("Exercício enviar mensagem da hora do dia");
        MesagemHora.mensagem(5);
        MesagemHora.mensagem(13);
        MesagemHora.mensagem(1);

        System.out.println("Exercício calculo de emprestimo");
        Emprestimo.calcular(1200, 2);
        Emprestimo.calcular(1200, 3);
        Emprestimo.calcular(1200, 4);
        Emprestimo.calcular(1200, 5);

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);

        // Quadrilátero com return
        System.out.println("Exercício quadrilátero com return");
        double areaQuadrado = QuadrilateroRetorn.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorn.area(5, 5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorn.area(7, 8, 9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }

}
