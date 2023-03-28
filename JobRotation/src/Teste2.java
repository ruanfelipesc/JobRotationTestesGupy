import java.util.Scanner;

public class Teste2 {
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
        int num = scanner.nextInt();

        int numFibonacci = 1, numAnterior = 0;
        for(int i=1; i<=num;i++){
            if(i == 0){
                 numFibonacci = 1;
                 numAnterior = 0;
            }else{
                numFibonacci += numAnterior;
                numAnterior = numFibonacci - numAnterior;
            }
            if(num==numFibonacci){
                System.out.println("O número pertence a sequência Fibonacci!");
            }else{
                System.out.println("O número NÃO pertence a sequência Fibonacci!");
                break;
            }
        }
    }
}
