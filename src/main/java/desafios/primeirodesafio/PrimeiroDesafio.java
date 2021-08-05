package desafios.primeirodesafio;

//        Desafio
//        Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida,
//        calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz,
//        conforme ilustrado abaixo (área verde).
//
//        https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1190.png
//
//        Entrada
//        A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou
//        Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem
//        a matriz.
//
//        Saída
//        Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
//

import java.io.IOException;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] Matriz = new double[12][12];
        for (int linha = 0; linha<= Matriz.length -1;linha++) {
            for (int coluna = 0; coluna<= Matriz[linha].length -1; coluna++) {
                Matriz[linha][coluna] = leitor.nextDouble();
            }
        }

        for (int linha = 0; linha<= Matriz.length -1;linha++) {
            for (int coluna = 0; coluna<= Matriz[linha].length -1; coluna++) {
                if (coluna > linha && coluna > Matriz.length -linha - 1) soma += Matriz[linha][coluna];
            }
        }

        if (O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }
}
