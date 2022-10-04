package DesafiosdeCodigoIntermediarioJava;

/*
Desafio 3
Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual a num cuja
soma de dígitos é par. A soma dos dígitos de um inteiro positivo é a soma de todos os seus dígitos.
*/

import java.util.*;

public class ContandoNumerosPares {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int count = 0;

        for (int i = 1; i <= num; i++) {
            String strNum = String.valueOf(i);
            if (strNum.length() == 1) {
                if (i % 2 == 0) {
                    count++;
                }
                continue;
            }
            char[] vs = strNum.toCharArray();
            int sum = 0;
            for (int j = 0; j < vs.length; j++) {
                sum += (int) Character.getNumericValue(vs[j]);
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
