package metodojava;

public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double result = numero1 + numero2;
        System.out.println("A soma do " + numero1 + " mais " + numero2 + " é " + result);
    }

    public static void divisao(double numero1, double numero2) {

        double result = numero1 / numero2;
        System.out.println("A divisão do " + numero1 + " mais " + numero2 + " é " + result);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double result = numero1 * numero2;
        System.out.println("A multiplicação do " + numero1 + " mais " + numero2 + " é " + result);
    }

    public static void subtracao(double numero1, double numero2) {

        double result = numero1 - numero2;
        System.out.println("A subtração do " + numero1 + " mais " + numero2 + " é " + result);
    }
}
