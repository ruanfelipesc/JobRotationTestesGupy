import java.util.Scanner;

public class Fibonacci {
//    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a
//    soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa
//    na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne
//    uma mensagem avisando se o número informado pertence ou não a sequência.
//    IMPORTANTE:
//    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente
//    definido no código;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numInserido = scanner.nextInt();

//        int F = 0;     // atual
//        int ant = 0;   // anterior
//        for (int i = 1; i <= n; i++) {
//            if (i == 1) {
//                F = 1;
//                ant = 0;
//            } else {
//                F += ant;
//                ant = F - ant;
//            }
//
//        }

        int numFibonacci = 0, numAnterior = 0;
        for(int i=1; i<=numInserido;i++){
            if(numInserido == numFibonacci){
                System.out.println("O número pertence a sequência Fibonacci!");
                break;
            } else {
                if(i == 1){
                    numFibonacci = 1;
                    numAnterior = 0;

                }else{
                    numFibonacci += numAnterior;
                    numAnterior = numFibonacci - numAnterior;
                }
            }
            if( i == numInserido && numInserido != numFibonacci) {
                System.out.println("O número NÂO pertence a sequência Fibonacci");
            }
        }


    }
}
